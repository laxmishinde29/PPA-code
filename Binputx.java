import java.io.*;

class Binput
{
    public static void main(String arg[])
    {
        try
        {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name :");
        String name = bobj.readLine();

        System.out.println("Welcome :"+name);
        }
        catch(IOException obj)
        {}
    }
}