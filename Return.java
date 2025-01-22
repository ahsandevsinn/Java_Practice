
import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        int first = firstNumber();
        int second = secondNumber();

        int finalNumber = first + second;
        System.out.println("Your final number is\s" + finalNumber);
    }

    public static int firstNumber (){
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        return firstNumber;
    }


    public static int secondNumber (){
        Scanner input = new Scanner(System.in);
        int secondNumber = input.nextInt();
        return secondNumber;
    }
}
