import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        //Check string taken from the user is palindrome or not
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string for palindrome check : ");
        String str = input.nextLine();
        input.close();

        String revStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            revStr = ch + revStr;
        }

        System.out.println("Original str : "+str);
        System.out.println("Reversed str : "+revStr);
        if(str.equals(revStr)){
            System.out.println("Yes palindrome..!!");
        }else{
            System.out.println("Not palindrome..!!");
        }
    }
}
