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

    // метод ищет юзера в группах, возвращает правда если название группы начинается с "Х", если нет ложь
    public boolean isGroupWithX(List<Group> groupsToCheck) {
        // проверка на null
        if (!isGroupNull(groupsToCheck) || !isGroupsContainsNull(groupsToCheck)) {
            for (Group filteredGroup : groupsToCheck) {
                if (filteredGroup.getTitle().startsWith("X")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isGroupNull(List<Group> groupsToCheck) {
        return groupsToCheck != null;
    }

    private boolean isGroupsContainsNull(List<Group> groupsToCheck) {
        for (Group filteredGroup : groupsToCheck) {
            if (filteredGroup != null) {
                return true;
            }
        }
        return false;
    }

}
