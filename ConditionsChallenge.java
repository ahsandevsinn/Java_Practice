import java.util.Scanner;

public class ConditionsChallenge {
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter numer : ");
       int num = input.nextInt();
       if (num > 0) {
        System.out.println("Your number is positive "+ num);
        
       }else if (num < 0){
        System.out.println("Your number is negative "+ num);

       }else {
        System.out.println("Your number is 0 "+ num);

       }
       

    }
}