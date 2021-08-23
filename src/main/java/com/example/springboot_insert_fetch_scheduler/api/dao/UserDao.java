package com.example.springboot_insert_fetch_scheduler.api.dao;

import com.example.springboot_insert_fetch_scheduler.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
