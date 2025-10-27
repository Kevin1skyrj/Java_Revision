import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is Prime or not");
        int num = input.nextInt();
        boolean primeNumber = primeNumber(num);
        if(primeNumber){
            System.out.println("Your given number"+" "+ num +" "+ "is Prime");
        }else{
            System.out.println("Your given number"+" "+ num +" "+ "is Not Prime");
        }
    }

    public static boolean primeNumber(int num) {
        int i = 2;
        while (i <= num){
            if(num%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
