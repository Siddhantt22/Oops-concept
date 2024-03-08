
class Box{
    int height;
int width;
int breadth;
Box(int height,int width,int breadth)
{
    this.height=height;
    this.width=width;
    this.breadth=breadth;
}

public int getArea()
{
    return 2*breadth*height+2*breadth*width+2*height*width;
}

public int getVolume()
{
    return height*width*breadth;
}
}
public class problem3 {
    public static void main(String[] args) {
         Box Box1=new Box(20, 30, 50);
         System.out.println("Volume of Box1 :"+Box1.getVolume());
         System.out.println("Surface Area of Box1 :"+Box1.getArea());

         Box Box2=new Box(70, 50, 20);
         System.out.println("Volume of Box2 :"+Box2.getVolume());
         System.out.println("Surface Area of Box2 :"+Box2.getArea());


    }
    
}
