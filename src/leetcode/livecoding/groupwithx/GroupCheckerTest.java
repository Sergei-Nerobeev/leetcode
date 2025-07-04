package leetcode.livecoding.groupwithx;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("GroupChecker method Test")
class GroupCheckerTest {

  List<Group> groups = new ArrayList<>();
  User userOne;
  User userTwo;
  Group xenon;
  Group delta;
  Group zero;
  Group groupNull;

  @BeforeEach
  void setUp() {
    userOne = new User("John");
    userTwo = new User("Kate");
    xenon = new Group("Xenon");
    delta = new Group("Delta");
    zero = new Group("Zero");
    xenon.setUser(userOne);
    zero.setUser(userTwo);
    groups.add(xenon);
    groups.add(zero);
    groups.add(groupNull);
  }

  @Test
  @DisplayName("Should return false when title of group starts with X.")
  void isGroupWithXReturnFalse_test() {
    //arrange
    List<Group> checkList = Arrays.asList(delta, zero);
    //act
    var result = userOne.isGroupWithX(checkList);
    //assertions
    assertFalse(result);
  }

  @Test
  @DisplayName("Should return true when title of group starts with X.")
  void isGroupWithXReturnTrue_test() {
    //arrange
    List<Group> checkList = Arrays.asList(xenon, zero);
    //act
    var result = userOne.isGroupWithX(checkList);
    //assertions
    assertTrue(result);
  }

  @Test
  @DisplayName("Should return false when group is null.")
  void isGroupNull_test() {
    //arrange
    List<Group> checkList = Arrays.asList(xenon, zero, groupNull);
    //act
    var result = userOne.isGroupWithX(checkList);
    //assertions
    assertTrue(result);
  }
}
