import java.util.Scanner;

public class second_largest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of the array: ");
        int n = input.nextInt();

        // Handle edge case where array size < 2
        if (n < 2) {
            System.out.println("Array should have at least 2 elements to find the second largest.");
            return;
        }

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Initialize max and second_largest
        int max = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        // Find max and second largest
        for (int x : arr) {
            if (x > max) {
                second_largest = max; // Update second largest
                max = x;             // Update max
            } else if (x > second_largest && x < max) {
                second_largest = x; // Update second largest
            }
        }

        // Handle case where second largest does not exist
        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be the same).");
        } else {
            // Output max and second largest
            System.out.println("Max element: " + max);
            System.out.println("Second largest element: " + second_largest);
        }
    }
}
