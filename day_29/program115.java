import java.util.Scanner;

public class StringOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str;
        int choice;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.println("1. Convert to Uppercase");
        System.out.println("2. Convert to Lowercase");
        System.out.println("3. Find Length");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Uppercase: " + str.toUpperCase());
                break;

            case 2:
                System.out.println("Lowercase: " + str.toLowerCase());
                break;

            case 3:
                System.out.println("Length: " + str.length());
                break;

            default:
                System.out.println("Invalid Choice");
        }

    }
}