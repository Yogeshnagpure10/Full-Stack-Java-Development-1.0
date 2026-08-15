package Method;

public class MethodsInJava {

    public static void sum()
    {
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(a+b);
    }

    public static int sub()
    {
        int a = 20, b = 30;

        return a-b;
    }

    public void mul()
    {
        int a = 2, b = 20;

        System.out.println(a*b);
    }

    double div(int a,int b)
    {
        return a/b;
    }


    public static void main(String [] args)
    {
        sum();
        System.out.println(sub());

        MethodsInJava mj = new MethodsInJava();

        mj.mul();

        System.out.println(mj.div(20, 2));




    }
    
}
