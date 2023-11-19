package com.example.HamRom;


import jakarta.persistence.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
@ComponentScan(basePackages = "com.example.HamRom")
@EnableAutoConfiguration
public class HamRomApplication {

	public static void main(String[] args) {
		SpringApplication.run(HamRomApplication.class, args);




	}

}
