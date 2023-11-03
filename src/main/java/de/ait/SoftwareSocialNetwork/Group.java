package de.ait.SoftwareSocialNetwork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Group {

    private static final Logger LOGGER = LoggerFactory.getLogger(Group.class);

    private int id;

    private String name;

    private Set<User> members;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        this.members = new HashSet<>();
    }

    public boolean addMember(User user) {
        if (user == null) {
            LOGGER.error("Member is null");
            return false;
        }
        if (!members.contains(user)) {
            LOGGER.info("Member {} has been added  in group successfully", user.getName());
            return members.add(user);

        }
        LOGGER.error("Unreachable movement");
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id;
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

    public Set<User> getMembers() {
        Set<User> membersCopy = new HashSet<>(members);
        LOGGER.info("List of members in group has been requested");
        return membersCopy;
    }
}
