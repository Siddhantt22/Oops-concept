
 interface fruit {
  void hasapeel();
}
interface vegetable {
     void hasaroot();
   }

  class tomato implements fruit,vegetable{
    public void hasapeel(){
       System.out.println("peeelll");
    }
    public void hasaroot(){
        System.out.println("roooooot");
    }
  } 

public class problem9 {
    public static void main(String[] args) {
        
        tomato t=new tomato();
        t.hasapeel();
        t.hasaroot();
    }
    
}
