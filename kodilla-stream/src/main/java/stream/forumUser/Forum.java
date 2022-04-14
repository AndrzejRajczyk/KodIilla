package stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {

        ForumUser forumUser1 = new ForumUser(1, "Sheldon Cooper", 'M', 2000, 1, 10, 123);
        forumUserList.add(forumUser1);
        ForumUser forumUser2 = new ForumUser(2, "Penny Hofstadter", 'F', 2002, 12, 04, 832);
        forumUserList.add(forumUser2);
        ForumUser forumUser3 = new ForumUser(3, "Rajesh Koothrappali", 'M', 1991, 12, 10, 345);
        forumUserList.add(forumUser3);
        ForumUser forumUser4 =new ForumUser(4, "Amy Farrah Fowler", 'F', 1995, 11, 15, 234);
        forumUserList.add(forumUser4);
        ForumUser forumUser5 =new ForumUser(5, "Johnny Bravo", 'M', 2006, 12, 13, 0);
        forumUserList.add(forumUser5);

    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(forumUserList);
    }
}
