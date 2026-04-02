package org.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class SqliteUserDao implements UserDao{

@Autowired
    Connection conn;

    @Override
    public List<User> getAllUser() {
        List<User> users=new ArrayList<>();


        try {
            Statement smt=conn.createStatement();
            System.out.println("From User DB");
            String sql="SELECT * FROM users";
            ResultSet rs= smt.executeQuery(sql);
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String email=rs.getString("email");
                boolean active=rs.getBoolean("active");


                User user=new User(id,"name","email",active);
                users.add(user);
                System.out.println("USER ID::"+rs.getInt("id")+
                        "   USER NAMES::"+rs.getString("name")+
                        "STATUS::::"+rs.getBoolean("active"));
            }
            rs.close();
            smt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    @Override
    public User getUser(int id) {
        User user=null;
        String sql="SELECT * FROM users WHERE id=?";
        try{
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setInt(1,id);
            ResultSet rs= stmt.executeQuery();
            if(rs.next()){
                String name=rs.getString("name");
                String email=rs.getString("email");
                boolean active= rs.getBoolean("active");
                stmt.close();
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
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
