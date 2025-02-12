import java.util.Scanner;
public class MinMaxElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        //input array elemnets
        System.out.println("Enter elements of array->");
        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
        }

        //find min element
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }

        System.out.println("Min element : "+min);



        //find max element
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element : "+max);

    }
}
