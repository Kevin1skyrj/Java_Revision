import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of which Table you want:");
        int num = input.nextInt();
        if(num<0){
            System.out.println("Invalid number");
        }

    }
}
