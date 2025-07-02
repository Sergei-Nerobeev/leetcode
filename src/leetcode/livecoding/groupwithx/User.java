package leetcode.livecoding.groupwithx;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String name;
    private final List<Group> groups;

    public User(String name, List<Group> groups) {
        this.name = name;
        this.groups = new ArrayList<>();
    }

    // метод ищет юзера в группах, возвращает правда если название группы начинается с "Х", если нет ложь
    boolean isGroupWithX(Group groupToCheck) {
        // проверка на null
        if (groupToCheck == null) {
            throw new IllegalArgumentException("User is null!");
        }
        // перебор групп
        for (Group filteredGroup : groups) {
            if (groupToCheck.toString().startsWith("X")) {
                return true;
            }
        }
        return false;
    }


}
