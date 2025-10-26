import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Multiplication Table World\n");
        System.out.println("Enter a number of which Table you want:");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }
    public static void printMultiplicationTable(int num){
         int i = 1;
         while(i <= 10){
             System.out.println(num+"X"+i+"="+ (num*i));
             i++;
         }
    }
}
