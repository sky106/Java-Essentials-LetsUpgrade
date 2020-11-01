//Day 8 Assignment

package com.day8;
import java.util.Scanner;

public class Pilot extends Employee{

    Scanner sc=new Scanner(System.in);
    String airlinesName,speciality;

    public void getProperties(){
        System.out.println("Enter Airlines Name : ");
        airlinesName=sc.nextLine();
        System.out.println("Enter Speciality : ");
        speciality=sc.next();
    }
    public void displayProperties(){
        System.out.println("Airlines Name : "+airlinesName+"    Speciality : "+speciality);
    }
}
