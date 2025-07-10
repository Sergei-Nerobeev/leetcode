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
    public boolean isGroupWithX(List<Group> groupsToCheck) {
        // проверка на null
        if (groupsToCheck == null) {
            throw new IllegalArgumentException("List of groups contains null.");
        }
        for (Group filteredGroup : groupsToCheck) {
            if (filteredGroup == null) {
                throw new IllegalArgumentException("Group contains null.");
            }
            if (filteredGroup.getTitle() == null) {
                throw new IllegalArgumentException("Title of group contains null.");

            }
            if (filteredGroup.getTitle().startsWith("X")) {
                return true;
            }
        }
        return false;
    }


}
