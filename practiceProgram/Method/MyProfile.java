

import java.util.Scanner;

public class MyProfile {


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fill the Details");

        
        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out .println("Enter your age");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter your college name");
        String college = sc.nextLine();

        System.out.println("Enter your RollNo");
        int rollno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your address");
        String address = sc.nextLine();

        System.out.println("<------------------------------------------------------------->");

        System.out.println("Name" +name);
        System.out.println("Age" +age);
        System.out.println("College" +college);
        System.out.println("RollNo"+rollno);



    }
    
}
