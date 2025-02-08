
public class TwoDimensionalArray {

    public static void main(String[] args) {
        // int[][] arr = new int[2][2];
        // arr[0][0] = 10;
        // arr[1][1] = 20;
        // System.out.println(arr[0][0]);
        // System.out.println(arr[1][1]);
        int[][] array = {{1,2,3},{4,5,6}};
        int i = 0;
        while (i<array.length) {
            int j = 0;
            while (j<array[i].length) {
                System.out.print(array[i][j]+"");
                j++;
            }
System.out.println();
            i++;
        }
    }
}
