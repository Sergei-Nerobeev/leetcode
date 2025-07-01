package leetcode.livecoding.groupwithx;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("GroupChecker Test")
public class GroupCheckerTest {

  private static List<Group> groups;
  private static User user;
  private static GroupChecker groupChecker;

  @BeforeAll
  static void setUp() {
  groups = Arrays.asList(new Group("Xenon"), new Group("Dark"));
  user = new User("John",groups);

  }

  @Test
  @DisplayName("Should return false when user or group null")
  public void is_User_Or_Group_Null_test() {

  }
}
