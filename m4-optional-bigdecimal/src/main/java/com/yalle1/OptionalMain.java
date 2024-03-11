package com.yalle1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,4,2,10,23, 101);

        //empty() - isPresent()

        Optional<String> empty = Optional.empty();

        System.out.println(empty);
        System.out.println(empty.isPresent());


        number.stream().filter(p -> p>100).forEach(System.out::println);

        //ifPresent
        Optional<Integer> bigNumber = number.stream().filter(p -> p>100).findAny();
        bigNumber.ifPresent(System.out::println);

        //get
        System.out.println(bigNumber.get());

        //orElse
        System.out.println(bigNumber.orElse(5));

        System.out.println("---------------------------");

        Optional<Integer> optionalI = Optional.of(20);
        Optional<Integer> optional = Optional.empty();

//        if (optionalI.isPresent()){
//            System.out.println(optionalI.get());
//        }
//
//        if (optional.isPresent()){
//            System.out.println(optional.get());
//        }

        optionalI.ifPresent(x -> System.out.println(x));
        optional.ifPresent(x -> System.out.println(x));

        System.out.println("---------------------------");



    }
}
