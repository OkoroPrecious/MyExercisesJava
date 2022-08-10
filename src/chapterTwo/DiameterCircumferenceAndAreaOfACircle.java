package chapterTwo;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter a circle radius: ");
        int circleRadius = keyboardInput.nextInt();

        double diameter = circleRadius * 2;
        System.out.printf("Circle diameter is %.1f%n", diameter);

        double circumference = 2 * Math.PI * circleRadius;
        System.out.printf("Circle circumference is %.1f%n", circumference);

        double area = Math.PI * circleRadius * circleRadius;
        System.out.printf("Area is %.1f%n", area);
    }
}
