import java.util.Scanner;

public class peakpoint1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int N = sc.nextInt();
        int[] arr = new int[N];
        //Accepts N elements
        System.out.println("Enter" + N + "elements");
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        //find peak elements
        System.out.println("\nPeak Elements");
        peak1(arr);

    }
    public static void peak1(int[] arr){
        peak(arr,0,arr.length - 1);
    }
    public static void peak(int arr[],int low, int high){
        int N = arr.length;
        if (high - low < 2)
            return;
        int mid = (low + high)/2;
        if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
            System.out.println(arr[mid]+" ");

        peak(arr,low,mid);
        peak(arr, mid, high);
    }
}