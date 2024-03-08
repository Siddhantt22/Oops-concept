class Room{
int height;
int width;
int breadth;
Room(int height,int width,int breadth)
{
    this.height=height;
    this.width=width;
    this.breadth=breadth;
}

public int volume()
{
    return height*width*breadth;
}
}

public class RoomDemo {
public static void main(String[] args) {
    
    Room Room1=new Room(20,40,60);
    System.out.println("The volume of Room1 :"+Room1.volume());

    Room Room2=new Room(80,20,90);
    System.out.println("The volume of Room2 :"+Room2.volume());

    Room Room3=new Room(2,6,5);
    System.out.println("The volume of Room3 :"+Room3.volume());

    


}
    
}