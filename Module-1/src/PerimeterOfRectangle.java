import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Perimeter of Rectangle by giving length and breadth in input");
        System.out.println("Enter  length of rectangle:");
        int l = input.nextInt();
        System.out.println("Enter breadth of rectangle");
        int b = input.nextInt();
        int perimeter = 2*(l + b);
        System.out.println("Perimeter of your Rectangle is :" + " " + perimeter);
    }
}
