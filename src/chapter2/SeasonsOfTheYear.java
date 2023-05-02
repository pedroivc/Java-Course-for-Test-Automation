package chapter2;

import java.util.Scanner;

public class SeasonsOfTheYear {

    public static void main(String args[]){
        System.out.println("Name a season of the year:");
        Scanner scanner = new Scanner (System.in);
        String season = scanner.next();

        System.out.println("Name an adjective:");
        String adjective = scanner.next();

        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
