import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        int num = input.nextInt();
        findingfactorial(num);
    }
    public static void findingfactorial(int num){
        int i = 1;
        int fact = 1;
        while(i <= num){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }

}
