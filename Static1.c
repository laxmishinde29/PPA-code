#include<stdio.h>

void Marvellous()
{
    static int x = 10;
    x++;
    printf("value of X is : %d\n",x);
    
}

int main()
{
    printf("Demonstration of register storage class...\n");

    Marvellous();
    Marvellous();
    Marvellous();

    return 0;
}