package com.java.models.DB;

import com.java.domaine.User;

import java.util.ArrayList;
import java.util.List;

public class DB {
    private List<User> userTable=new ArrayList<User>();

    public List<User> getUserTable() {
        return userTable;
    }
}
