import java.util.Scanner;

public class StudentCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentID = sc.nextLine();

        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();

        double totalCredit = 0, totalWeightedGPA = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nCourse " + i + ":");

            System.out.print("Credit (Max 3): ");
            double credit = sc.nextDouble();

            System.out.print("CT (Max 30): ");
            double ct = sc.nextDouble();

            System.out.print("AT (Max 10): ");
            double at = sc.nextDouble();

            System.out.print("FE (Max 60): ");
            double fe = sc.nextDouble();

            double total = ct + at + fe;
            double gpa = 0.0;

            if (total >= 80) gpa = 4.00;
            else if (total >= 75) gpa = 3.75;
            else if (total >= 70) gpa = 3.50;
            else if (total >= 65) gpa = 3.25;
            else if (total >= 60) gpa = 3.00;
            else if (total >= 55) gpa = 2.75;
            else if (total >= 50) gpa = 2.50;
            else if (total >= 45) gpa = 2.25;
            else if (total >= 40) gpa = 2.00;
            else gpa = 0.00;

            totalCredit += credit;
            totalWeightedGPA += (gpa * credit);
        }

        double cgpa = totalWeightedGPA / totalCredit;

        String grade;
        if (cgpa >= 4.00) grade = "A+";
        else if (cgpa >= 3.75) grade = "A";
        else if (cgpa >= 3.50) grade = "A-";
        else if (cgpa >= 3.25) grade = "B+";
        else if (cgpa >= 3.00) grade = "B";
        else if (cgpa >= 2.75) grade = "B-";
        else if (cgpa >= 2.50) grade = "C+";
        else if (cgpa >= 2.25) grade = "C";
        else if (cgpa >= 2.00) grade = "D";
        else grade = "F";

        System.out.println("\n--- Student Result ---");
        System.out.println("Student ID: " + studentID);
        System.out.println("Credit Taken: " + (int) totalCredit);
        System.out.println("Credit Earned: " + (int) totalCredit);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Grade: " + grade);
    }
}
