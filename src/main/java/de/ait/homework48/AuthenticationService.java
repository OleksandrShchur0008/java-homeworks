package de.ait.homework48;

import de.ait.homework48.Exceptions48.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class AuthenticationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationService.class);
    private List<User> registeredUsers;

    public AuthenticationService(List<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public void addUser(User newUser) {
        if (!registeredUsers.contains(newUser)) {
            LOGGER.info("User {}, has successfully registered.", newUser.getUsername());
            registeredUsers.add(newUser);
        } else {
            LOGGER.error("{}, already exist in database.", newUser.getUsername());
        }
    }

    public void authenticate(String username, String password) {
        try {
            for (User user : registeredUsers) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return;
                }
            }
            throw new AuthenticationException();
        } catch (AuthenticationException authenticationException) {
            LOGGER.error("Authentication failed.");
        }
    }
}
