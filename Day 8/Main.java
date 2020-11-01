//Day 8 Assignment

package com.day8;

public class Main {

    public static void main(String[] args) {

        Doctor[] d=new Doctor[3] ;
        System.out.println("---------------> For Doctors");

        for(int i=0;i<3;i++) {
            d[i]=new Doctor();
            System.out.println("\nEnter Doctor Employee "+(i+1)+" Details...");
            d[i].getDetails();
            d[i].getProperties();
        }
        for(int i=0;i<3;i++){
            System.out.println("\n---> Doctor Employee "+(i+1)+" Details");
            d[i].displayDetails();
            d[i].displayProperties();
        }


        Engineer[] e=new Engineer[3];
        System.out.println("\n---------------> For Engineers");

        for(int i=0;i<3;i++){
            e[i]=new Engineer();
            System.out.println("\nEnter Engineer Employee "+(i+1)+" Details...");
            e[i].getDetails();
            e[i].getProperties();
        }
        for(int i=0;i<3;i++){
            System.out.println("\n---> Engineer Employee "+(i+1)+" Details");
            e[i].displayDetails();
            e[i].displayProperties();
        }


        Pilot[] p=new Pilot[3];
        System.out.println("\n---------------> For Pilots");

        for(int i=0;i<3;i++) {
            p[i]=new Pilot();
            System.out.println("\nEnter Pilot Employee "+(i+1)+" Details...");
            p[i].getDetails();
            p[i].getProperties();
        }
        for(int i=0;i<3;i++){
            System.out.println("\n---> Pilot Employee "+(i+1)+" Details");
            p[i].displayDetails();
            p[i].displayProperties();
        }

    }
}
