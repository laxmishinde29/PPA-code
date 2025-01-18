

class Marvellous
{
    public int i,j;

    public Marvellous()
    {
        System.out.println("Marvellous Constructor");
    }
    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}

class ObjectClass
{
    public static void main(String arg[])
    {
        Marvellous obj = new Marvellous();
        System.out.println(obj.hashCode());
        obj = null;
        System.gc();
    }
}