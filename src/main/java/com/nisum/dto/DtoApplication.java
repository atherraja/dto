package com.nisum.dto;

import com.nisum.dto.entities.Location;
import com.nisum.dto.entities.User;
import com.nisum.dto.repositories.LocationRepository;
import com.nisum.dto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("Karachi");
		location.setDescription("karachi is great place for earning");
		location.setLongitude(45.5);
		location.setLatitude(35.6);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Muhammad");
		user1.setLastName("Ather");
		user1.setEmail("learnc89@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Asad Iqbal");
		user2.setLastName("Rasheed");
		user2.setEmail("asadiqbal@gmail.com");
		user2.setPassword("babies");
		user2.setLocation(location);
		userRepository.save(user2);


	}
}
