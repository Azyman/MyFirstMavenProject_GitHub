package MyFirstPackage;
import java.util.Scanner;
public class MyFirstInteliHomework {
        public static void main(String Args []){
            System.out.println("Enter any season you would like in the year");
            Scanner scanner = new Scanner(System.in);
            String season = scanner.next();

            //Then a whole number
            System.out.println("Enter a whole number");
            int whole_number = scanner.nextInt();

            //Then an adjective
            System.out.println("Enter any adjective");
            String adjective = scanner.next();

            System.out.println("On a "+adjective+" day of "+season+" I drink "+whole_number+" cups of coffee.");
        }
    }


