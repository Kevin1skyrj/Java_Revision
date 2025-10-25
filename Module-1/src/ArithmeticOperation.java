import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
       additionOfTwoNumber();
       subtractionOfTwoNumber();
       multiplicationOfTwoNumber();
       divisionOfTwoNumber();
       moduloOfTwoNumber();

    }
    public static void additionOfTwoNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        int add = num1 + num2;
        System.out.println("Addition of your given two number is :" + " " + add);
    }
    public static void subtractionOfTwoNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        int add = num1 - num2;
        System.out.println("Subtraction of your given two number is :" + " " + add);
    }
    public static void multiplicationOfTwoNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        int add = num1 * num2;
        System.out.println("Multiplication of your given two number is :" + " " + add);
    }
    public static void divisionOfTwoNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        int add = num1 / num2;
        System.out.println("Division of your given two number is :" + " " + add);
    }
    public static void moduloOfTwoNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        int add = num1 % num2;
        System.out.println("Modulus of your given two number is :" + " " + add);
    }
}
