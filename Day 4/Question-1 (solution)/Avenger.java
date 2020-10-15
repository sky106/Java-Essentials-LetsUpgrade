//Day 4 Question 1

package com.day4;
import java.util.Scanner;

public class Avenger {

    Scanner sc = new Scanner(System.in);

    String name,power,weapon,planet;
    int age;

    public void getDetails(){

        System.out.print("Enter Avenger's Name : ");
        name = sc.nextLine();
        System.out.print("Enter Avenger's Age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Avenger's Power : ");
        power = sc.nextLine();
        System.out.print("Enter Avenger's Weapon : ");
        weapon = sc.nextLine();
        System.out.print("Enter Avenger's Planet : ");
        planet = sc.nextLine();

    }

    public void displayDetails(){

        System.out.println("Avenger's Name is : "+name);
        System.out.println("Avenger's Age is  : "+age);
        System.out.println("Avenger's Power is : "+power);
        System.out.println("Avenger's Weapon is : "+weapon);
        System.out.println("Avenger's Planet is : "+planet);

    }
}
