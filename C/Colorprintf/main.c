#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <unistd.h>
#include "colorprintf.h"

// Program that creates a hand of poker
// using the colorprintf

typedef enum {quadri, picche, cuori, fiori} semi;

int main(int argc, char const *argv[])
{   
    char *semistring[]={"\u2667", "\u2665", "\u2664", "\u2666"};
    char cartes[]="A23456789XJQK";
    semi seme[5];
    int carte[5], prova;
    srand((int)time(NULL));

    while (1)
    {
        for (int i = 0; i < 5; i++)
        {
            seme[i] = rand()%4;
            carte[i] = rand()%14;
        }
        for (int j = 0; j < 8; j++)
        {

            for (int i = 0; i < 5; i++)
            {

                if (cartes[(carte[i]+j)%13] == 88)
                {
                    colorprintf((seme[i]+j)%2-1, "10%s ", (semistring[(seme[i]+j)%4]));
                    usleep(35000);
                    fflush(stdout);
                }
                else{

                    colorprintf((seme[i]+j)%2-1, "%c%s ", cartes[(carte[i]+j)%13], (semistring[(seme[i]+j)%4]));
                    usleep(35000);
                    fflush(stdout);
                } 
                
            }
            
            printf("\r");
        }
        getchar();
    }
    

    return 0;
}