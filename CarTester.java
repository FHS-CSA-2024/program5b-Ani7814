import java.util.Scanner;

public class carTester{
    Scanner info = new Scanner(System.in);
    public Car addCar(){
        System.out.println("Please enter the car's name: ");
        String name = info.nextLine();
        System.out.println("Please enter cars miles: ");
        Double miles = info.nextDouble();
        System.out.println("Please enter cars gallons: ");
        Double gallons = info.nextDouble();
        return new Car(name, miles, gallons);
    }
    
    public static void main (String[] args){
        
        Car car1 = new carTester().addCar();
        
        System.out.println(car1);
        
        System.out.println("-----------------NEXT CAR--------------");
        Car car2 = new carTester().addCar();
        System.out.println(car2);
        
        
    }   
}

/*
Please enter the car's name: 
Honda Civic
Please enter cars miles: 
234
Please enter cars gallons: 
100
Honda Civic averaged 2.3 m/s
-----------------NEXT CAR--------------
Please enter the car's name: 
Toad Mobile
Please enter cars miles: 
13
Please enter cars gallons: 
7
Toad Mobile averaged 1.9 m/s
*/
