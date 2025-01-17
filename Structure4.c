#include<stdio.h>

#pragma pack(2)

struct Student 
{
    int RollNo;     
    char Division;
    int Age;
    float Marks;
    int Salary;

};

int main()
{
    struct Student Amit;
   

    printf("Size of object is : %d\n",sizeof(Amit));
    return 0;

}

    
