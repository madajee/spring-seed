package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        log.info("********Start Logging From Main Method******");
        log.info("********Hello Spring Boot Seed******");
        log.info("********End Logging From Main Method********");
    }

    public String convertToUpperCase (String str){
 	   return str.toUpperCase();
	}
}