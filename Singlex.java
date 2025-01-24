class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base constructor");

    }
    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }
}

class Derived extends Base      //class Derived : public Base (in c++)
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived constructor");

    }
    public void Gun()
    {
        System.out.println("Inside Derived Fun");
    }
}

class Single
{
    public static void main(String arg[])
    {
        Base bobj1 = new Base();
        Derived dobj1 = new Derived();
        Base bobj2 = new Base();
        Derived dobj2 = new Derived();
        
    }
}