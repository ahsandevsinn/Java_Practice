
import java.util.Scanner;

class Challenge28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        // int sum = sumOfOddNumber(num);
        // System.out.println("Your sum is =" + sum);
        long fact = factorial(num);
        System.out.println(fact);
// 

    }

    // public static void numbersTable(int num) {
    //     int i = 1;
    //     while (i <= 10) {
    //         System.out.println(num + " X " + i + " = " + (num * i));
    //         i++;
    //     }
    // }
    // public static int sumOfOddNumber(int num) {
    //     int sum = 0;
    //     int i = 1;

    //     while (i <= num) {
    //         sum += i;
    //     i += 2;

    //     }
    //     return sum;
        


    // }

    public static long factorial(int  num){
         if (num < 2) {
            return 1;
         }
         long fact = 1;
         int i = 2;
         while (i < num) {
            fact *= i;
            i++;
         }
         return fact;
    }

}
