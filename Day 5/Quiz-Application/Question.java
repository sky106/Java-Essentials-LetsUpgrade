// Day 5 Quiz App

package com.day5;
import java.util.Scanner;

public class Question {
    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;

    public int askQuestion()
    {

        System.out.println("\n"+question+"\n");
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.print("\n----->>> Enter Your Answer(1-4) : ");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer){
            return 1;
        }
        return 0;
    }

}

