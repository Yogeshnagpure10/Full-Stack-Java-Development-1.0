package array;


import java.util.Scanner;

public class LiniyerSarch {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Search Element: ");

        int search = sc.nextInt();

        int element = 0 ;

        int arr [];
        
        arr = new int [10];

        arr [0] = 10;
        arr [1] = 20;
        arr [2] = 30;
        arr [3] = 40;
        arr [4] = 50;
        arr [5] = 60;
        arr [6] = 70;
        arr [7] = 80;
        arr [8] = 90;

        // for(int i=0; i<arr.length; i++)
        // {
        //     System.out.println("Array of index :"+ arr[i]);
        // }

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == search)
            {
                System.out.println("Element found "+arr[i]);
                break;
            }
        }
         
    }
    
}
