package com.cui.phs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cui.phs.mapper")
public class PetHospitalSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetHospitalSystemApplication.class, args);
	}
}
