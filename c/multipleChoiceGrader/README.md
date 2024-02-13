# Multiple Choice Grader

This program, named "Multiple Choice Grader," is designed to evaluate multiple-choice quizzes. It takes as input the correct answers and the responses from a group of students, then outputs the count of correctly matched answers for each student.

## How to Use

1. **Compile the Program:**
    ```bash
    make
    ```

2. **Run the Program:**
    ```bash
    ./main
    ```

3. **Input Format:**
    - First line: Number of questions and number of students (space-separated).
    - Second line: Correct answers (e.g., "ABCD?").

    For each student:
    - Enter the student's answers in the same format.

4. **Output:**
    - The program outputs the count of correct answers for each student to the "output.txt" file.

## Example

5 3
ABCD?
ACBDD
BACAC
ABDAB

Output in "output.txt":

2
1
3


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
