package com.devsuperior.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	

}



/*

EXEMPLO PARA TESTAR O HASH DE SENHA PARA O BANCO, SENHA: 123456
 HASH DO ALGORITMO BCRYPT $2a$10$7iw7W9M9lJZRr5u6ZfkL..waksjr27DKFdYKczo/LkCU6veHavbAS

 
 -------------------
 
 @SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	// injetando uma instancia do passwordencoder
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\nENCODE = " + passwordEncoder.encode("123456"));
		
		boolean result = passwordEncoder.matches("123456", "$2a$10$7iw7W9M9lJZRr5u6ZfkL..waksjr27DKFdYKczo/LkCU6veHavbAS");
		
		System.out.println("\nRESULTADO = " + result);
	}

}



*/