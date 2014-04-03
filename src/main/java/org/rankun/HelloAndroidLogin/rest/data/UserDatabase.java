package org.rankun.HelloAndroidLogin.rest.data;

import org.rankun.HelloAndroidLogin.rest.bean.User;

import java.util.*;


public class UserDatabase
{
    public static HashMap<Integer, User> users = new HashMap<Integer, User>();

    static
    {
        User user = new User();
        user.setId(1);
        user.setUsername("rankun203");
        user.setPassword("012345678");
        user.setUri("/api/users/1");
        user.setLastModified(new Date());
        users.put(1, user);
    }

    public static User getUserById(Integer id)
    {
        return users.get(id);
    }

    public static void updateUser(Integer id)
    {
        User user = users.get(id);
        user.setLastModified(new Date());
    }

    public static Date getLastModifiedById(Integer id)
    {
        return users.get(id).getLastModified();
    }

    public static boolean addUser(String username, String password) {
        User user = new User();

        int generatedId = users.size() + 1;

        user.setId(generatedId);
        user.setUsername(username);
        user.setPassword(password);
        user.setUri("/api/users/" + generatedId);
        user.setLastModified(new Date());
        users.put(generatedId, user);

        return users.size() == generatedId;
    }

    public static List<User> getAllUsers() {
        List<User> usersList = new LinkedList<User>();
        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            usersList.add(entry.getValue());
        }
        return usersList;
    }
}
