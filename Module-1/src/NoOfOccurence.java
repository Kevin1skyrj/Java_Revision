import java.util.Scanner;
public class NoOfOccurence {
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
        System.out.println("Please Enter to element to check it occurrences number");
        int num = input.nextInt();
        int occurrences = occurrences(nums,num);
        System.out.println("The no. of occurrences of element "+ (num) + " is : "+occurrences);
    }
    public static int occurrences(int[] nums, int num){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    }
}
