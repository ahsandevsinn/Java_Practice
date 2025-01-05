
import java.util.Scanner;

public class UserInput{
    public static void userInput(){
        Scanner input =  new Scanner(System.in);
        System.out.println("Hi Whats Your Name?");
       String name = input.nextLine();
       System.out.println("My Name is" + name);
       System.out.println("Whats your age ?");
       int age = input.nextInt();

    System.out.println("My age is " + age);
    System.out.println("My Name is \s" + name  + "\s"+ "My age is\s" + age);
    }
}