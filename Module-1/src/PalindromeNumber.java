import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Number checker");
        System.out.println("Enter a Number");
        int num = input.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        int revDigit = revDigit(num);
        if(revDigit == num){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }

    public static int revDigit(int num) {
        int revNum = 0;
        while (num > 0){
            int lastDigit = num%10;
            revNum = revNum*10 + lastDigit;
            num = num/10;
        }
        return revNum;
    }
}
