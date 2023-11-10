package de.ait.TestReview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User testUser;

    @BeforeEach
    public void setUp() {
        testUser = new User("Friend", 32);
    }

    @Test
    void testGetName() {
        assertEquals("Friend", testUser.getUserName());
    }

    @Test
    void testSetName() {
        testUser.setUserName("FRIEND");
        assertEquals("FRIEND", testUser.getUserName());
    }

    @Test
    void testGetAge() {
        assertEquals(32, testUser.getUserAge());
    }

    @Test
    void testSetAge() {
        testUser.setUserAge(64);
        assertEquals(64, testUser.getUserAge());
    }

    @Test
    void testAddUserHappyPath() {
        assertEquals(0, testUser.getUsersList().size());
        testUser.addFriend(testUser);
        assertEquals(1, testUser.getUsersList().size());

        List<User> resultListUser = testUser.getUsersList();
        for (User friend : resultListUser) {
            assertEquals(testUser, friend);
        }
    }

    @Test
    void testAddUserFail() {
        assertEquals(0, testUser.getUsersList().size());
        testUser.addFriend(testUser);
        assertThrows(IllegalArgumentException.class, () -> {testUser.addFriend(testUser);});
    }

    @Test
    void testRemoveUserHappyPath() {
        testUser.addFriend(testUser);
        assertEquals(1, testUser.getUsersList().size());
        testUser.removeFriend(testUser);
        assertEquals(0, testUser.getUsersList().size());
    }
}