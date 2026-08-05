package operator;
public class Increment_Decrement_Arithmetic_Operations {
    static  void example1()
    {
        /*Declear and initialize a variable */
        int a = 10;
        int b = 3;

        /*declear step1 variable performing operation */
        int step1 = a++*b;     /*10*3=30 Preincrement*/ 
        int step2 = ++a+b;   /*12+3=15 Predecrement*/
        int step3 = a--%b;    /* 12%3=0  Postincrement*/

        int result = step1 + step2 -step3; /*total Result = 45 */

        System.out.println("Step1 = "+step1);
        System.out.println("Step2 = "+step2);
        System.out.println("Step3 = "+step3);
        System.out.println("Result for Example1 = "+result);

    }

    static void example2()
    {
        /*Declear and initialize a variable */
        int a = 15;
        int b = 4;

        /*declear step1 variable performing operation */

        int step1 = ++a*++b;   /*predecrement  16*5 predecrement = 80 */
        int step2 = a/b;       /*16/5 = 3 */
        int step3 = a++ - b--;   /*preincrement  16*5 postincrment = 11 */

        int result = step1 + step2 + step3;   /*result = 94*/

        System.out.println("Step1 = "+step1);
        System.out.println("Step2 = "+step2);
        System.out.println("Step3 = "+step3);
        System.out.println("Result for Example2 = "+result);

    }
    static  void example3()
    {
        /*Declear and initialize a variable */
        int a = 8;
        int b = 5;

        /*declear step1 variable performing operation */

        int step1 = a++ + b * 2;     /*preincrement  8+10 = 18 */
        int step2 = ++a * b;          /*predecrement  10*5 = 50 */
        int step3 = a--/b;            /*postdecrement  10/5 = 2 */

        int result = step1 + step2 +step3;   /*result = 70 */

        System.out.println("Step1 = "+step1);
        System.out.println("Step2 = "+step2);
        System.out.println("Step3 = "+step3);
        System.out.println("Result for Example3 ="+result);

    }

    static void example4()
    {
        /*Declear and initialize a variable */
        int a = 20;
        int b = 6;

        /*declear step1 variable performing operation */

        int step1 =a/b;    /*20/6 = 3 */
        int step2 = ++a * b;   /*preincrement  21 * 6 = 126  */
        int step3 = a++ % b;    /*predecrement  21%6 = 3 */

        int result = step1 + step2 - step3;      /*total result = 126*/

        System.out.println("Step1 = "+step1);
        System.out.println("Step2 = "+step2);
        System.out.println("Step3 = "+step3);
        System.out.println("Result for Example4 ="+result);
        
    }

    static  void example5()
    {
        /*Declear and initialize a variable */
        int a = 12;
        int b = 7;

        /*declear step1 variable performing operation */

        int step1 = a++ * b;    /*predecrement  12*7 = 84 */
        int step2 = --a + ++b;    /*postdecrement  12*8 = 20 */
        int step3 = a % b;         /*12%4 = 4*/

        int result = step1 + step2 + step3;   /*total result =108 */

        System.out.println("Step1 ="+step1);
        System.out.println("Step2 ="+step2);
        System.out.println("Step3 ="+step3);
        System.out.println("Result for Example5 ="+result);

    }
    
    static void example6()
    {
        /*Declear and initialize a variable */
        int a = 9;
        int b = 2;

        /*declear step1 variable performing operation */

        int step1 = ++a * b;  /*preincrement  10*2 = 20 */
        int step2 = a++ /b;    /*predecrement  10/2 = 5 */
        int step3 = --a % b;    /*postdecrement 10%2 = 0*/

        int result = step1 + step2 - step3;    /*total result  = 25*/

        System.out.println("Step1 ="+step1);
        System.out.println("Step2 ="+step2);
        System.out.println("Step3 ="+step3);
        System.out.println("Result for Example6 ="+result);

    }

    static void example7()
    {
       /*Declear and initialize a variable */ 
        int a = 18;
        int b = 4;

        /*declear step1 variable performing operation */
          int step1 =a++ * ++b;   /*predecrement  18*5 =90 */
         int step2 = a/b;          /*18/4  =3*/
         int step3 = a-- + b--;     /*postdecrement  19+5 = 24 */

         int result = step1 + step2 +step3;      /*total result = 117*/

         System.out.println("Step1 = " +step1);
         System.out.println("Step2 ="+step2);
         System.out.println("Step3 = " +step3);
         System.out.println("Result for Example7 ="+result);

    }

    static void example8()
    {
        /*Declear and initialize a variable */
        int a = 25;
        int b = 5;

        /*declear step1 variable performing operation */

        int step1 = a/b;      /*25/5 =5 */
        int step2 = ++a * b;    /*preincrement  26*5 = 130 */
        int step3 = a++ % b;     /*predecrement  26%5 = 1 */

        int result = step1 + step2 + step3;      /*total result  = 136 */

        System.out.println("Step1 = "+step1);
        System.out.println("Step2 ="+step2);
        System.out.println("Step3 ="+step3);

        System.out.println("Result for Example8 ="+result);

    }

    static void example9()
    {
       /*Declear and initialize a variable */ 
        int a = 14;
        int b = 3;

        /*declear step1 variable performing operation */
        
        int step1 = ++a * b;      /*preincrement  15*3 = 45 */
        int step2 = a++ +b;        /*predecrement  15+3 = 18 */
        int step3 = --a/b;          /*postdecrement  15/3 = 5 */

        int result = step1 +step2 -step3;    /*total result 58 */

        System.out.println("Step1 ="+step1);
        System.out.println("Step2 ="+step2);
        System.out.println("Step3 ="+step3);
        System.out.println("Result for Example9 ="+result);
    }
    

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
        example8();
        example9();

        
        }
    }

