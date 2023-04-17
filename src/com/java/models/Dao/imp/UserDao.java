package com.java.models.Dao.imp;

import com.java.domaine.Course;
import com.java.domaine.User;
import com.java.models.DB.DB;
import com.java.models.Dao.Dao;

import java.util.List;

/*
* Connection to DB
* */

public class UserDao implements Dao<User> {

    private DB db =new DB();
    @Override
    public boolean save(User item) {
        return db.getUserTable().add(item);
    }

    @Override
    public boolean saveAll(List<User> items) {
        for(User user : items){
            save(user);
            return true;
        }
        return false;
    }

    @Override
    public User getByID() {
        return null;
    }

    @Override
    public List<User> getAll() {
        return db.getUserTable();
    }

    @Override
    public boolean update(User item) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
