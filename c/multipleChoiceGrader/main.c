#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

// Function prototypes
void getAnswers(char answers[], int questionsNumber);
bool checkUpper(char answers[]);

int main(int argc, char const *argv[])
{
    int questionsNumber = 0, studentsNumber;

    // Input the number of questions and students
    scanf("%d %d", &questionsNumber, &studentsNumber);
    fflush(stdin);

    // Array to store correct answers
    char answers[questionsNumber];
    
    // Input correct answers
    getAnswers(answers, questionsNumber);

    // Array to store each student's answers
    char studentsAnswers[questionsNumber];

    // Open a file for writing the output
    FILE *fp = fopen("output.txt", "w");
    if (fp == NULL)
    {
        printf("Unable to create the file.\n");
        exit(EXIT_FAILURE);
    }
    
    // Loop through each student
    for (int i = 0; i < studentsNumber; i++)
    {
        // Input the student's answers
        getAnswers(studentsAnswers, questionsNumber);

        int k = 0, count = 0;

        // Check each answer against the correct answers
        for (int j = 0; studentsAnswers[j] != '\0'; j++)
        {
            if (studentsAnswers[j] == answers[k++])
            {
                count++;
            }
        }

        // Write the count to the output file
        fprintf(fp, "%d\n", count);
    }

    // Close the file
    fclose(fp);

    printf("Done!\n");

    return 0;
}

// Function to input answers and validate them
void getAnswers(char answers[], int questionsNumber)
{
    bool upperFlag = false;

    // Loop until valid answers are entered
    while (!upperFlag)
    {
        printf("Enter answers (A, B, C, D, ?) for %d questions:\n", questionsNumber);
        
        // Input answers
        fgets(answers, questionsNumber + 1, stdin);
        fflush(stdin);
        
        // Check if answers are valid
        upperFlag = checkUpper(answers);
        
        if (!upperFlag)
        {
            printf("Invalid input. Answers should be A, B, C, D, or ? only.\n");
        }
    }
}

// Function to check if answers contain only valid characters
bool checkUpper(char answers[])
{
    for (int i = 0; answers[i] != '\0'; i++)
    {
        if ((answers[i] < 'A' || answers[i] > 'D') && answers[i] != '?')
        {
            return false;
        }
    }
    return true;
}
