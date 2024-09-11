import java.util.Scanner;

public class carTester{

    
    
    
    
    public static void main (String[] args){
        String name;
        double miles;
        double gallons;
        
        Scanner info = new Scanner(System.in);
        
        System.out.println("Please enter the car's name: ");
        name = info.nextLine();
        System.out.println("Please enter cars miles: ");
        miles = info.nextDouble();
        System.out.println("Please enter cars gallons: ");
        gallons = info.nextDouble();
        
        Car car1 = new Car(name, miles, gallons);
        System.out.println(car1.toString());
        
        System.out.println("----------------Next Car-----------------------");
        
        String name2;
        double miles2;
        double gallons2;
        
        System.out.println("Please enter the car's name: ");
        name2 = info.nextLine();
        System.out.println("Please enter cars miles: ");
        miles2 = info.nextDouble();
        System.out.println("Please enter cars Gallons: ");
        gallons2 = info.nextDouble();
        
        Car car2 = new Car(name2, miles2, gallons2);
        System.out.println(car2.toString());
    }
    
    
    
    
    
}

