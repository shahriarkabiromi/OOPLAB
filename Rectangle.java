

public class Rectangle {
     int recLength;
     int recBreadth;

    public Rectangle(int length) {
        recLength = length;
        recBreadth = length;
    }

    public Rectangle(int length, int breadth) {
        recLength = length;
        recBreadth = breadth;
    }

    public void printType() {
        if (recLength == recBreadth) {
            System.out.println("It is a square");
        } else {
            System.out.println("It is a simple rectangle");
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(10);
        Rectangle rectangle = new Rectangle(10, 5);

        square.printType();
        rectangle.printType();
    }
}
