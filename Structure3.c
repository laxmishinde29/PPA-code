#include<stdio.h>

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
    struct Student Pooja;

    printf("Size of object is : %d\n",sizeof(Amit));

    Amit.RollNo = 11;
    Amit.Division = 'A';
    Amit.Marks = 90.89;
    Amit.Age = 19;
    Amit.Salary = 21000;

    Pooja.RollNo = 21;
    Pooja.Division = 'D';
    Pooja.Marks = 93.89;
    Pooja.Age = 17;
    Pooja.Salary = 5000;


    printf("Age of Amit is :%d\n",Amit.Age);
    printf("Age of Pooja is :%d\n",Pooja.Age);

    printf("Salary of Amit is :%d\n",Amit.Age);
    printf("Salary of Pooja is :%d\n",Pooja.Age);


    return 0;
}