package com.yalle1.java10;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OrElseThrowDemo {

    public static void main(String[] args) {

        Optional<String> str = Optional.empty();

        // System.out.println(str.get());

        if (str.isPresent()){
            System.out.println(str.get());
        } else {
            throw new NoSuchElementException("Empty String");
        }

        // or

        System.out.println(str.orElseThrow(RuntimeException::new));

    }
}
