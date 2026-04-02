package org.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    UserDao dao;
    List<User> getActiveUsers(){
        List<User> users=dao.getAllUser();
        List<User> activeUser=users.stream()
                .filter(user -> user.active())
                .toList();
        return activeUser;
    }


}
