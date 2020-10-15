//Day 4 Question 1

package com.day4;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n!!!______________Welcome To The Avenger's World______________!!!");

        Avenger[] avengers = new Avenger[5];

        for (int i = 0; i < 5; i++) {
            avengers[i] = new Avenger();
        }

        for (int i = 0; i < 5; i++) {

            System.out.println("\n*____________"+(i+1)+".Enter The Avenger's Details____________*\n");
            avengers[i].getDetails();
            System.out.println("\n*____________"+(i+1)+".Avenger's Details____________*\n");
            avengers[i].displayDetails();
        }

    }
}
