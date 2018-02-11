package com.kshrd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.kshrd.repsitory.StudentRepsitory;

@SpringBootApplication
@EnableScheduling
public class JpaHibernateDemoApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateDemoApplication.class, args);
	}

	@Autowired
	StudentRepsitory studentService;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		
	}
	
	//@Scheduled(fixedDelay = 3000, initialDelay = 5000)
	@Scheduled(cron = "0 * * * * ?")
	public void runProcess(){
		System.out.println("Working...");
	}
	
	
}
