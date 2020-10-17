// Day 5 Quiz App

package com.day5;
import java.util.Scanner;

public class Game {

    Scanner sc=new Scanner(System.in);
    Question[] questions=new Question[16];
    Player player=new Player();

    String[] questionsdata = {"1) Who is regarded as father of computers ?","2) Inputs to your computer is accomplished using the ____ ?","3) Which of the following is the product of data processing?","4) A computer derives its basic strength from ___ ?","5) A BIT represents a ___ ?","6) A kilobyte, also referred to as K, is equal to ___ ?","7) Scanner is an example of ___ ?","8) Image transfer is done on following printer ?","9) _______ is used to instruct the computer, what to do and how to do it.","10) Digital cameras is an example of ___ ?","11) ____ computers are also called Personal Digital Assistants(PDA).","12) Chain Printers is an example of ___ ?","13) The KIPS is used to measure the speed of ___ ?","14) The ___ was invented by William Oughtred.","15) The ___ software translates the source program into an object program.","16) Laptop computers are ____ computers that fit in a briefcase."};
    String[] options1={"Charles Babbage","Printer","Software program","Memory","Hexadecimal digit","1000 bytes","Music device","Laser","Web Browser","Music device","Notebook","Input","Tape drive","Wheel calculator","Application","personal"};
    String[] options2={"Pascal","Plotter","Hard copy output","Accuracy","Octal digit","1024 bytes","Output device","Inkjet","Win zip","Input device","Pen based","Output","Printer","Napier’s Bone","Compiler","pen based"};
    String[] options3={"John Napier","Keyboard","Information","Speed","Decimal digit","2048 bytes","Input device","Drum","Hardware","Output device","Palm","Music","Disk Drive","Calculator","Interpreter","palm"};
    String[] options4={"Abacus","Screen","Data","All of these","Binary digit","512 bytes","None of these","Dot matrix","Software","None of these","Laptop","None of these","Processor","Slide rule","System","portable"};
    int[] answers={1,3,3,4,4,2,3,1,4,2,2,2,4,4,2,4};


    public void initGame()
    {
        for(int i=0;i<16;i++) {
            questions[i]=new Question();
        }

        for(int i=0;i<16;i++)
        {
                questions[i].question=questionsdata[i];
                questions[i].option1=options1[i];
                questions[i].option2=options2[i];
                questions[i].option3=options3[i];
                questions[i].option4=options4[i];
                questions[i].correctAnswer=answers[i];
        }
    }

    public void play()
    {

        player.getDetails();
        for(int i=0;i<16;i++)
        {
            if ((i+2) % 2 == 0) {
                System.out.println("\nPlayer1 -------------------------> Question for "+player.p1name+" <-------------------------");
                int status=questions[i].askQuestion();
                if(status==1)
                {
                    System.out.println("\nNice, Right Answer !!!");
                    System.out.print("\nPress Enter To Continue....");
                    sc.nextLine();
                    player.p1score = player.p1score + 2;
                }
                else{
                    System.out.println("\nOops, Wrong Answer...");
                    System.out.println("--> Right Answer is : option "+ questions[i].correctAnswer);
                    System.out.print("\nPress Enter To Continue....");
                    sc.nextLine();
                    player.p1score = player.p1score - 1;
                }
            }
            else {
                System.out.println("\nPlayer2 -------------------------> Question for "+player.p2name+" <-------------------------");
                int status=questions[i].askQuestion();
                if(status==1)
                {
                    System.out.println("\nNice, Right Answer !!!");
                    System.out.print("\nPress Enter To Continue....");
                    sc.nextLine();
                    player.p2score = player.p2score + 2;
                }
                else{
                    System.out.println("\nOops, Wrong Answer...");
                    System.out.println("--> Right Answer is : option "+ questions[i].correctAnswer);
                    System.out.print("\nPress Enter To Continue....");
                    sc.nextLine();
                    player.p2score = player.p2score - 1;
                }
            }
        }
    }


    public void displayScore() {

        System.out.println("\n--------------------------------------->>> Score Board <<<---------------------------------------\n");
        System.out.println(player.p1name+"'s Score   : "+player.p1score);
        System.out.println(player.p2name+"'s Score   : "+player.p2score);
        System.out.println("\n--------------------------------------------------------------------------------");
        if(player.p1score == player.p2score) {
            System.out.println("Ohhhh, Contest Draw !!!\nCongratulations To Both Of You, You Both Are Equally Good !!!");
        }
        else if(player.p1score > player.p2score){
            System.out.println("Congratulationnnsss...'"+player.p1name+"' You Won This Contest !!!");
        }
        else {
            System.out.println("Congratulationnnsss...'"+player.p2name+"' You Won This Contest !!!");
        }

        System.out.println("--------------------------------------------------------------------------------");
    }

}
