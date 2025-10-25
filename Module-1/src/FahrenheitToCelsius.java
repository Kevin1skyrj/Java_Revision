import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Fahrenheit Temperature");
        float f = input.nextFloat();
        float c = (f-32)*5/9;
        System.out.println("Temperature in Celsius is:" + " " + c);
    }
}
