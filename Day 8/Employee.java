//Day 8 Assignment

package com.day8;
import java.util.Scanner;

public class Employee {

    Scanner sc=new Scanner(System.in);
    String name,designation;
    int age;
    double salary;


    public void getDetails(){

        System.out.println("Enter your Name : ");
        name=sc.next();
        System.out.println("Enter your Age : ");
        age=sc.nextInt();
        System.out.println("Enter your Salary : ");
        salary=sc.nextDouble();
        System.out.println("Enter your Designation : ");
        designation=sc.next();
    }

    public void displayDetails(){
        System.out.println("Employee's Name : "+name+"\nEmployee's Age : "+age+"\nEmployee's Salary: "+salary+"\nEmployee's Designation : "+designation);
    }
}
