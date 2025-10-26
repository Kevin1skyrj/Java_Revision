import java.util.Scanner;

public class BitwiseEven_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check Even or Odd ");
        int num = input.nextInt();
        if((num & 1) == 1){
            System.out.println("Odd number");
        }else{
            System.out.println("Even number");
        }
    }
}
