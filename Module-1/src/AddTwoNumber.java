import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number : ");
        int num1 = input.nextInt();
        System.out.println("Enter your Second Number : ");
        int num2 = input.nextInt();
        int c = num1 + num2;
        System.out.println("Sum of your two number is :" + c);
    }
}
