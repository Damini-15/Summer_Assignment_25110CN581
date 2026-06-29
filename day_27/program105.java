import java.util.Scanner;

public class StudentRecord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rollNo;
        String name;
        int marks;

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();

        System.out.println("Student Record");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

    }
}