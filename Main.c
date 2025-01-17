#include<stdio.h>

int x =21;

extern int no;
extern void Marvellous();
int main()
{
    printf("Value of c is :%d\n",x);

    printf("Value of c is :%d\n",no);

    Marvellous();

    return 0;
}