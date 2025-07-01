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
    boolean isGroupWithX(User user) {
        // проверка на null
        if (user == null) {
            throw new IllegalArgumentException("User is null!");
        }
        // перебор групп
        for (Group group : user.groups) {
            if (group.toString().startsWith("X")) {
                return true;
            }
        }
        return false;
    }


}
