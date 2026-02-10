import java.util.Scanner;

public class StudentResultSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        // Marks input
        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int m3 = sc.nextInt();

        // Calculations
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        // Result
        String result;
        if (m1 >= 35 && m2 >= 35 && m3 >= 35) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        // Output
        System.out.println("\n--- Student Result ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Result     : " + result);

        sc.close();
    }
}
