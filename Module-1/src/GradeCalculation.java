import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Marks:");
        int marks = input.nextInt();
        if(marks >= 90){
            System.out.println("A Grade");
        }else if(marks >= 75 ){
            System.out.println("B Grade");
        }else if(marks >= 60){
            System.out.println("C Grade");
        }else if(marks >= 30){
            System.out.println("D Grade");
        }else{
            System.out.println("Sorry Your have Failed");
        }
    }
}
