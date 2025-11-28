package com.mycompany.finalchallenge3;
import java.util.Scanner;

public class FinalChallenge3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] students = new String[5];       // store 5 names
            double[][] grades = new double[5][3];    // 5 students × 3 subjects
            
            // Input student names
            System.out.println("Enter names of 5 students:");
            for (int i = 0; i < students.length; i++) {
                System.out.print("Student " + (i + 1) + ": ");
                students[i] = sc.nextLine().trim();
                if (students[i].isEmpty()) {
                    // if user pressed enter without a name, give a default placeholder
                    students[i] = "Student" + (i + 1);
                }
            }
            
            // Input grades for each student with validation
            System.out.println("\nEnter grades for each student (3 subjects each).");
            for (int i = 0; i < students.length; i++) {
                System.out.println("\nGrades for " + students[i] + ":");
                for (int j = 0; j < grades[i].length; j++) {
                    while (true) {
                        System.out.print("Subject " + (j + 1) + ": ");
                        String line = sc.nextLine().trim();
                        try {
                            double value = Double.parseDouble(line);
                            grades[i][j] = value;
                            break; // valid number, move on
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a numeric grade (e.g., 85 or 92.5). Try again.");
                        }
                    }
                }
            }
            
            // Display each student's average grade (formatted to 2 decimal places)
            System.out.println("\n===== Student Average Grades =====\n");
            for (int i = 0; i < students.length; i++) {
                double sum = 0;
                for (int j = 0; j < grades[i].length; j++) {
                    sum += grades[i][j];
                }
                double average = sum / grades[i].length;
                System.out.printf("%s - Average Grade: %.2f%n", students[i], average);
            }
        } // store 5 names
    }
}