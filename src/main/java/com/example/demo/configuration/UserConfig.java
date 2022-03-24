package com.example.demo.configuration;

import com.example.demo.entity.AppUser;
import com.example.demo.entity.Role;
import com.example.demo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserService userService) {
        return args -> {
            userService.addRole(new Role(1, "ROLE_USER"));
            userService.addRole(new Role(2, "ROLE_ADMIN"));
            userService.addRole(new Role(3, "ROLE_MANAGER"));
            userService.addRole(new Role(4, "ROLE_SUPER_ADMIN"));

            userService.addUser(new AppUser(1, "Zarr Soufiane", "souf", "1234", new ArrayList<>()));
            userService.addUser(new AppUser(2, "haho khalid", "khal", "1234", new ArrayList<>()));
            userService.addUser(new AppUser(3, "hihi Ziko", "ziko", "1234", new ArrayList<>()));
            userService.addUser(new AppUser(4, "Zozo Zizi", "zizi", "1234", new ArrayList<>()));

            userService.addRoleToUser("souf", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("souf", "ROLE_USER");
            userService.addRoleToUser("souf", "ROLE_ADMIN");
            userService.addRoleToUser("souf", "ROLE_MANAGER");
            userService.addRoleToUser("khal", "ROLE_USER");
            userService.addRoleToUser("ziko", "ROLE_MANAGER");
            userService.addRoleToUser("zizi", "ROLE_ADMIN");
        };
    }
}
