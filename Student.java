import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    int a;
    String b;

    public Student(int c, String d){
        a=c;
        b=d;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name =sc.next();
        System.out.println("Enter Your ID");
        int id=sc.nextInt();



        Student myName = new Student(id,name);
        System.out.println("Your Name is  "+myName.b);
        System.out.println("Your Id is  "+myName.a);

    }
}
