import java.util.Scanner;

public class ProductOfTwoFloatingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first floating number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter your second floating number: ");
        float num2 = input.nextFloat();
        float multiplication = num1 * num2;
        System.out.println("Multiplication of your given two floating number is :" + " " + multiplication);
    }
}
