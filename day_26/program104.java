import java.util.Scanner;
public class Quiz
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int ans;

        System.out.println("Java Quiz");

        System.out.println("1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Chennai");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 2)
        {
            score++;
        }

        System.out.println("2. Which keyword is used to create an object in Java?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. this");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if (ans == 2)
        {
            score++;
        }

        System.out.println("Your Score = " + score + "/2");
    }
}