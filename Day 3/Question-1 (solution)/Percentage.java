//Day 3 Question 1

package com.day3;
import java.util.Scanner;

public class Percentage {

    Scanner sc = new Scanner(System.in);
    float marks1,marks2,marks3,marks4,marks5;
    float percentage;

    public void getMarks(){

        System.out.println("__________________Welcome Students__________________");
        System.out.print("\nEnter the Marks for Marathi (Out of 100): ");
        marks1 = sc.nextFloat();
        System.out.print("Enter the Marks for Hindi (Out of 100): ");
        marks2 = sc.nextFloat();
        System.out.print("Enter the Marks for English (Out of 100): ");
        marks3 = sc.nextFloat();
        System.out.print("Enter the Marks for Science (Out of 100): ");
        marks4 = sc.nextFloat();
        System.out.print("Enter the Marks for History (Out of 100): ");
        marks5 = sc.nextFloat();

    }

    public void displayDetails(){

        System.out.println("\n__________________Your Result__________________");

        percentage = ((marks1+marks2+marks3+marks4+marks5)/500)*100;

        if(percentage>=80){
            System.out.println("You got A grade and your percentage is "+percentage+"%");
        }else if(percentage>=60){
            System.out.println("You got B grade and your percentage is "+percentage+"%");
        }else if(percentage>=40){
            System.out.println("You got C grade and your percentage is "+percentage+"%");
        }else if(percentage>=35){
            System.out.println("You got D grade and your percentage is "+percentage+"%");
        }else{
            System.out.println("You got F grade and your percentage is "+percentage+"%");
            System.out.println("You are failed, Study Hard!!!");
        }

    }

}
