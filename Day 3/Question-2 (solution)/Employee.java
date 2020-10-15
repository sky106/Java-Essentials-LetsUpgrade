//Day 3 Question 2

package com.day3;
import java.util.Scanner;

public class Employee {

    Scanner sc = new Scanner(System.in);

    String name;
    int DOB,MOB,YOB,monthSal,annualSal,currentYear=2020;
    double taxAmount;

    public void getDetails(){

        System.out.println("\n___________________Welcome Employees___________________\n");
        System.out.print("Enter your name : ");
        name = sc.next();
        System.out.print("Enter your date of birth(only date) : ");
        DOB = sc.nextInt();
        System.out.print("Enter your month of birth(only month) : ");
        MOB = sc.nextInt();
        System.out.print("Enter your year of birth(only year) : ");
        YOB = sc.nextInt();
        System.out.print("Enter your monthly salary : ");
        monthSal = sc.nextInt();
    }

    public void displayDetails(){

        System.out.println("\n___________________Your Details___________________\n");

        System.out.println("Your Name : "+name);
        System.out.println("Your Age(in years) : "+(currentYear-YOB));
        annualSal = monthSal*12;
        System.out.println("Your Annual Salary(in Rupees) : "+annualSal);

        if(annualSal>500000){
            taxAmount = annualSal * 0.20;
        }
        if(annualSal>400000){
            taxAmount = annualSal * 0.15;
        }
        if(annualSal>300000){
            taxAmount = annualSal * 0.10;
        }
        if(annualSal>200000){
            taxAmount = annualSal * 0.05;
        }else {
            taxAmount = 0;
        }

        System.out.println("Your Tax Amount(in Rupees) : "+taxAmount);

    }
}
