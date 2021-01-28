package com.spring.react;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.react.model.User;
import com.spring.react.repository.UserRepository;

@SpringBootApplication
public class SpringbootReactAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactAppApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Torie", "Rustman", "1234567890"));
		this.userRepository.save(new User("Kordula", "Gecks", "1265656556"));
		this.userRepository.save(new User("Vikki", "Simoens", "7564423423"));
		this.userRepository.save(new User("Burnaby", "Cowern", "64574323223"));
		this.userRepository.save(new User("Teddie", "Traice", "32232323232"));
		this.userRepository.save(new User("Louella", "Carlill", "89898989898"));
		
	}

}
