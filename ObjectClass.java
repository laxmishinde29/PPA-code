/*
    get class()
    hashcode()
    equals()
    clone()
    finalize()
*/

class Marvellous
{}

//class ObjectClass extend Object
class ObjectClass
{
    public static void main(String arg[])
    {
        Object obj = new Marvellous();
        System.out.println(obj.getClass().getName());
    }
}