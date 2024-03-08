// Implement the classes for the following inheritance hierarchies. Create an interface “Shape” that contains methods ‘area’, ‘draw’, ‘rotate’, ‘move’ etc. Now create two classes “Circle” and “Rectangle” that implement this ‘Shape’ interface and implement the methods ‘area’, ‘move’, etc. Write a main() function to create two “Circle” and three “Rectangle”,then move them. Print the details of circles and rectangles before after moving them.


 interface Shape {
  float area();
  void draw();
  void rotate();
  void move(int a,int b);

}
class Circle implements Shape{
    float r;
    int x;
    int y;
    Circle(float d)
    {
        this.r=d;
       
    }
    public float area()
    {
        float k=3.14f*r*r;
     return k ;
    }
    public void draw()
    {
        
    }
    public void rotate()
    {
        
    }
    public void move(int a,int b)
    {
        System.out.println("Moving a circle to (" + a + ", " + b + ")");
        
    }

    
}

class Rectangle implements Shape {
    private float length;
    private float width;

    public Rectangle(float d, float e) {
        this.length = d;
        this.width = e;
    }

   
    public float area() {
        return length * width;
    }

    
     public void move(int x, int y) {
         System.out.println("Moving a rectangle to (" + x + ", " + y + ")");
     }
   
    public void draw() {
       
    }

   
    public void rotate() {
       
    }

}

public class problem5 {
    public static void main(String[] args) {
        
        Circle circle1 = new Circle(5.0f);
        Circle circle2 = new Circle(7.0f);
        Rectangle rectangle1 = new Rectangle(4.0f, 6.0f);
        Rectangle rectangle2 = new Rectangle(3.0f, 5.0f);
        Rectangle rectangle3 = new Rectangle(8.0f, 10.0f);

        
        circle1.move(3, 4);
        circle2.move(5, 6);
        rectangle1.move(1, 2);
        rectangle2.move(7, 8);
        rectangle3.move(9, 10);

    
        System.out.println("Circle 1 area: " + circle1.area());
        System.out.println("Circle 2 area: " + circle2.area());
        System.out.println("Rectangle 1 area: " + rectangle1.area());
        System.out.println("Rectangle 2 area: " + rectangle2.area());
        System.out.println("Rectangle 3 area: " + rectangle3.area());
    }
}
