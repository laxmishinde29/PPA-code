class Oop
{
    public static void main(String arg[])
    {
        Arithmatic obj1 = new Arithmatic();
        Arithmatic obj2 = new Arithmatic(21,11);

        int Ret = 0;

        Ret = obj2.Addtion();
        System.out.println(Ret);        //32

        Ret = obj2.Substraction();
        System.out.println(Ret);        //10
    }
}

class Arithmatic
{
    public int No1;
    public int No2;

    public Arithmatic()
    {
        System.out.println("Inside Default Constructor");
        this.No1 = 0;
        this.No2 = 0;
    }
    public Arithmatic(int A, int B)
    {
        System.out.println("Inside Paramaterized Constructor");
        this.No1 = A;
        this.No2 = B;
    }
    public int Addition()
    {
        int Ans = 0;
        Ans = No1 + NO2;
        return Ans;
    }
    public int Substraction()
    {
        int Ans = 0;
        Ans = No1 - NO2;
        return Ans;
    }

}