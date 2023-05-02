package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String args[]){

        //Initialize what we know
        int spaces = 20;
        int rollLimit = 5;
        int rolled = 0;
        int score = 0;
        int die = 0;
        int missing = 20;

        //Random number to dice
        Random random = new Random();

        //Logic of the game
        for(rolled = 0; rolled < rollLimit; ++rolled) {
          if(rolled == 5) {
                System.out.println("You already rolled the dice 5 times!");
                break;
            }
            die = random.nextInt(6) + 1;
            score += die;
            missing -= die;
            if(score <= 20) {
                System.out.println("Roll #" + (rolled + 1) + ": You've rolled a " + die + ". You are now on space " + score + " and have " + missing + " more to go.");
            }
            else{
                System.out.println("Roll #" + (rolled + 1) + ": You've rolled a " + die +  ". You went over " + (missing * (-1)) + " spaces.");
                break;
            }
        }

        //Message for the result
            if(score == 20){
                System.out.println("You win with exactly " + score + " spaces passed!");
            }
            else if(score > 20){
                System.out.println("You lose. You passed over " + (score - spaces) + " spaces");
            }
            else{
                System.out.println("You lose. You missed " + (spaces - score) + " spaces");
            }
    }
}
