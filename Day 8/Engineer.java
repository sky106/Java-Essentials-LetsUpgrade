//Day 8 Assignment

package com.day8;
import java.util.Scanner;

public class Engineer extends Employee {

    Scanner sc=new Scanner(System.in);
    String companyName,speciality;

    public void getProperties(){
        System.out.println("Enter Company Name : ");
        companyName=sc.nextLine();
        System.out.println("Enter Speciality : ");
        speciality=sc.next();
    }
    public void displayProperties(){
        System.out.println("Company Name : "+companyName+"    Speciality : "+speciality);
    }
}
