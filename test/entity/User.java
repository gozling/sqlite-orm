package entity;

import com.gaozl.sqlite.annotation.AutoIncrement;
import com.gaozl.sqlite.annotation.PrimaryKey;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaozl Create by 2017/12/18
 */
public class User {
    @AutoIncrement
    @PrimaryKey
    private long id;
    private String name;
    private String password;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}