package com.yalle1.java14;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int month = 1;
        switch (month){
            case 1,3,5,7,8,10,12 -> System.out.println("This month has 31 days");
            case 4,6,9 -> System.out.println("This month has 30 days");
            case 2 -> System.out.println("This month has 29 days");
            default -> System.out.println("Invalid month");
        }

        int day1 = switch (month){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9 -> 30;
            case 2 -> 29;
            default -> 0;
        };

        System.out.println(day1);

    }
}
