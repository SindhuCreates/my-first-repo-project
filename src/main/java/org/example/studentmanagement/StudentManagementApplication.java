package org.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


@SpringBootApplication

public class StudentManagementApplication implements CommandLineRunner {
    @Autowired
    String message;
    @Autowired
     UserService userService;

    ApplicationContext ctx;

    public StudentManagementApplication(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public static void main(String[] args) {

        SpringApplication.run(StudentManagementApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        for(User u: userService.getActiveUsers()){
            System.out.println("IN VOID RUN:: "+u);
        }

                System.out.println(message);


//        UserDao dao=ctx.getBean(UserDao.class);
//        for(User u: dao.getAllUser()){
//            System.out.println("DAO::::"+u);
//        }
    }
    }


