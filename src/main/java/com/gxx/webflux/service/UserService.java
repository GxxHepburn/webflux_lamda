package com.gxx.webflux.service;

import com.gxx.webflux.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author gxx
 * @create 2021-07-28 22:35
 */
public interface UserService {

    Mono<User> getUserById(int id);

    Flux<User> getAllUser();

    Mono<Void> saveUserInfo(Mono<User> user);
}
