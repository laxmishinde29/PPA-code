
class Base
{
    public int A,B;
    public void Fun()
    {   System.out.println("Inside Base Fun");    }
    public void Gun()
    {   System.out.println("Inside Base Gun");    }
    public void Sun()
    {   System.out.println("Inside Base Sun");    }
    public void Run()
    {   System.out.println("Inside Base Run");    }
}

class Derived extends Base      //class Derived : public Base (in c++)
{
    public int X,Y;
    public void Gun()
    {   System.out.println("Inside Derived Gun");    }
    public void Run()
    {   System.out.println("Inside Derived Run");    }
    public void Mun()
    {   System.out.println("Inside Derived Mun");    }
}

class RMD
{
    public static void main(String arg[])
    {
       Base bobj = ner Derived();
       bobj.Fun();
       bobj.Gun();
       bobj.Sun();
       bobj.Run();
       bobj.Mun();
       
    }
}