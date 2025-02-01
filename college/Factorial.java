import java.util.Scanner;

public class Factorial{

    //non-recursive factorial function
    static long nonRecursiveFactorial(int n){
        long fact=1;
        for(int i=n; i>1; i--){
            fact = fact * i;
        }
        return fact;
    }
    
    //recursive factorial function
    static long recursiveFactorial(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*recursiveFactorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //input number 
        System.out.print("Enter number : ");
        int n = input.nextInt();

        //non-recursive factorial
        System.out.println("Factorial without recursion: "+nonRecursiveFactorial(n));

        //recursive factorial
        System.out.println("Factorial with recursion: "+recursiveFactorial(n));

        input.close();
    }
}