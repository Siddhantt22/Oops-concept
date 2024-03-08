
class Student{

    String name;
    int marks[]=new int[3];

   public void setData(String name,int a,int b,int c)
    {
        this.name=name;
        marks[0]=a;
        marks[1]=b;
        marks[2]=c;  
    }

     public float avg()
    {
        float sum=0;
        for(int i:marks)
        {
            sum+=i;
        }
        return sum/3;  
    }
    public void display()
    {
        System.out.println("Name :"+name);
        int sum=0;
        for(int i:marks)
        {
            sum+=i;
        }
       System.out.println("Total Marks:"+sum); 
    }
}
public class Problem2 {
    
public static void main(String[] args) {
    
    Student student1=new Student();
    student1.setData("Siddhant", 12, 25, 66);
    student1.display();
    System.out.println("Average:"+student1.avg());

}

}
