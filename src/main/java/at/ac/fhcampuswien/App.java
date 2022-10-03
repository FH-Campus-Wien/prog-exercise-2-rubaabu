package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
       /* Scanner scanner = new Scanner(System.in);
        // input your solution here
        int counter = 1;
        double temp = 0;

        System.out.print("Number "+ counter++ + ": ");

        double number = scanner.nextDouble();


        temp =  number;


        if(number < 0) {
            System.out.println("No number entered.");

        }
        while(number  > 0){
            System.out.print("Number "+ (counter++) + ": ");
            number = scanner.nextDouble();

            if(number > temp){
                temp =  number;
            }
        }

        if (number == 0 || number < 0){

            System.out.println("The largest number is "+  String.format("%.2f", temp));

        }*/
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();


        for(int i=0; i< length ; i++) {
            i++;

            for (int y = 0; y < i; y++){

                System.out.println( y++);
            }
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}