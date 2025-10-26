import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your first number:");
        int first = input.nextInt();
        System.out.println("Please Enter your second number:");
        int second = input.nextInt();
        System.out.println("Please Enter your third number:");
        int third = input.nextInt();

        if(first > second && first > third){
            System.out.println( "First number is greatest among the three"+" " + first);
        }else if(second > first && second > third){
            System.out.println("Second number is greatest among the three"+" "+ second);
        }else{
            System.out.println("Third number is greatest among the three"+" "+ third);
        }
    }
}
