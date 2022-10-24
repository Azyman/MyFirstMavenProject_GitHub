package MyFirstPackage;

import java.util.Scanner;

public class DollarGame {
    public static void main(String Args[]){
        double penny = .01;
        double nickel = .05;
        double dime = .1;
        double quater = .25;
        int dollar = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wellcome to the change for dollar "+" Your goal is to make enough change to make exactly 1 dollar(1.00)");
        System.out.println("Enter number of your pennies");
        int numberOfPennis = scanner.nextInt();

        System.out.println("Enter number of your nickels");
        int numberOfNickels = scanner.nextInt();

        System.out.println("Enter number of your dimes");
        int numberOfDimes = scanner.nextInt();

        System.out.println("Enter number of your quater");
        int numberOfQuater = scanner.nextInt();

        scanner.close();

        double total = numberOfPennis*penny + numberOfDimes*dime + numberOfNickels*nickel + numberOfQuater*quater;
        if(total<dollar){
            double amountShort = dollar - total;
            System.out.println("Sorry you lose. You were short of "+amountShort+" cents");
        } else if (total>dollar) {
            double amountOver = dollar - total;
            System.out.println("Sorry you lose. You were over of " + amountOver + " cents");
        }
        else {
            System.out.println("Yeah you win");
        }


        }


    }

