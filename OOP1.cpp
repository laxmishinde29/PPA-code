#include<iostream>
using namesapce std;

//class declaration
class Demo
{
    public:         //access specifier
        int no1;    //characteristics
        int no2;    //characteristics

        Demo()
        {
            cout<<"Inside Costructor\n";
            no1 = 11;
            no2 = 21;
        }
        ~Demo()     //Destructor
        {
            cout<<"Inside Destructor\n";
        }
        void Fun()  //Behaviour
        {
            cout<<"Inside Fun of Demo class\n";
        }
};

int main()
{
    cout<<"Inside main\n";
    Demo obj1;
    cou<<"Value of no1 : "<<obj.1.no1<<"\n";
    cou<<"Value of no2 : "<<obj.1.no2<<"\n";
    obj1.Fun();

    return 0;
}