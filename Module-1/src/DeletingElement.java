import java.sql.SQLOutput;
import java.util.Scanner;

public class DeletingElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Deleting an element from an array");
        System.out.println("Enter the number of element should be present in array");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i < size){
            System.out.println("Enter the element number "+(i+1));
            nums[i] = input.nextInt();
            i++;
        }
        System.out.println("Now Enter a number you want to delete");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(nums, numToDelete);
        System.out.println("Here is your new Array");
        for (int n : newArr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    public static int[] deleteNumber(int[] nums, int numToDelete) {
        int occ = 0;
        for (int n : nums) {
            if (n == numToDelete) {
                occ++;
            }
        }
        int newSize = nums.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < nums.length) {
            if (nums[i] != numToDelete) {
                newArr[j] = nums[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}
