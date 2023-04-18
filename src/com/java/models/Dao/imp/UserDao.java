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

    private DB db = new DB();

    @Override
    public boolean save(User item) {

        return db.getUserTable().add(item);
    }

    @Override
    public boolean saveAll(List<User> items) {
        for (User user : items) {
            save(user);
            return true;
        }
        return false;
    }

    @Override
    public User getByID(int id) {
        //return db.getUserTable().get(id);
        for (User user :getAll() ){
           if(user.getUserID() == id){
               return user;
           }
            return null;
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return db.getUserTable();
    }

    @Override
    public boolean update(User olditem,User item) {
        olditem.setUserName(item.getUserName());
        olditem.setUserEmail(item.getUserEmail());
        return true;
    }

    @Override
    public boolean delete(int id) {
        db.getUserTable().remove(getByID(id));
        return false;
    }
}
