import java.util.Scanner;
//class create
public class BuzzNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println("This is Buzz Number");
        } else {
            System.out.println("this is not Buzz Number");
        }
    }

}
