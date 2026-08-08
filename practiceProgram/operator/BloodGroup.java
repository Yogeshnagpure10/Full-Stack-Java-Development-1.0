package operator;

import java.util.Scanner;

public class BloodGroup {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Blood group: ");

        String bloodGroup = sc.nextLine() .toUpperCase();

        switch(bloodGroup)
        {
            case "A+":
            System.out.println("Your Bload group A Positive ");
            break;

            case "A-":
            System.out.println("your blood group A nigative ");
            break;

            case "B+":
            System.out.println("your blood group B Positive ");
            break;

            case "B-":
            System.out.println("your blood group B negative");
            break;

            case "AB+":
            System.out.println("Your blood group AB Positive");
            break;

            case "AB-":
            System.out.println("Your blood group AB negative");
            break;

            case "O+":
            System.out.println("Your blood group O Positive");
            break;

            case "O-":
            System.out.println("Your blood group O Negative");
            break;

            default:

            System.out.println("Your Invalid Blood group");


        }
        sc.close();
    }
}
