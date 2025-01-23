 import java.util.Scanner;

 class Challenge28 {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        numbersTable(num);
    }

    public static void numbersTable(int num){
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i +" = " + (num*i));
            i++;
            
        }
    }
    
}