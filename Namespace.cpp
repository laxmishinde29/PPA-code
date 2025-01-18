#include<iostream>


namespace Marvellous
{
    class Demo
    {

    };
}

namespace PPA 
{
    class Hello
    {

    };
}
using namespace Marvellous;

int main()
{
    std :: cout<<"Inside main\n";
    Marvellous :: Demo obj;
    PPA :: Hello hobj;

    return 0;
}

