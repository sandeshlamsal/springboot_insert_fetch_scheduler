package com.example.springboot_insert_fetch_scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class SpringbootInsertFetchSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInsertFetchSchedulerApplication.class, args);
	}

}
