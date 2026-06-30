import java.util.Scanner;

public class EmployeeManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        String[] department = new String[n];
        double[] salary = new double[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Department: ");
            department[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("\nEmployee Records");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + name[i]);
            System.out.println("Department: " + department[i]);
            System.out.println("Salary: " + salary[i]);
            System.out.println();
        }
    }
}