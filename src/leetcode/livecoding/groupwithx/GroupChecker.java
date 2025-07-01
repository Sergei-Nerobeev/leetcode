package leetcode.livecoding.groupwithx;

public class GroupChecker {
  // метод ищет юзера в группах, возвращает правда если название группы начинается с "Х", если нет ложь
  boolean isGroupWithX(User user) {
    // проверка на null
    if(user == null || user.groups() == null){
      throw new IllegalArgumentException("User or groups are null!");
    }
    // перебор групп
    for (Group group : user.groups()) {
      if (group.toString().startsWith("X")) {
        return true;
      }
    }
    return false;
  }
}
