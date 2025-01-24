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

class Derived extends Base 
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

class DerivedX extends Base
{
    public P,Q;
    public Derived()
    {
        Sysytem.out.println("DerivedX constructor");
    }
    public void Sun()
    {
        System.out.println("Inside Derived Sun");
    }
}

class Hierachal
{
    public static void main(String arg[])
    {
        DerivedX dobj1 = new Derived();

        DerivedX dobj2 = new Derived();        
    }
}