public class MethodOverloading1 {

      

     int add(int a, int b)
    {
        
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }
    float add(float a, float b)
    {
        return a+b;
    }
    long add(long a, long b)
    {
        return a+b;
    }

    int sub(int a, int b)
    {
        return a-b;
    }
    double sub(double a, double b)
    {
        return a-b;
    }
    float sub(float a, float b)
    {
        return a-b;
    }
    long sub(long a, long b)
    {
        return a-b;
    }

    int mull(int a, int b)
    {
        return a*b;
    }
    double mull(double a, double b)
    {
        return a*b;
    }
    float mull(float a,float b)
    {
        return a*b;
    }
    long mull(long a,long b)
    {
        return a*b;
    }

    int div(int a,int b)
    {
        return a/b;
    }
    double div(double a, double b)
    {
        return a/b;
    }
    float div(float a,float b)
    {
        return a/b;
    }
    long div(long a,long b)
    {
        return a/b;
    }


    public static void main(String [] args)
    {
        MethodOverloading1 mo = new MethodOverloading1();

        System.out.println("Addition ");
        System.out.println(mo.add(20, 30));
        System.out.println(mo.add(25.00, 36.09));
        System.out.println(mo.add(35.6f, 64.4f));
        System.out.println( mo.add(234467L, 8756332L));
        System.out.println("<-------------------------------------------------->");
        
        System.out.println("Subtraction ");
        System.out.println(mo.sub(25, 60));
        System.out.println(mo.sub(50.00, 60.09));
        System.out.println(mo.sub(354.6f, 674.4f));
        System.out.println( mo.sub(8234467L, 68756332L));

        System.out.println("<------------------------------------------------>");

        System.out.println("Multiplication ");
        System.out.println(mo.mull(245, 670));
        System.out.println(mo.mull(520.00, 640.09));
        System.out.println(mo.mull(3454.6f, 6774.4f));
        System.out.println( mo.mull(82134467L, 668756332L));
        System.out.println("<----------------------------------------------->");

        System.out.println("Division ");
        System.out.println(mo.div(425, 670));
        System.out.println(mo.div(504.00, 608.09));
        System.out.println(mo.div(3546.6f, 6749.4f));
        System.out.println( mo.div(82534467L, 689756332L));





    }
    
}
