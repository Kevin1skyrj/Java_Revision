import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Reverse a Digit World");
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int revDigit = revDigit(num);
        System.out.println("Reverse Digit is" + " " + revDigit);
    }
    public static int revDigit(int num){
        int rev = 0;
        while(num > 0){
            int lastDigit = num % 10;
            rev = rev*10 + lastDigit;
            num = num / 10;
        }
        return rev;
    }
}
