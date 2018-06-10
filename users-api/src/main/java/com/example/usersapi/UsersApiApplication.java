package com.example.usersapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class UsersApiApplication {

	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

//	public UsersApiApplication() {//UserRepository userRepository,
						  //BCryptPasswordEncoder bCryptPasswordEncoder) {
	//	this.userRepository = applicationUserRepository;
	//	this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//	}

//	@GetMapping("/users")
//	public Iterable<User> getAllUsers() {
//		return userRepository.findAll();
//	}
//
//	@GetMapping("/users/{userId}")
//	public Optional<User> getUserById(@PathVariable Long id) {
//		return userRepository.findById(id);
//	}
//
//	@GetMapping("/users/login/{userName}")
//	public Optional<User> getUserByName(@PathVariable String userName) {
//		return userRepository.findByUserName(userName);
//	}

	@RequestMapping("/")
	public String home() {
		return "some users";
	}

	public static void main(String[] args) {
		SpringApplication.run(UsersApiApplication.class, args);
	}
}
