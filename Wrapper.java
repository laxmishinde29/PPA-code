class Wrapper
{
    public static void main(String arg[])
    {
        Integer iobj = new Integer(11);
        int no =11;

        Integer i = no;     //Autoboxing

        int j = iobj.intValue();    //Boxing

        System.out.println(j);       //11
    }
}