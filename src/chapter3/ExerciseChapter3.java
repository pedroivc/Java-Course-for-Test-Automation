package chapter3;

import java.util.Scanner;

public class ExerciseChapter3 {
    public static void main(String args[]){

        //What we know
        double penniesUnity = 0.01;
        double nickelsUnity = 0.05;
        double dimesUnity = 0.1;
        double quartersUnity = 0.25;
        double requiredAmount = 1;

        //What we don't know
        System.out.println("How many pennies do you have?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickels do you have?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes do you have?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters do you have?");
        int quarters = scanner.nextInt();
        scanner.close();

        //Conditions and result
        double amount = (pennies * penniesUnity) +
                        (nickels * nickelsUnity) +
                        (dimes * dimesUnity) +
                        (quarters * quartersUnity);

        if(amount < requiredAmount){
            double amountUnder = requiredAmount - amount;
            System.out.println("You lose! You went under " + amountUnder);
        }
        else if(amount > requiredAmount){
            double amountOver = amount - requiredAmount;
            System.out.println("You lose! You went over " + amountOver);
        }
        else {
            System.out.println("Congratulations! You win!");
        }
    }
}
