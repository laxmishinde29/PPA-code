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

class DerivedX extends Derived
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
class Multilevel
{
    public static void main(String arg[])
    {
        DerivedX dobj = new DerivedX();
        dobj.Fun();
        dobj.Gun();
        dobj.Sun();
        
    }
}