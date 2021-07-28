package com.gxx.webflux.controller;

import com.gxx.webflux.entity.User;
import com.gxx.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author gxx
 * @create 2021-07-28 22:44
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public Mono<User> getUserId(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/user")
    public Flux<User> getUsers() {
        return userService.getAllUser();
    }

    @PostMapping("/svaeuser")
    public Mono<Void> saveUser(@RequestBody User user) {
        Mono<User> userMono = Mono.just(user);
        return userService.saveUserInfo(userMono);
    }
}
