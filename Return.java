
import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
      int num = sum(10, 9);
        System.out.println("Your final number is\s" + num);
    }

    // public static int firstNumber (){
    //     Scanner input = new Scanner(System.in);
    //     int firstNumber = input.nextInt();
    //     return firstNumber;
    // }


    // public static int secondNumber (){
    //     Scanner input = new Scanner(System.in);
    //     int secondNumber = input.nextInt();
    //     return secondNumber;
    // }

    public static int sum(int num1 , int num2){
        return num1+num2;

    }
}
