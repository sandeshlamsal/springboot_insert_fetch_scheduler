package com.example.springboot_insert_fetch_scheduler.api.service;

import com.example.springboot_insert_fetch_scheduler.api.dao.UserDao;
import com.example.springboot_insert_fetch_scheduler.api.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class UserService {
    @Autowired
    private UserDao dao;

    //Adding logger
    Logger logger= LoggerFactory.getLogger(UserService.class);

    //schedule a job to add object in db , every 5 sec
    @Scheduled(fixedRate = 5000)
    public void addToDb(){
        User user=new User();
        user.setName("User"+new Random().nextInt(374483));
        dao.save(user);
        System.out.println("User Add service called"+new Date());
    }

    //fetch record from db in each 15 sec
    // @Scheduled(fixedRate = 15000) or can use cron job as well

    @Scheduled(cron="0/15 * * * * *")
    public void fetchFromDb(){
        List<User> users=dao.findAll();
        System.out.println("User Fetch service called"+new Date());
        System.out.println("No of user" +users.size());
        logger.info("Users {} "+users);
    }
}
