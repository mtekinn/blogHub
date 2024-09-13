package model;

import model.enums.UserType;

public class User {
    private String name;
    private String email;
    private String password;
    private UserType userType;

    /*
    public User() {
        userType = UserType.STANDARD;
    }

    public User(UserType userType) {
        this.userType = userType;
    }
    */

    public User(String email, String password) {
        this.userType = UserType.STANDARD;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                '}';
    }
}
