package leetcode.livecoding.groupwithx;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("GroupChecker Test")
public class GroupCheckerTest {

    List<Group> groups;
    User userOne = new User("John", groups);
    User userTwo = new User("Kate", groups);
    Group groupOne = new Group("Xenon");
    Group groupTwo = new Group("Zero");

    @BeforeEach
    void setUp() {


        groupOne.setUser(userOne);
        groupTwo.setUser(userTwo);
        groups.add(groupOne);
        groups.add(groupTwo);
    }

    @Test
    @DisplayName("Should return false when user or group null")
    public void is_User_Null_test() {
        //act
        userOne.isGroupWithX(null);
        //assertions
        assertThrows(User.class,)
    }
}
