// Create a base class “Automobile”. An Automobile contains data members ‘make’, ‘type’, ‘maxSpeed’, ‘price’, ‘mileage’, ‘registrationNumber’ etc. with their reader/writer methods. Now create two sub-classes “Track” and “Car”. Track has data members ‘capacity’, ‘hoodType’, ‘noOfWheels’ etc. Car has data members ‘noOfDoors’, ‘seatingCapacity’ and their reader/writer methods. Create a main() function to demonstrate this.

class Automobile {
    private String make;
    private String type;
    private int maxSpeed;
    private double price;
    private double mileage;
    private String registrationNumber;

    public Automobile(String make, String type, int maxSpeed, double price, double mileage, String registrationNumber) {
        this.make = make;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.mileage = mileage;
        this.registrationNumber = registrationNumber;
    }
    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Type: " + type);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage);
        System.out.println("Registration Number: " + registrationNumber);
    }

    
}

class Truck extends Automobile {
    private int capacity;
    private String hoodType;
    private int noOfWheels;

    public Truck(String make, String type, int maxSpeed, double price, double mileage, String registrationNumber,
                 int capacity, String hoodType, int noOfWheels) {
        super(make, type, maxSpeed, price, mileage, registrationNumber); // Call superclass constructor
        this.capacity = capacity;
        this.hoodType = hoodType;
        this.noOfWheels = noOfWheels;
    }
}

class Car extends Automobile {
    private int noOfDoors;
    private int seatingCapacity;

    public Car(String make, String type, int maxSpeed, double price, double mileage, String registrationNumber,
               int noOfDoors, int seatingCapacity) {
        super(make, type, maxSpeed, price, mileage, registrationNumber); // Call superclass constructor
        this.noOfDoors = noOfDoors;
        this.seatingCapacity = seatingCapacity;
    }
}

public class problem4 {
    public static void main(String[] args) {
        
    
    Truck track = new Truck("BrandX", "Track", 200, 15000.0, 20.5, "Reg1", 2, "Open", 6);

        // Creating a Car object
        Car car = new Car("BrandY", "Sedan", 180, 20000.0, 25.0, "Reg2", 4, 5);

        // Printing details of the Track
        System.out.println("Track Details:");
        track.printDetails();

        // Printing details of the Car
        System.out.println("\nCar Details:");
        car.printDetails();
}
}
