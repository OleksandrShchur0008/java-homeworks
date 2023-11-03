package de.ait.SoftwareSocialNetwork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private static final Logger LOGGER = LoggerFactory.getLogger(User.class);

    private int id;

    private String name;

    private List<User> friends;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public boolean addFriend(User newFriend) {
        if (newFriend == null) {
            LOGGER.error("Friend is null");
            return false;
        }
        if (!friends.contains(newFriend) && !newFriend.equals(User.this)) {
            friends.add(newFriend);
            LOGGER.info("Friend {} has been added successfully", newFriend.getName());
            return true;
        } else {
            LOGGER.error("Unreachable movement.");
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getFriends() {
        List<User> friendsCopy = new ArrayList<>(friends);
        LOGGER.info("List of users friends has been requested");
        return friendsCopy;
    }
}
