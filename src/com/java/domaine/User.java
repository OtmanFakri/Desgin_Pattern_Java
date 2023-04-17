package com.java.domaine;

import java.util.Objects;

public class User {
    private int userID;
    private String userName;
    private String userEmail;

    public int getUserID() {
        return userID;
    }

    public User() {
    }

    public User(int userID, String userName, String userEmail) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserID() == user.getUserID() && Objects.equals(getUserName(), user.getUserName()) && Objects.equals(getUserEmail(), user.getUserEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getUserName(), getUserEmail());
    }
}
