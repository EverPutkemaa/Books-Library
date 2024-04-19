package com.example.Book.BookLibrary;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication
public class BookLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookLibraryApplication.class, args);
	}



}
