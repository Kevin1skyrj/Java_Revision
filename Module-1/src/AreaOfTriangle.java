import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base of your Triangle:");
        int b = input.nextInt();
        System.out.println("Enter height of your Triangle:");
        int h = input.nextInt();
        int area = (b*h)/2;
        System.out.println("Area of your Triangle is :" + " " + area);
    }
}
