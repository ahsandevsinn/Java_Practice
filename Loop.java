
import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        // int i = 0;

        // while (i <= 10) {
        //     System.out.println(i);
        //     i = i + 1;
        // }
        // int count = 500;
        // while (count >= 200) {
        //     System.out.println(count);
        //     count = count - 1;
        // }
        Scanner input = new Scanner(System.in);

        int i = 0;

        while (i < 5) {

            int num = input.nextInt();
            System.out.println(num);
            num++;

        }

    }
}
