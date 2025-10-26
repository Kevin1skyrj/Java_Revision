import java.util.Scanner;

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = input.nextInt();
        System.out.println("Enter a number by what you want to right4 shift");
        int com = input.nextInt();
        int result = num >> com;
        System.out.println("Result is :"+" "+ result);
    }
}
