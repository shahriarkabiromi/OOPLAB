import java.util.Scanner;

class Triangle {

    double angle1, angle2, angle3;

    public Triangle(double a, double b, double c) {
        angle1 = a;
        angle2 = b;
        angle3 = c;

        if (!isValidTriangle()) {
            System.out.println("Invalid triangle. Sum of angles should be equal to 180 degrees.");
            return;
        }

        if (isRightAngledTriangle()) {
            System.out.println("Right-angled triangle");
        } else if (isObtuseTriangle()) {
            System.out.println("Obtuse triangle");
        } else {
            System.out.println("Acute triangle");
        }
    }

    boolean isValidTriangle() {
        return (angle1 + angle2 + angle3) == 180;
    }

    boolean isRightAngledTriangle() {
        return (angle1 == 90 || angle2 == 90 || angle3 == 90);
    }

    boolean isObtuseTriangle() {
        return (angle1 > 90 || angle2 > 90 || angle3 > 90);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle1: ");
        double angle1 = scanner.nextDouble();

        System.out.print("Enter angle2: ");
        double angle2 = scanner.nextDouble();

        System.out.print("Enter angle3: ");
        double angle3 = scanner.nextDouble();

        Triangle triangle = new Triangle(angle1, angle2, angle3);
    }
}
