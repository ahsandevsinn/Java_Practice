
import java.util.Scanner;

public class UserInput {
    // public static void userInput(){
    //     Scanner input =  new Scanner(System.in);
    //     System.out.println("Hi Whats Your Name?");
    //    String name = input.nextLine();
    //    System.out.println("My Name is" + name);
    //    System.out.println("Whats your age ?");
    //    int age = input.nextInt();

    // System.out.println("My age is " + age);
    // System.out.println("My Name is \s" + name  + "\s"+ "My age is\s" + age);
    // }
    // create a program to input name of the person and respond with "Welcome Name to KG Coding"
    // public static void userInput(){
    //     Scanner input = new Scanner(System.in);
    //     String name = input.nextLine();
    //     System.out.println("Welcome\s"+name+"\sto KG Coding");
    // }
    // create a program to add two numbers 
    // public static void userInput() {
    //     int num1 = 5;
    //     int num2 = 5;
    //     System.out.println("add of two numbers is\s"+ (num1+num2));
    // }
    public static void userInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number one :");
        int num1 = input.nextInt();
        System.out.println("Please enter number two :");
        int num2 = input.nextInt();
        System.out.println("The sum of two numbers is :\s"+ (num1+num2));

    }
}
