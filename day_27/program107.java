import java.util.Scanner;

public class SalaryManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String empName;
        double basicSalary, bonus, totalSalary;

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();

        totalSalary = basicSalary + bonus;

        System.out.println("Salary Details");
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);

    }
}