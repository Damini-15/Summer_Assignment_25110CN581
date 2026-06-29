import java.util.Scanner;

public class EmployeeManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int empId;
        String name;
        double salary;

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        System.out.println("Employee Details");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}