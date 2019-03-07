import java.util.Arrays;
import java.util.Scanner;

public class Pillars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String temp = scan.nextLine();
        String[] tempArray = temp.split("");
        int[] n = new int[tempArray.length];

        for (int i = 0; i < tempArray.length;i++ ){
            n[i] = Integer.parseInt(Arrays.toString(tempArray));
        }
        String temp1 = scan.nextLine();
        String[] tempArray1 = temp1.split("");
        int [] j = new int[tempArray1.length];

        for (int i = 0; i < tempArray1.length;i++){
            j[i] = Integer.parseInt(tempArray1[i]);
        }


    }
}
