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

An exercise where i use different methods to get a string in input

```c
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
```

## How to Use

To get started with the exercises, follow these steps:

### Cloning the Repository

Clone this repository to your local machine using the following command:

```bash
# Clone the repository
git clone https://github.com/Noblesix960/GitFirstTest.git

# Navigate to the C exercises
cd GitFirstTest/C/NanoTest/

# Compile and run Exercise 1
gcc main.c -o main
./main
