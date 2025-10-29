import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Sum & Average of Array ");
        System.out.print("Please Enter the number of element:");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Please enter the element number " + (i + 1));
            nums[i] = input.nextInt();
            i++;
        }
        int min = min(nums);
        int max = max(nums);
        System.out.println("Max of Array is " + max);
        System.out.println("Min of Array is " + min);
    }
    public static int min(int[] nums) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < nums.length) {
            if (min > nums[i]) {
                min = nums[i];
            }
            i++;
        }
        return min;
    }
    public static int max(int[] nums) {
        if (nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = nums[0];
        int i = 1;
        while (i < nums.length) {
            if (max < nums[i]) {
                max = nums[i];
            }
            i++;
        }
        return max;
    }
}
