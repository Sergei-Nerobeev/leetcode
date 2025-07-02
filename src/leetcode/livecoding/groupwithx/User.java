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
    public boolean isGroupWithX(List <Group> groupsToCheck) {
        // проверка на null
        if (groupsToCheck == null) {
            throw new IllegalArgumentException("Group is null!");
        }
        // перебор групп
        for (Group filteredGroup : groupsToCheck) {
            if (groupsToCheck.toString().startsWith("X")) {
                return true;
            }
        }
        return false;
    }


}
