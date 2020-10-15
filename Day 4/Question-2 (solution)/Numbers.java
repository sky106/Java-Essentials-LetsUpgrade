//Day 4 Question 2

package com.day4;
import java.util.Scanner;

public class Numbers {

    Scanner sc = new Scanner(System.in);

    int[] num = new int[5];

    public void getNumbers(){

        System.out.println("Enter Five Numbers(Integers only) : ");
        for(int i = 0; i < 5; i++){
            num[i]=sc.nextInt();
        }
    }

    public void displayOddNumbers(){

        System.out.println("The Odd Numbers Are : ");
        for(int i = 0; i < 5; i++)
        {
            if(num[i] % 2 != 0){
                System.out.println(num[i]);
            }
        }
    }
}
