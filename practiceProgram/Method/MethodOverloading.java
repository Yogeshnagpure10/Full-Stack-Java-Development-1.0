import java.util.Scanner;

public class MethodOverloading
{
    int sum()
    {
        return 10+20;
    }

    int sum(int a, int b)
    {
        System.out.println("Return integer addition");
        return a+b;
    }

    double sum(double a,double b)
    {
        return a+b;
    }

    public static void main(String [] args)
    {
        MethodOverloading mo = new MethodOverloading();

       System.out.println( mo.sum());
        
       System.out.println( mo.sum(2.000,4.0000));
       System.out.println( mo.sum(40,60));
    }
}