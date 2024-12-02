public class FC3UCEGT {
    public static void main(String[] args) {
        //student names
        String[] studentNames = {"Gio", "Renzo", "Leo", "Lee", "Straight"};

        //students
        int[][] grades = {
            {85, 90, 78}, // Grades for Gio
            {88, 76, 92}, // Grades for Renzo
            {70, 85, 80}, // Grades for Leo
            {90, 91, 89}, // Grades for Lee
            {60, 75, 70}  // Grades for Straight
        };

        //Calculate and display each student's average grade
        System.out.println("Student Grades and Averages:");
        for (int i = 0; i < studentNames.length; i++) {
            int total = 0;
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
            }
            double average = total / (double) grades[i].length;
            System.out.printf("%s: Average Grade = %.2f%n", studentNames[i], average);
        }
    }
}

