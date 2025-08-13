package leetcode.livecoding.groupwithx;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String name;
    private final List<Group> groups;

    public User(String name) {
        this.name = name;
        this.groups = new ArrayList<>();
    }

    // метод возвращает правда если название группы начинается с "Х", если нет ложь
//    public boolean isGroupWithX(List<Group> groupsToCheck) {
//        npeCheck(groupsToCheck);
//        for (Group filteredGroup : groupsToCheck) {
//            if (filteredGroup.getTitle() == null && filteredGroup.getTitle().startsWith("X")) {
//                return true;
//            }
//            if (filteredGroup.getTitle().startsWith("X")) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private void npeCheck(List<Group> groupsToCheck) {
//        if (groupsToCheck == null || groupsToCheck.contains(null)) {
//            throw new IllegalArgumentException("NPE!");
//        }
//    }

    boolean isGroupWithX(List<Group> groups) {
        if (groups == null) {
            return false;  // точно не начинаются на Х
        }
        for (var group : groups) {
            if (group == null || group.getTitle() == null){
                continue; // группа не начинается на Х, но другие могут начинаться
            }

            if (group.getTitle().startsWith("X")) {
                return true;
            }
        }
        return false; // если дошли до сюда - никакие группы точно не начинаются на Х
    }
}
