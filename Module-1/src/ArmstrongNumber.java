import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Armstrong number Checker:");
        System.out.println("Enter your number to check whether it is Armstrong Number or not");
        int num = input.nextInt();
        checkArmstrongNumber(num);
    }

    public static void checkArmstrongNumber(int num) {
     int numCopy = num;
     int noOfDigits = noOfDigits(num);
     int finalNumber = 0;
     while(num > 0){
         int lastDigit = num%10;
         num = num / 10;
         finalNumber = finalNumber + (int)Math.pow(lastDigit,noOfDigits);
     }
     if(finalNumber == numCopy){
         System.out.println("Armstrong Number");
     }else {
         System.out.println("Not Armstrong Number");
     }

    }

    public static int noOfDigits(int num) {
      int count = 0;
      while (num > 0){
          num = num/10;
          count++;
      }
      return count;
    }
}
