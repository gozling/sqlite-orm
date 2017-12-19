package com.gaozl.sqlite;

import com.google.common.collect.Lists;
import entity.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author gaozl Create by 2017/12/18
 */
public class TestSatatement {

    @Test
    public void testSelect() throws DataConnException {
        createUser("Nick");
        User u = SqlStatement.select(User.class).getList().get(0);

        assertEquals("Nick", u.getName());
        System.out.println(u);

        deleteUser(u);
    }

    public void deleteUser(User user) throws DataConnException {
        SqlStatement.delete(user).execute();
    }

    public void createUser(String name) throws DataConnException {
        DataConnManager.init("test/test.db");
        User user = new User();
        user.setName(name);
        user.setPassword("123456");
        user.setData(Lists.newArrayList("aaa"));
        SqlStatement.save(user).execute();
    }
}
