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
```

## Contributing

If you'd like to contribute to this repository, follow these steps:

1. **Fork the repository:** Click the "Fork" button on the top right of this page to create your copy of the repository.

2. **Clone the repository:** Clone your forked repository to your local machine using the following command:

   ```bash
   git clone https://github.com/your-username/exercise-repository.git
   
   ```
3. **Create a new branch:** Before making changes, create a new branch to work on. Use a branch name that describes the feature or fix you're working on.
	```bash
	git checkout -b feature/new-feature

	```

4. **Make your changes:** Implement the feature or fix the issue. Ensure your code follows the project's coding guidelines.

5. **Commit your changes:** Once you're satisfied with your changes, commit them using descriptive commit messages.
	```bash
	git commit -m 'Add new feature'

	```

6. **Push to the branch:** Push your changes to your forked repository.
	```bash
	git push origin feature/new-feature
	
	```
7. **Create a pull request:** Visit your forked repository on GitHub and create a pull request. Provide a clear title and description for your changes.

I appreciate your contributions! They help me improve and maintain the quality of this project.