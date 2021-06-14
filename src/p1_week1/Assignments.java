package p1_week1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit: ");
        double Fah= input.nextDouble();
        double cel= ((5*(Fah-32.0))/9.0);

        System.out.println(Fah+ "degree Fahrenheit is equal to "+ cel  + " in Celsius");

        System.out.println("**********");

        Scanner inp= new Scanner(System.in);
        System.out.println("Input a number in inches ");
        double inch= input.nextDouble();
        double meter= (inch*0.0254);
        System.out.println(inch+" inch is "+ meter+ "meters");

        System.out.println("**********");

        Scanner input1= new Scanner(System.in);
        System.out.println("Input a number between 0 and 1000: ");
        int num= input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);

        System.out.println("**********");

        double minutesInYear = 60 * 24 * 365;

        Scanner input3 = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");




    }
}
