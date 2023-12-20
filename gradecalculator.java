
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();
        
        char grade;

        if (marks >= 80 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 65 && marks < 80) {
            grade = 'B';
        } else if (marks >= 50 && marks < 65) {
            grade = 'C';
        } else {
            grade = 'F'; // Fail
        }

        System.out.println("Student's grade: " + grade);

        scanner.close();
    }
}
