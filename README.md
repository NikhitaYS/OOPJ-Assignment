OOPJ_Assignment..  
Here we are using Spring Tool Software
Here's a description for our project Exam Seat Arrangement

Key Features:-
Arranges seats for students with USNs in a specific range.
Utilizes abstract classes for flexibility.
Accepts USN range and dynamically assigns seats.
Handles sorting and seat allocation logically.

Attributes:-
USN Range: Defines the start (X) and end (Y) of USNs for seat arrangement.
Row: Represents the row in which students are seated.
Seat: Represents the specific seat number within a row.

File Format:-
Input: User enters a USN range (e.g., X = 1, Y = 10).
Output: Displays the seating arrangement in the console.

How It Works:-
Input Validation:
The program takes the range of USNs (X to Y) from the user.
Ensures the start USN is less than or equal to the end USN.
Abstract Class:
The abstract class SeatArrangement defines the method arrangeSeats for flexibility.
This method is implemented in the subclass ExamSeatArrangement.
Dynamic Seat Assignment:
Iterates through USNs from X to Y.
For each USN:
Assigns a row and seat number.
Moves to the next row when the current row is filled (default: 5 seats).
Output Generation:
Displays each row and seat with the corresponding USN in a structured format.

Execution Example:-
Input:
Enter starting USN (X): 1  
Enter ending USN (Y): 12
Output:
Exam Seat Arrangement:
Row: 1, Seat: 1 -> USN: USN001
Row: 1, Seat: 2 -> USN: USN002
Row: 1, Seat: 3 -> USN: USN003
Row: 1, Seat: 4 -> USN: USN004
Row: 1, Seat: 5 -> USN: USN005
Row: 2, Seat: 1 -> USN: USN006
Row: 2, Seat: 2 -> USN: USN007
Row: 2, Seat: 3 -> USN: USN008
Row: 2, Seat: 4 -> USN: USN009
Row: 2, Seat: 5 -> USN: USN010
Row: 3, Seat: 1 -> USN: USN011
Row: 3, Seat: 2 -> USN: USN012

Applications:-
Exams: Organizes seat arrangements based on roll numbers or USNs.
Workshops: Efficiently allocates seats for participants.
Testing Centers: Automates candidate placements.

Features:-
Generating output in a file.
Adding more attributes such as name, course, etc.
Validating input for duplicate or invalid USNs.

Advantages:-
Modular Design: Can be extended to include additional features (e.g., save to file, handle multiple seat limits).
Dynamic and Scalable: Handles any range of USNs and adapts to changes.
User-Friendly: Simple input-output format.
You can customize this program further, such as adding names, handling duplicate USNs, or exporting the arrangement to a file.
Seat Capacity per Row: Default is 5 seats per row.
