package com.java.models.Dao.imp;

import com.java.domaine.Course;
import com.java.models.Dao.Dao;

import java.util.List;

public class CourseDao implements Dao<Course> {
    @Override
    public boolean save(Course item) {
        return false;
    }

    @Override
    public boolean saveAll(List<Course> item) {
        return false;
    }

    @Override
    public Course getByID(int id) {
        return null;
    }

    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public boolean update(Course olditem,Course item) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
