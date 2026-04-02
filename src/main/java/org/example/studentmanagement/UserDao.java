package org.example.studentmanagement;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
    User getUser(int id);
    User addUser(User user);
    User updateUser(User user);
    void deleteUser(int id);
}
