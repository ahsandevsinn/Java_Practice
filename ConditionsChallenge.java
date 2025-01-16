
import java.util.Scanner;

public class ConditionsChallenge {

    public static void main(String[] args) {
        //    Scanner input = new Scanner(System.in);
        //    System.out.println("Please enter numer : ");
        //    int num = input.nextInt();
        //    if (num > 0) {
        //     System.out.println("Your number is positive "+ num);

        //    }else if (num < 0){
        //     System.out.println("Your number is negative "+ num);
        //    }else {
        //     System.out.println("Your number is 0 "+ num);
        //    }
        // //  even or odd number check
        // Scanner input = new Scanner(System.in);
        // System.out.println("Please enter numer : ");
        // int num = input.nextInt();
        // if (num % 2 == 0) {
        //     System.out.println("Your number is even");
        // } else {
        //     System.out.println("Your number is odd");
        // }
        // greatest of the three
        // Scanner input = new Scanner(System.in);
        // System.out.println("Please enter num one :");
        // int num1 = input.nextInt();
        // System.out.println("Please enter num two :");
        // int num2 = input.nextInt();
        // System.out.println("Please enter num three :");
        // int num3 = input.nextInt();

        // if (num1 >= num2 && num1 >= num3) {
        //     System.out.println("Num1 is greater than");

        // } else if (num2 >= num3 && num2 >= num1) {
        //     System.out.println("Num2 is greater than");

        // } else if (num3 >= num1 && num3 >= num2) {
        //     System.out.println("Num3 is greater than");

        // }

        // check leap year
        // Scanner input = new Scanner(System.in);
        // int num = input.nextInt();

        // if (num % 400 == 0 || (num % 4 == 0 && num % 100 != 0)) {
        //     System.out.println("Your year is leap year");
        // }else {
        //     System.out.println("Your year is not a leap year");

        // }

        // check student grade
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter percentage : ");
        float percentage = input.nextFloat();
        if (percentage >= 90) {
            System.out.println("You have got A Grade");
        } else if (percentage >= 75){
            System.out.println("You have got B Grade");

        }else if (percentage >= 50) {
            System.out.println("You have got C Grade");
            
        }else if (percentage >= 30) {
            System.out.println("You have got D Grade");

            
        }else {
            System.out.println("You have got F Grade Failed");

        }


    }
}
