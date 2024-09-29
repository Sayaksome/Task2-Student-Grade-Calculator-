import java.util.Scanner;

class Grading {
    public String getGrade(int average) {
        switch (average / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class GradeAssessment {
    public static void main(String[] args) {
        Grading grading = new Grading();
        Scanner input = new Scanner(System.in);

        // Input for number of subjects
        System.out.print("Enter the number of subjects: ");
        int subjectCount = input.nextInt();
        int totalMarks = 0;

        // Collect marks for each subject
        for (int index = 0; index < subjectCount; index++) {
            System.out.print("Enter marks for subject " + (index + 1) + ": ");
            int marks = input.nextInt();
            totalMarks += marks;
        }

        // Calculate average percentage
        int averagePercentage = totalMarks / subjectCount;

        // Get the corresponding grade
        String finalGrade = grading.getGrade(averagePercentage);

        // Output the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + finalGrade);

        input.close();
    }
}
