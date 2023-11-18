package com.example.HamRom;

import com.example.HamRom.entity.ClientType;
import jakarta.persistence.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static jakarta.persistence.EnumType.STRING;

@ComponentScan(basePackages = "com.example.HamRom")
@SpringBootApplication
public class HamRomApplication {

	public static void main(String[] args) {
		SpringApplication.run(HamRomApplication.class, args);



	}

}
