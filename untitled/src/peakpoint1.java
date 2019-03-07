import java.util.Scanner;

    public class peakpoint1 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a size of array");
            int N = sc.nextInt();
            int[] arr = new int[N];
            //Accepts N elements
            System.out.println("Enter" + N + "elements");
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            //find peak elements
            System.out.println("\nPeak Elements");
            peak(arr);

        }
        public static int peak(int[] arr) {

            if (arr[0] >= arr[1]){
                return 0;
            }
            for (int i = 1; i < arr.length-2; i++) {
                if ((arr[i - 1] <= arr[i]) && (arr[i] >= arr[i + 1])){
                    return i;
                }
            }
            if (arr[arr.length - 2] <= arr[arr.length - 1]){

                return arr.length - 1;


            }
            System.out.println("lol");
            return -1;
        }
    }

