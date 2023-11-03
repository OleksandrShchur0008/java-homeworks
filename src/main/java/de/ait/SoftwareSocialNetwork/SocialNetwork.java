package de.ait.SoftwareSocialNetwork;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.Objects.hash;

public class SocialNetwork {

    private static final Logger LOGGER = LoggerFactory.getLogger(SocialNetwork.class);

    private Map<Integer, User> users;

    private Map<Integer, Group> groups;

    private List<Post> posts;

    public User registerUser(int userId, String userName) {
        if (userName == null) {
            LOGGER.error("User name is null");
            return null;
        }
        for (Map.Entry<Integer, User> user : users.entrySet()) {
            if (user.getKey().equals(userId)) {
                LOGGER.error("This user already exists");
                return null;
            }
        }

        User newUser = new User(userId, userName);
        users.put(userId, newUser);
        LOGGER.info("User {} has been registered successfully", userName);
        return newUser;
    }

    public Group createGroup(int groupId, String groupName) {
        if (groupName == null) {
            LOGGER.error("Group name is null");
            return null;
        }
        for (Map.Entry<Integer, Group> group : groups.entrySet()) {
            if (group.getKey().equals(groupId)) {
                LOGGER.error("This group already exists");
                return null;
            }
        }

        Group newGroup = new Group(groupId, groupName);
        groups.put(groupId, newGroup);
        LOGGER.info("Group with name {} has been created successfully", groupName);
        return newGroup;
    }

    public void createPost(User author, String content) {
        if(author == null && content == null) {
            LOGGER.error("Author or content is null");
        } else {
            int key = hash(content);
            Post newPost = new Post(key, content, author);
            posts.add(newPost);
            LOGGER.info("Post has been added successfully, author {}", author);
        }
    }
}
