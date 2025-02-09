package com.runnerz_spring_boot.runnerz;

import com.runnerz_spring_boot.runnerz.Run.Location;
import com.runnerz_spring_boot.runnerz.Run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class RunnerApplication {

	private static final Logger log = LoggerFactory.getLogger(RunnerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plusHours(5), 5, Location.OUTDOOR);
			log.info("Run : " + run);
		};
	}

}
