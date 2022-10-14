package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
       Scanner scanner = new Scanner(System.in);
        // input your solution here
        int counter = 1;
        double temp = 0;
        double number = 1;

        while(number  > 0){
            System.out.print("Number "+ (counter++) + ": ");
            number = scanner.nextDouble();

            if(number > temp){
                temp =  number;
            } else if(counter == 2 && number <= 0) {
                System.out.println("No number entered.");
            }else if (number <= 0 ){
                System.out.println("The largest number is "+  String.format("%.2f", temp));
            }
        }


    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int length = scanner.nextInt();
        if (length <= 0 ){
            System.out.println("Invalid number!");
        }
        int test = 1;
        for(int i = 1; i <= length ; i++) {
            for (int y = 1; y <= i; y++){
                System.out.print( test++ +" ");
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int length = 6;
        for(int i = 1; i <= length; i++) {
            for (int j = 1; i + j <= length; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner input = new Scanner(System.in);

        System.out.print("h: ");
        int height = input.nextInt();

        System.out.print("c: ");
        char charachter = input.next().charAt(0);

        int columns = 0;

        int longRow = height / 2;
        int spaces = longRow;
        int h3 = longRow + 1;
        int firstChar = charachter;
        int start;
        int secondChar = charachter - longRow;
        int count = 1;

        if (height % 2 == 0){
            System.out.println("Invalid number!");
        } else {
            for (int i = 0; i < height; i++) {

                if (i < h3) {
                    start = firstChar - i;
                } else {
                    start = secondChar + count;
                    count++;
                }

                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                if (i < longRow) {
                    spaces--;
                } else {
                    spaces++;
                }

                for (int j = 0; j <= columns; j++) {
                    int middleColumn = (columns / 2);
                    System.out.print((char) (start));

                    if (j < middleColumn) {
                        start++;
                    } else {
                        start--;
                    }
                }

                System.out.println();

                if (i < longRow) {
                    columns = columns + 2;
                } else {
                    columns = columns - 2;
                }
            }
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);
        // input your solution here
        int inputCounter = 1;
        double counter = 0;

        double negativeCounter = 0;
        double sum = 0;
        double number = 1;

        while(number != 0){
            System.out.print("Mark "+ (inputCounter++) + ": ");

            number = scanner.nextDouble();

            if(number > 0 && number < 6) {
                sum = number + sum;
                counter++;

                if(number == 5){
                    negativeCounter++;
                }
            }else if(number > 5) {
                System.out.println("Invalid mark!");
                inputCounter--;

            }
        }

        if (number == 0 && counter > 1){

            sum = sum /counter;
            System.out.println("Average: "+ String.format("%.2f", sum) );
            System.out.println("Negative marks: " + (int) negativeCounter );

        } else {
            System.out.println("Average: "+ String.format("%.2f", sum) );
            System.out.println("Negative marks: " + (int) negativeCounter );

        }

    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: " );
        int number = scanner.nextInt();
        int lastDigit = 0;
        int sum = 0;
        if(number > 9){

            while (number > 9) {

                while(number > 0) {
                    lastDigit = number % 10;

                    lastDigit = lastDigit * lastDigit;

                    sum = sum + lastDigit;

                    number = number / 10;
                }
                number = sum;
                sum = 0;
            }
            if (number == 1) {
                System.out.println("Happy number!");

            } else  {
                System.out.println("Sad number!");

            }
        }
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