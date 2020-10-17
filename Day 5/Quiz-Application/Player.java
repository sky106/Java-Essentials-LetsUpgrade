// Day 5 Quiz App

package com.day5;

import java.util.Scanner;
public class Player {
    Scanner sc=new Scanner(System.in);
    String p1name,p2name;
    int p1score=0,p2score=0;

    public void getDetails(){

        System.out.println("\n__________________________ Welcome To This MultiPlayer Quiz Contest __________________________\n");
        System.out.println("*** Some Instructions :\n");
        System.out.println("        1. Total Questions : 16 (8 Questions/player)");
        System.out.println("        2. Correct Answer : 2 Points");
        System.out.println("        3. Incorrect Answer : -1 Point");
        System.out.print("\n----->>> Enter Player1 Name : ");
        p1name=sc.next();
        System.out.print("----->>> Enter Player2 Name : ");
        p2name=sc.next();

    }

}