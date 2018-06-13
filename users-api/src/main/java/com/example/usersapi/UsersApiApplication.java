package com.example.usersapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//@CrossOrigin(origins = "http://localhost:3000")
@SpringBootApplication
@EnableEurekaClient
@RestController
public class UsersApiApplication {
	private Logger log = LoggerFactory.getLogger(UsersApiApplication.class);

	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;

//	public UsersApiApplication() {//UserRepository userRepository,
						  //BCryptPasswordEncoder bCryptPasswordEncoder) {
	//	this.userRepository = applicationUserRepository;
	//	this.bCryptPasswordEncoder = bCryptPasswordEncoder;
//	}

	@GetMapping("/users")
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/users/{userId}")
	public User getUserById(@PathVariable Long userId) {
		return userRepository.findOne(userId);
	}

	@GetMapping("/users/login/{userName}")
	public User getUserByName(@PathVariable String userName) {
		return userRepository.findByUserName(userName);
	}

	@PostMapping("/users")
    public User createUser(@RequestBody User newUser) {
		User user = new User();

		try {
			user = userRepository.save(newUser);
		} catch (Exception e) {
			log.error("err--", e);
		}
	    return user;
    }

    @PutMapping("/users/{userId}")
	public User updateUser(@PathVariable Long userId, @RequestBody User requestUser) {
		User userFromDb = userRepository.findOne(userId);

		userFromDb.setEmail(requestUser.getEmail());
		userFromDb.setPassword(requestUser.getPassword());
		userFromDb.setUserName(requestUser.getUserName());
		return userRepository.save(userFromDb);
	}

	@RequestMapping("/")
	public String home() {
		return "some users";
	}

	public static void main(String[] args) {
		SpringApplication.run(UsersApiApplication.class, args);
	}
}
