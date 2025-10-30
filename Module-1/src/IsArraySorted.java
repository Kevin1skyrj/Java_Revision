import java.sql.SQLOutput;
import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Sorted Arrays:");
        System.out.print("Please Enter the number of element:");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while( i < size){
            System.out.println("Please Enter a number "+ (i+1));
            nums[i] = input.nextInt();
            i++;
        }
        boolean isSorted = isSorted(nums);
        if (isSorted) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("Your array is not sorted");
        }

    }
    public static boolean isSorted(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
