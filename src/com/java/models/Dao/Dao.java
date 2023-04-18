package com.java.models.Dao;

import com.java.domaine.User;

import java.util.List;

public interface Dao<T> {
    /*
     * Create => Save
     * */
    boolean save(T item);
    boolean saveAll(List<T> item);
    /*
     * Read
     * */
    T getByID(int id);
    List<T> getAll();
    /*
     * Update
     * */
    boolean update(T oldIten,T item);
    /*
     * Delete
     * */
    boolean delete(int id);
}
