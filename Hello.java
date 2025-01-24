
abstract class Demo
{
    public int Addition(int A, intB)
    {   return A+B;     }
    public int Substraction(int A, intB)
    {   return A-B;     }
    public abstract int Multiplication(int A, int B);

}

class Mrvellous extend Demo
{
    public int Division(int A, int B)
    {   return A/B;   }
    public int Multiplication(int A, int B)
    {   return A*B; }
}

class Hello
{
    public static vois main(String arg[])
    {
        //Demo obj = new Demo();
        Mrvellous mobj = new Marvellous();
        System.out.println(mobj.Addition(10,11));
        System.out.println(mobj.Substraction(10,11));
        System.out.println(mobj.Muktiplication(10,11));
        System.out.println(mobj.Division(10,11));
    }
}