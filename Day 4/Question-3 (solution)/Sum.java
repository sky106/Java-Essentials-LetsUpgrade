//Day 4 Question 3

package com.day4;
import java.util.Scanner;

public class Sum {

    Scanner sc = new Scanner(System.in);

    int[] num = new int[5];
    int sum = 0;

    public void getNumbers(){

        System.out.println("Enter Five Numbers(Integers only) : ");
        for(int i = 0; i < 5; i++){
            num[i]=sc.nextInt();
        }
    }

    public void displaySum(){

        System.out.println("The Sum of All Numbers Are: ");
        for(int i = 0; i < 5; i++) {

            sum = sum + num[i];
        }
        System.out.println(sum);

    }
}

