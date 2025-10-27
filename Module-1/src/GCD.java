import java.util.Scanner;


public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD");
        System.out.print("Enter first number:");
        int num1 = input.nextInt();
        System.out.print("Enter second number:");
        int num2 = input.nextInt();
        int gcd = gcd(num1,num2);
        System.out.println("GCD of given two number is" + " " + gcd);
    }
    public static int gcd(int num1,int num2){
        int ans = 1;
        int i = 2;
        int least = Math.min(num1,num2);
        while( i <= least){
            if(num1%i == 0 && num2%i ==0){
                ans = i;
            }
            i++;
        }
        return ans;
    }

}
