package leetcode.livecoding.groupwithx;

public class Group {
    private String title;
    private User user;

    public void setTitle(String title,User user) {
        this.title = title;
        this.user = user;
    }

    public Group(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addUserInGroup(User user, Group group) {
        group.setUser(user);
    }
}
