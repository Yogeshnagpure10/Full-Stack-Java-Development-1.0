package array;

public class ArrayProgram1 {

    public static void main(String [] args)
    {
        String arr [];

        arr = new String [10];

        arr [0] = "yogesh";
        arr [1] = "vishal";
        arr [2] = "sambhu";
        arr [3] = "subh";
        arr [4] = "kivi";
        arr [5] = "ryeu";
        arr [6] = "dvcj";
        arr [7] = "cbvk";
        arr [8] = "adskkl";
        arr [9] = "truw";

        // System.out.println("Array of first StringName : "+ arr[0]);
        // System.out.println("Array of second StringNam : "+ arr[1]);
        // System.out.println("Array of thierd String : "+ arr[3]);

        for (String i : arr)
        {
        System.out.println(i);
        }
    }
    
}
