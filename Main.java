package pkg;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting USN: ");
        int startUSN = scanner.nextInt();

        System.out.print("Enter ending USN: ");
        int endUSN = scanner.nextInt();

        System.out.print("Enter the number of rows: ");
        int totalRows = scanner.nextInt();

        System.out.print("Enter the number of columns per row: ");
        int totalColumns = scanner.nextInt();

        if (startUSN > endUSN || totalRows <= 0 || totalColumns <= 0) {
            System.out.println("Invalid input. Please check the range and number of rows/columns.");
            return;
        }

        System.out.println("\nExam Seat Arrangement:");
        int currentRow = 1, currentColumn = 1;
        int seatsPerRow = totalColumns;

        for (int usn = startUSN; usn <= endUSN; usn++) {
            System.out.printf("Row: %d\t\t Column: %d\t\t  USN: USN%03d%n", currentRow, currentColumn, usn);
            currentColumn++;

            if (currentColumn > seatsPerRow) {
                currentRow++;
                currentColumn = 1;
               
                if (currentRow > totalRows) {
                    System.out.println("No more seats available!");
                    break;
                }
            }
        }
    }
}