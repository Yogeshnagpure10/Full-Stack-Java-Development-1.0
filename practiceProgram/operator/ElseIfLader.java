package operator;


import java.util.Scanner;
public class ElseIfLader {

    public static void main(String[] args) 
        {
            //else if ladder senario base example
            Scanner sc = new Scanner(System.in);
            System.out.println("city name");
            String city = sc.nextLine();
            System.out.println("Area name");
            String area =sc.nextLine();
            System.out.println("Pincode");
            String pincode = sc.nextLine();
            System.out.println("target latitude in digits");
            double latitude=sc.nextDouble();
            System.out.println("target longitude");
            double longitude = sc.nextDouble();
            System.out.println("your current latitude");
            double currentLatitude = sc.nextDouble();
            System.out.println("your currrnt longitude");
            double currentLongitude = sc.nextDouble();
            int price = 0;

            //calculate distance between two points in km
            double latDistance = (latitude - currentLatitude) * 111.32;

            double lonDistance = (longitude - currentLongitude) * 111.32

            *Math.cos(Math.toRadians(currentLatitude));

            double distance = Math.sqrt(Math.pow(latDistance, 2) + 
            Math.pow(latDistance, 2 ));

            if(distance <= 5)
            {
                price = 50;
            }else if(distance > 5 && distance <= 10)
            {
                price = 100;
            }
            else if(distance > 10 && distance <= 20)
            {
                price = 150;

            }else if(distance > 20 && distance <= 30)
            {
                price = 200;
            }else
            {
                price = 250;
            }

            System.out.println("Delivery price for " + city + ","+ area + "," + pincode + "is: "+ price +" for distance of "+ distance + " km ");

        }
    }
    

