package leetcode.livecoding.groupwithx;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

@DisplayName("GroupChecker Test")
public class GroupCheckerTest {

    private static List<Group> groups;

    @BeforeAll
    static void setUp() {
        User userOne = new User("John", groups);
        User userTwo = new User("Kate", groups);
        Group groupOne = new Group("Xenon");
        Group groupTwo = new Group("Zero");
        groupOne.setUser(userOne);
        groupTwo.setUser(userTwo);
        groups.add(groupOne);
        groups.add(groupTwo);


    }

    @Test
    @DisplayName("Should return false when user or group null")
    public void is_User_Null_test() {

    }
}
