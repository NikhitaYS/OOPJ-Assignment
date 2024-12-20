OOPJ_Assignment..  
Here we are using Spring Tool Software
Here's a description for our project Exam Seat Arrangement

Key Features:-
Arranges seats for students with USNs in a specific range.
Utilizes abstract classes for flexibility.
Accepts USN range and dynamically assigns seats.
Handles sorting and seat allocation logically.

Attributes:-
USN Range: Defines the start and end of USNs for seat arrangement.
Row: Represents the row in which students are seated.
Seat: Represents the specific seat number within a row.

File Format:-
Input: User enters a USN range (e.g., X = 1, Y = 10).
Output: Displays the seating arrangement in the console.

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

How It Works:-
Inputs:
Starting USN (X) and Ending USN (Y).
Number of rows and columns per row.
Validation:
Ensures valid USN range and non-zero positive rows/columns.
Seat Allocation:
Iterates through USNs from X to Y.
Assigns each USN to a specific row and column.
Moves to the next row after filling the current row.
Stops assigning seats if all rows are filled.
Output:
Displays the seat arrangement row-wise and column-wise.

Example Execution:-
Input:
Enter starting USN (X): 1
Enter ending USN (Y): 12
Enter the number of rows: 2
Enter the number of columns per row: 5
Output:
Exam Seat Arrangement:
Row: 1   Column: 1    USN: USN001

Row: 1   Column: 2    USN: USN002

Row: 1   Column: 3    USN: USN003

Row: 1   Column: 4    USN: USN004

Row: 1   Column: 5    USN: USN005

Row: 2   Column: 1    USN: USN006

Row: 2   Column: 2    USN: USN007

Row: 2   Column: 3    USN: USN008

Row: 2   Column: 4    USN: USN009

Row: 2   Column: 5    USN: USN010

No more seats available!
