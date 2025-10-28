import java.util.Arrays;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Sum & Average of Array ");
        System.out.print("Please Enter the number of element:");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size){
            System.out.println("Please enter the element number " + (i+1) );
            nums[i] = input.nextInt();
            i++;
        }
        int sum = sum(nums);
        System.out.println("Sum of Elements of an Array is :"+" "+ sum);
        long avg = avg(nums);
        System.out.println("Average of Elements of an Array is :" + " " + avg);
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
    public static long avg(int[] nums){
        int n = nums.length;
        long sum = sum(nums);
        long avg = sum / n;
        return avg;
    }
}
