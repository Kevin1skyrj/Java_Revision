import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = input.nextInt();
        if(num%2 == 0){
            System.out.println("The number you have entered is Even");
        }else {
            System.out.println("The number you have entered is Odd");

        }
    }
}
