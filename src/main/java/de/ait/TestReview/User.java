package de.ait.TestReview;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private int age;
    private List<User> friendsList;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
        this.friendsList = new ArrayList<>();
    }

    public void addFriend(User newFriend) {
        for (User friend : friendsList) {
            if (friend.equals(newFriend)) {
                throw new IllegalArgumentException("The user with this name already exists");
            }
        }
        friendsList.add(newFriend);
    }

    public void removeFriend(User name) {
        friendsList.remove(name);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String newName) {
        this.userName = newName;
    }

    public int getUserAge() {
        return age;
    }

    public void setUserAge(int newAge) {
        age = newAge;
    }

    public List<User> getUsersList() {
        return friendsList;
    }
}
