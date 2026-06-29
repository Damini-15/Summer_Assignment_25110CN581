import java.util.Scanner;

public class LibraryManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String bookName;
        String studentName;

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.println("Library Record");
        System.out.println("Book Name: " + bookName);
        System.out.println("Issued To: " + studentName);
        System.out.println("Status: Book Issued Successfully");

    }
}