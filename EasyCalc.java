import java.util.Scanner;

public class EasyCalc {
    public static void main(String[] args) {
        double x, y, z, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        x = input.nextInt();
        System.out.println("Enter the second integer: ");
        y = input.nextInt();
        System.out.println("Enter the third integer: ");
        z = input.nextInt();
        result = x * y * z;
        System.out.printf("Result is: %.3f\n", result);
    }
}
