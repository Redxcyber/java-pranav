import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        for(int i=100; i<=200; i++){
            boolean flag = true;
            for(int j=2; j<Math.sqrt(i); j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}