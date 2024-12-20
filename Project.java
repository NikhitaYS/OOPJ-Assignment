package pkg;
import java.util.Scanner;
public class Project {

    public static void displaySeatingArrangement(String[][] seats, int rows, int columns) {
        System.out.println("\nSeating Arrangement:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(String.format("%-15s", seats[i][j]));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows for seating arrangement: ");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns for seating arrangement: ");
        int columns = scanner.nextInt();  
        String[][] seats = new String[rows][columns];
        System.out.println("Enter total number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();  
        if (numberOfStudents > rows * columns) {
            System.out.println("Error: Number of students exceeds the available seats.");
            return; 
        }
        String[] students = new String[numberOfStudents];
        System.out.println("Enter student names:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }
        int studentIndex = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (studentIndex < numberOfStudents) {
                    seats[i][j] = students[studentIndex];
                    studentIndex++;
                } else {
                    seats[i][j] = "Empty";  
                }
            }
        }
        displaySeatingArrangement(seats, rows, columns);
        scanner.close();  
    }
}
