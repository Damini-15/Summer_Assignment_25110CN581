import java.util.Scanner;

public class StudentManagement
{

    static String[] name = new String[10];
    static int[] age = new int[10];
    static double[] marks = new double[10];
    static int count = 0;


    static void addStudent(Scanner sc)
    {
        System.out.print("Enter Name: ");
        name[count] = sc.next();

        System.out.print("Enter Age: ");
        age[count] = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();

        count++;
        System.out.println("Student Added Successfully!");
    }


    static void displayStudents()
    {
        if (count == 0)
        {
            System.out.println("No Records Found!");
            return;
        }

        System.out.println("\nStudent Records");
        for (int i = 0; i < count; i++) {
            System.out.println("Name: " + name[i]);
            System.out.println("Age: " + age[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\n----- Student Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        }
        while (choice != 3);
    }
}