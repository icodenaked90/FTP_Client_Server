
import java.util.Arrays;
import java.util.Scanner;

public class Stones {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String temp = scan.nextLine();
        String[] tempArray = temp.split(" ");
        int [] n = new int[tempArray.length];

        for (int i = 0; i < tempArray.length; i++) {
            n[i] = Integer.parseInt( tempArray[i]);
        }

        String temp1 = scan.nextLine();
        String [] tempArray1 = temp1.split(" ");
        int [] A = new int[tempArray1.length];

        for (int i = 0; i < tempArray1.length; i++) {
            A[i] = Integer.parseInt( tempArray1[i]);
        }
        Arrays.sort(A);
        System.out.println(stones(A, n[1]));
    }

    static int stones(int[] A, int weight) {
        int count=0;
        int sum = 0;
            while(count<A.length-1 && sum+A[count]<=weight){
                sum+=A[count];
                count++;
            }
        return count;
    }
}