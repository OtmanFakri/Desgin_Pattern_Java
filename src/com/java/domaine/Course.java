package com.java.domaine;

import java.util.Objects;



/*
*
* CRUD
* ya ima Repository
* ya ima Dao
* */
public class Course {
    private int courseID;
    private String courcesTitle;
    private int prix;

    public Course() {
    }

    public Course(int courseID, String courcesTitle, int prix) {
        this.courseID = courseID;
        this.courcesTitle = courcesTitle;
        this.prix = prix;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourcesTitle() {
        return courcesTitle;
    }

    public void setCourcesTitle(String courcesTitle) {
        this.courcesTitle = courcesTitle;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courcesTitle='" + courcesTitle + '\'' +
                ", prix=" + prix +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getCourseID() == course.getCourseID() && getPrix() == course.getPrix() && getCourcesTitle().equals(course.getCourcesTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseID(), getCourcesTitle(), getPrix());
    }
}
