//Day 8 Assignment

package com.day8;
import java.util.Scanner;

public class Doctor extends Employee {

    Scanner sc=new Scanner(System.in);
    String hospitalName,speciality;

    public void getProperties(){
        System.out.println("Enter Hospital Name : ");
        hospitalName=sc.nextLine();
        System.out.println("Enter Speciality : ");
        speciality=sc.next();
    }
    public void displayProperties(){
        System.out.println("Hospital Name : "+hospitalName+"    Speciality : "+speciality);
    }
}
