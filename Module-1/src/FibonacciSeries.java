import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Fibonacci Series");
        System.out.println("Enter a number to print Fibonacci Series up to that number");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci Series");
        printFibonacciSeries(num);
    }

    public static void printFibonacciSeries(int num) {
        int first = 0;
        int second = 1;
        if(num <= 0 ){
            System.out.println(0);
        }
        while (first + second < num){
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }

    }
}
