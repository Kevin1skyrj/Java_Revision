import java.util.Scanner;

public class ToCheckNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if(num > 0){
            System.out.println("The number you have entered is Positive number" + " "+ num);
        } else if (num == 0) {
            System.out.println("The number you have entered is Neutral number" + " " + num);
        }else {
            System.out.println("The number you have entered is Negative number" + " " + num);
        }
    }
}
