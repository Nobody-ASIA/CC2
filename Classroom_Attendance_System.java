import java.util.Scanner;

public class Classroom_Attendance_System {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int students;
        int presentCount = 0;
        int absentCount = 0;

        // Total students
        System.out.print("Enter the number of students in the class: ");
        students = scnr.nextInt();
        scnr.nextLine(); // Consume the newline character

        // Ask whether each student is present or absent
        for (int i = 1; i <= students; i++) {
            System.out.print("Is student " + i + " present? (Y/N): ");
            String response = scnr.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                presentCount++;
            } else if (response.equalsIgnoreCase("N")) {
                absentCount++;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                i--; // Decrement i to repeat the question for the same student
            }
        }

        // Display the final counts
        System.out.println("Total present: " + presentCount);
        System.out.println("Total absent: " + absentCount);

        scnr.close();
    }
}
