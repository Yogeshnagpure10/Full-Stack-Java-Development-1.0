package array;



public class ArraysMethod {

    public static void main(String [] args)
    {
        int arr [];
        arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

     //   System.out.println("Array first element is :"+ arr [0]);
     //   System.out.println("Array s element is :"+ arr [1]);
     //   System.out.println("Array first element is :"+ arr [2]);
     //   System.out.println("Array frist element is :"+ arr [3]);
     //   System.out.println("Array first element is :"+ arr [4]);

        // for(int i=0; i < arr.length ; i++)
        // {
        //     System.out.println("Array  "+ i + " index value "+ arr[i]);
        // }

        for (int a: arr )
        {
            System.out.println("Array value : "+ a);
        }

    }
    
}
