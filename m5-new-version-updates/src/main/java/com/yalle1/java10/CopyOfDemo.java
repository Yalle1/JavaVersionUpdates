package com.yalle1.java10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {


        List<Integer> numberList = Arrays.asList(2,4,6,8);


        List<Integer> unmodifiableList = List.copyOf(numberList);
        List<Integer> unmodifiableList2 = List.of(1,2,3,4,5);

    }
}
