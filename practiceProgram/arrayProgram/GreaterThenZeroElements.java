import java.util.Scanner;

public class GreaterThenZeroElements{

       public static void main(String [] args){

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter size of array ");
            int size=sc.nextInt();
            int arr[];
            arr=new int[size];

            int count = 0;


            for (int i=0;i<size;i++){
                System.out.println("Enter the "+(i+1)+" element");
                arr[i]=sc.nextInt();

               

            }
            System.out.println("Greater than zero number");

            for(int a:arr){
                 if(a>0){
                    System.out.print(a+",");
                    count ++;
                }
                
            }

            System.out.print("Number of greater than zero values "+ count);
   
           
       }
 }
    

