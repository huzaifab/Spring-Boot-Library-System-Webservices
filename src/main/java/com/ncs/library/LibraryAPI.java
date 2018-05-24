package com.ncs.library;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryAPI {
	/*
	 * This is main method which will Boot on startup and it will load controller
	 */
	public static void main(String[] args) {
		SpringApplication.run(LibraryAPI.class, args);
	}
}
