package com.gaozl.sqlite;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author gaozl Create by 2017/12/19
 */
public class CreateTable {

    private final Connection connection = DataConnManager.getConnection();

    static {
        DataConnManager.init("test/test.db");
    }

    public void createUser() {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("drop table if exists user;");
            statement.executeUpdate(
                    "create table user(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,name VARCHAR(200),password VARCHAR(200),data TEXT);");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createFission() {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("drop table if exists fisson;");
            statement.executeUpdate(
                    "create table fisson(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,groupNickName VARCHAR(200),inviteNickName VARCHAR(200),beInvitedNickName VARCHAR(200));");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CreateTable createTable = new CreateTable();
        createTable.createUser();
    }
}
