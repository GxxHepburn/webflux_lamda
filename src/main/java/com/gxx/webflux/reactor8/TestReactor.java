package com.gxx.webflux.reactor8;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author gxx
 * @create 2021-07-28 22:02
 */
public class TestReactor {

    public static void main(String[] args) {
        Flux.just(1, 2, 3, 4).subscribe(System.out::print);
        Mono.just(1).subscribe(System.out::print);

//        Integer[] array = {1, 2, 3, 4};
//        Flux.fromArray(array);
//
//        List<Integer> list = Arrays.asList(array);
//        Flux.fromIterable(list);
//
//        Stream<Integer> stream = list.stream();
//        Flux.fromStream(stream);
    }
}
