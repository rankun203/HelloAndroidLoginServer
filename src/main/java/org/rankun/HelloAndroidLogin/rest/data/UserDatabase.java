package org.rankun.HelloAndroidLogin.rest.data;

import org.rankun.HelloAndroidLogin.rest.bean.User;

import java.util.Date;
import java.util.HashMap;


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
}
