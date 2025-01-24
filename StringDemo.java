class StringDemo
{
    public static void main(String Arg[])
    {
        String s1 = "Hello";
        String s2 = new String("Hello");

        char Arr[] = {'H','e','l','l','o'};
        String s3 = new String(Arr);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.lenght());
        System.out.println(s2.lenght());
        System.out.println(s3.lenght());
    }
}