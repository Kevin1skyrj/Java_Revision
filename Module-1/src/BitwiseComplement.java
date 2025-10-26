import java.util.Scanner;

public class BitwiseComplement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int result = ~num;
        System.out.println("Result is"+ " " + result);
    }
}
