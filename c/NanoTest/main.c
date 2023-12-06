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
