class Base
{
    public void fun()
    {
        System.out.println("Inside base Fun");
    }
    public final void fun()
    {
        System.out.println("Inside base Gun");
    }
}

class Derived extends Base
{
    public void fun()
    {
        System.out.println("Inside derived Fun");
    }
    public void gun()
    {
        System.out.println("Inside derived Gun");
    }

}
class final2
{
    public static void main(String A[])
    {
        
    }
}