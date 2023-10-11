import java.util.Scanner;

class Odd {

     int odd;

    public void setOdd(int value) {
        if(value % 2 == 1) {
            this.odd = value;
        }
        else{
            throw new IllegalArgumentException("Value must be odd");
        }
    }

    public int getOdd() {
        return this.odd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an odd number: ");
        int value = scanner.nextInt();

        Odd oddNumber = new Odd();
        oddNumber.setOdd(value);

        System.out.println("The odd number is: " + oddNumber.getOdd());
    }
}
