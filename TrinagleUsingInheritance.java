import java.util.Scanner;

class Triangle {
     double angle1, angle2, angle3;

    public Triangle(double a, double b, double c) {
        angle1 = a;
        angle2 = b;
        angle3 = c;
    }

    public boolean isTriangleValid() {
        return (angle1 + angle2 + angle3) == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0;
    }
}

class ObtuseTriangle extends Triangle {
    public ObtuseTriangle(double angle1, double angle2, double angle3) {
        super(angle1, angle2, angle3);
    }

    public boolean isObtuseTriangle() {
        if (!isTriangleValid()) {
            return false;
        }

        return angle1 > 90 || angle2 > 90 || angle3 > 90;
    }
}

class AcuteTriangle extends Triangle {
    public AcuteTriangle(double angle1, double angle2, double angle3) {
        super(angle1, angle2, angle3);
    }

    public boolean isAcuteTriangle() {
        if (!isTriangleValid()) {
            return false;
        }

        return angle1 < 90 && angle2 < 90 && angle3 < 90;
    }
}

class RightAngleTriangle extends Triangle {
    public RightAngleTriangle(double angle1, double angle2, double angle3) {
        super(angle1, angle2, angle3);
    }

    public boolean isRightAngleTriangle() {
        if (!isTriangleValid()) {
            return false;
        }

        return angle1 == 90 || angle2 == 90 || angle3 == 90;
    }
}

 class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle 1: ");
        double angle1 = scanner.nextDouble();

        System.out.print("Enter angle 2: ");
        double angle2 = scanner.nextDouble();

        System.out.print("Enter angle 3: ");
        double angle3 = scanner.nextDouble();

        ObtuseTriangle obtuseTriangle = new ObtuseTriangle(angle1, angle2, angle3);
        AcuteTriangle acuteTriangle = new AcuteTriangle(angle1, angle2, angle3);
        RightAngleTriangle rightAngleTriangle = new RightAngleTriangle(angle1, angle2, angle3);

        if (obtuseTriangle.isObtuseTriangle()) {
            System.out.println("The triangle is an obtuse triangle.");
        } else if (acuteTriangle.isAcuteTriangle()) {
            System.out.println("The triangle is an acute triangle.");
        } else if (rightAngleTriangle.isRightAngleTriangle()) {
            System.out.println("The triangle is a right-angled triangle.");
        } else {
            System.out.println("The angles do not form a valid triangle.");
        }
    }
}
