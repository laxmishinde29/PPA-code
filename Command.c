#include<stdio.h>

int main(int aargc, char *argv[])
{
    printf("Number of command line arguments are : %d\n",argc);

    for(i = 0; i<argc; i++)
    {
        printf("%s\n",argv[i]);
    }

    return 0;
}