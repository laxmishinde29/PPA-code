#include<stdio.h>

int main()
{
    int i = 11;                 //1byte
    char ch = 'A';              //4byte
    float f = 90.89;            //4byte
    double d = 90.768459;       //8byte

    int Arr[5];                 //20byte
    double Brr [5];             //40byte
    float Crr [5];              //20byte
    char Drr[5];                //5byte

    printf("%dlu\n",sizeof(i));
    printf("%dlu\n",sizeof(ch));
    printf("%dlu\n",sizeof(f));
    printf("%dlu\n",sizeof(d));

     printf("%dlu\n",sizeof(Arr));
      printf("%dlu\n",sizeof(Brr));
       printf("%dlu\n",sizeof(Crr));
        printf("%dlu\n",sizeof(Drr));


    return 0;
}