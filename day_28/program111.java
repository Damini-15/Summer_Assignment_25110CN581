import java.util.Scanner;

public class TicketBooking
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name;
        int tickets;
        int price = 200;
        int total;

        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        tickets = sc.nextInt();

        total = tickets * price;

        System.out.println("--- Ticket Details ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Tickets Booked: " + tickets);
        System.out.println("Price per Ticket: " + price);
        System.out.println("Total Amount: " + total);

    }
}