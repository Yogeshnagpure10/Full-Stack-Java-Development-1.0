package arrayProgram;

import java.util.Scanner;

public class FloatBinarySearch {

    public static void main(String [] args)
    {
        
        float[] arr = {10.5f,20.5f,30.5f,40.5f,50.5f};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the search element: ");
        float searchElement = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == searchElement) {

                System.out.println("Element found at index: " + mid);
                return;

            } else if (arr[mid] < searchElement) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        System.out.println("Element not found.");
    }
}
    



    

