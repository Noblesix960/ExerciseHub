# Exercise Repository

This repository contains my solutions and exercises for programming practice in Java and C. It's a collection of code snippets and small projects that I've worked on to improve my skills.

## Table of Contents

- [Java Exercises](#java-exercises)
- [C Exercises](#c-exercises)
- [How to Use](#how-to-use)
- [Contributing](#contributing)
- [License](#license)

## C Exercises

### Exercise 1: [FirstExample]

An exercise that uses many function to get a String in input

// C code for Exercise 1

#include <stdio.h>
#include <string.h>
#define MAX_LIMIT 20

// My first program using nano with WSL2 

int main(int argc, char const *argv[]){

	char str[MAX_LIMIT];
	printf("Hi, tell me your name!\n-> ");

	// I can use different methods to get a string in input.

	// Using the function gets() UNSAFE, there is a chance of Buffer Overflow.
	// gets(str);

	// Using scanf(), ^\n tells to take input until newline doesn’t get encountered. ^(XOR operator)
	 scanf("%[^\n]s",str);

	// Using fgets, that is a safer version of gets as it uses MAX_LIMIT.
	// So there's no chance to get a Buffer Overflow.

	// fgets(str, MAX_LIMIT, stdin);
	// str[strlen(str) - 1] = '\0';

	printf("Hi %s!", str);

	return 0;
}


# Clone the repository
git clone https://github.com/Noblesix960/GitFirstTest

# Navigate to the C exercises
cd GitFirstTest/C/NanoTest/

# Compile and run main.c
gcc main.c -o main
./main

# Contributing
If you'd like to contribute to this repository, please follow these steps:

1. Fork the repository
2. Create a new branch ('git checkout -b feature/new-feature')
3. Make your changes
4. Commit your changes ('git commit -m 'Add new feature')
5. Push to the branch ('git push origin feature/new-feature')
6. Create a new pull request

License
This repository is licensed under the MIT License.
