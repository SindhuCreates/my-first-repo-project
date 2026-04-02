package org.example.studentmanagement;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
//@Component
public class InMemoryUserDao implements UserDao{
    List<User> userList=new ArrayList<>();

    public InMemoryUserDao() {
        userList.add(new User(1,"Alice","alice@gmail.com",true));
        userList.add(new User(2,"Ilan","ilan@gmail.com",false));
        userList.add(new User(3,"Sindhu","sindhu@gmail.com",true));
        userList.add(new User(1,"Karthik","karthik@gmail.com",false));
    }

    @Override
    public List<User> getAllUser() {
        return userList;
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
