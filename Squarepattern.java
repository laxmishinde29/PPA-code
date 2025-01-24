import java.util.Scanner;

class Squarepattern
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        for(int i =1; i<=n;i++)
        {
            for(int j=1; j<=n;j++)
            {
                if((i*j)<100)
                {
                    System.out.print(" ");
                }
                System.out.print((i*j) + "  ");
            }
            System.out.println();
        }
    }
}