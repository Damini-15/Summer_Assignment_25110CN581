import java.util.Scanner;

public class Marksheet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name;
        int m1, m2, m3, total;
        double percentage;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();

        total = m1 + m2 + m3;
        percentage = total / 3.0;

        System.out.println("Marksheet");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}