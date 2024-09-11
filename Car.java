public class Car {
    public static void main(String[] args){
        
    }
    
    private String carName;
    private double mileDriven;
    private double gallonsUsed;
    private double average;
    public Car(){
         this.carName = "";
         this.mileDriven = 0.0;
         this.gallonsUsed = 0.0;
    }
    
    public Car(String name, double miles, double gallons){
        carName = name;
        mileDriven = miles;
        gallonsUsed = gallons;
    }
    public String getcarName(){
         return carName;
    }
    public double getMilesDriven(){
        return mileDriven;  
    }
    public double getGallonsUsed(){
        return gallonsUsed;  
    }
    public void setCarName(String newCar){
        carName = newCar;
    }
    public void setmilesDriven(double newMiles){
        mileDriven = newMiles;
    }
    public void setGallonsUsed(double newGallons){
        gallonsUsed = newGallons;
    }
    public double average(){
        average = Math.round(mileDriven/gallonsUsed*10)/10;
        return average;
    }
    
    public String toString(){
        String result = carName+ " averaged "+ Math.round(mileDriven/gallonsUsed*10)/10 + " m/s";
        return result;
    }
}

