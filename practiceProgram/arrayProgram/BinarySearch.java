package arrayProgram;


 import java.util.Scanner;
public class BinarySearch {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5,6,22,25,26,27,28,29,30,41,45,50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the search element: ");
        int searchElement = sc.nextInt();

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
    

