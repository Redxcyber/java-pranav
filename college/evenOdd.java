import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        if (n%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
