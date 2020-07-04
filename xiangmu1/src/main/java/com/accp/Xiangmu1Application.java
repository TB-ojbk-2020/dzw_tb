package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.accp.dao")
public class Xiangmu1Application {

	public static void main(String[] args) {
		SpringApplication.run(Xiangmu1Application.class, args);
	}

}
