import java.util.Scanner;

public class carTester{
    Scanner info = new Scanner(System.in);
    public void addCar(){
        System.out.println("Please enter the car's name: ");
        String name = info.nextLine();
        System.out.println("Please enter cars miles: ");
        Double miles = info.nextDouble();
        System.out.println("Please enter cars gallons: ");
        Double gallons = info.nextDouble();
        
        Car car1 = new Car(name, miles, gallons);
        car1.toString();
    }
    
    /*public void addCar(){
        System.out.println("Please enter the car's name: ");
        String name = info.nextLine();
        System.out.println("Please enter cars miles: ");
        Double miles = info.nextDouble();
        System.out.println("Please enter cars gallons: ");
        Double gallons = info.nextDouble();
        
        Car car1 = new Car(name, miles, gallons);
        car1.toString();
    }*/
    
    public static void main (String[] args){
        
        Car1.carTester = new carTester();
        
        
        
    }
    
    
    
    
    
}
