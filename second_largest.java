import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input size of array
        System.out.print("Enter size of the array : ");
        int n = input.nextInt();

        //input array elements
        int[] arr = new int[n];
        System.out.println("Enter elements of array :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        //find max element
        int max = arr[0];
        for(int x : arr){
            if (x > max){
                max = x;
            }
        }

        //output max element
        System.out.println("Max element : "+max);

        //find second largest element
        /*
        int second_largest = arr[0];
        for(int x : arr){
            if(x>second_largest && x<max){
                second_largest = x;
            }
        }
        */
        int second_largest = arr[0];
        for(int x : arr){
            if(x>max){
                second_largest = max;
                max = x;
            }
            else if(x>second_largest){
                second_largest = x;
            }
        }

        //output second largest
        System.out.println("Second largest element : "+second_largest);
    }
}