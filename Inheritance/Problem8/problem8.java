// Imagine a toll booth and a bridge. Cars passing by the booth are expected to pay an amount of Rs. 50/- as toll tax. Mostly they do but sometimes a car goes by without paying. The toll booth keeps track of the number of the cars that have passed without paying, total number of cars passed by, and the total amount of money collected. Execute this with a class called “Tollbooth” and print out the result as follows: The total number of cars passed by without paying. Total number of cars passed by. Total cash collected.

class tollbooth{
    int totalAmount;
    int totalwithoutpaying;
    int totalcarspaying;

    tollbooth()
    {
         totalAmount=0;
         totalwithoutpaying=0;
         totalcarspaying=0; 
    }

    void carpasses()
    {
         totalcarspaying++;
         totalAmount+=50;

    }
    void carpasseswithoutpaying(){
        totalwithoutpaying++;
    }
    void print()
    {
        System.out.println("Total number of cars passed by without paying: " + totalwithoutpaying);
        System.out.println("Total number of cars passed by: " + totalcarspaying);
        System.out.println("Total cash collected: Rs. " + totalAmount);
    }

}
public class problem8 {
    public static void main(String[] args) {
        
    

    tollbooth toll=new tollbooth();

    toll.carpasses();
    toll.carpasses();
    toll.carpasseswithoutpaying();
    toll.carpasseswithoutpaying();
    toll.carpasses();
    toll.carpasses();
    toll.carpasses();
    toll.carpasses();
    toll.carpasseswithoutpaying();
    toll.carpasses();
    toll.carpasses();

    toll.print();

}
}
