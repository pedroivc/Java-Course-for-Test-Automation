package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static String[] weekDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String args[]){
        int day = getDay();
        String weekDay = getWeekDay(day);

        System.out.println("The day number #" + day + " is " + weekDay);
    }

    public static int getDay(){

        System.out.println("Enter the number of the week day (Between 1 and 7):");
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        scanner.close();

        return day;
    }

    public static String getWeekDay(int day){
        return weekDay[day - 1];
    }
}
