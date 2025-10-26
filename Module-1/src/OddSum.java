import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Odd sum\n");
        System.out.println("Enter your number");
        int num = input.nextInt();
        printOddSum(num);
    }
    public static void printOddSum(int num){
        int i = 1;
        int sum = 0;
        while(i <= num){
            if(i%2 == 1){
                sum = sum + i;
            }
            i++;
        }
        System.out.print(sum);
    }
}
