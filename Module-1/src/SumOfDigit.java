import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter an integer number");
        int num = input.nextInt();
        toCalculatedigitsum(num);
    }

    public static void toCalculatedigitsum(int num) {
        int sum = 0;
        while(num > 0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
}
