// 3. Implement a class for a “Person”. Person has data members ‘age’, ’weight’, ‘height’, ‘dateOfBirth’, ‘address’ with proper reader/write methods etc. Now create two subclasses “Employee” and “Student”. Employee will have additional data member ‘salary’, ‘dateOfJoining’, ‘experience’ etc. Student has data members ‘roll’, ‘listOfSubjects’, their marks and methods ‘calculateGrade’. Again create two sub-classes “Technician” and “Professor” from Employee. Professor has data members ‘courses’, ‘listOfAdvisee’ and their add/remove methods. Write a main() function to demonstrate the creation of objects of different classes and their method calls.
class person{
   int age;
   int weight;
   int height;
   String dob;
   String address;
   public person(int age, int weight, int height, String dob, String address) {
    this.age = age;
    this.weight = weight;
    this.height = height;
    this.dob = dob;
    this.address = address;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public int getWeight() {
    return weight;
}

public void setWeight(int weight) {
    this.weight = weight;
}

public int getHeight() {
    return height;
}

public void setHeight(int height) {
    this.height = height;
}

public String getDob() {
    return dob;
}

public void setDob(String dob) {
    this.dob = dob;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

}
class Student extends person{
    int roll;
    String[] subject;
    int[] marks;

    public Student(int age, int weight, int height, String dob, String address, int roll, String[] subject, int[] marks) {
        super(age, weight, height, dob, address);
        this.roll = roll;
        this.subject = subject;
        this.marks = marks;
    }

    void calcGrade()
    {
        int i, sum = 0;
        for( i=0; i<marks.length; i++)
        {
            sum += marks[i];
        }
        if (sum >= 90)
        System.out.println("Grade : A+ ");
    else if (sum >= 80)
        System.out.println("Grade : A ");
     else if (sum >= 70)
        System.out.println("Grade : B ");
        else if (sum >= 60)
        System.out.println("Grade : C ");
        else if (sum >= 50)
        System.out.println("Grade : D ");
        else if (sum >= 40)
        System.out.println("Grade : E ");
    else
        System.out.println("Grade : F ");
    }
}

class Employee extends person{
int salary;
String doj;
int experience;
public Employee(int age, int weight, int height, String dob, String address, int salary, String doj, int experience) {
    super(age, weight, height, dob, address);
    this.salary = salary;
    this.doj = doj;
    this.experience = experience;
}

}

class Technician extends Employee{
    public Technician(int age, int weight, int height, String dob, String address, int salary, String doj, int experience) {
        super(age, weight, height, dob, address, salary, doj, experience);
    }

}

class Professor extends Employee{
    String[] courses=new String[1];
    String[] listofadvices=new String[1];

    public Professor(int age, int weight, int height, String dob, String address, int salary, String doj, int experience) {
        super(age, weight, height, dob, address, salary, doj, experience);
    }

    void addcourses(String x)
    {
        int n=courses.length;
        String[] newC=new String[n+1];
        for(int i=0;i<n;i++)
        {
            newC[i]=courses[i];
        }
        newC[n]=x;
        courses=newC;

    }

    void addlistofadvices(String x)
    {
        int n=listofadvices.length;
        String[] newD=new String[n+1];
        for(int i=0;i<n;i++)
        {
            newD[i]=listofadvices[i];
        }
        newD[n]=x;
        listofadvices=newD;
    }
    void removeloa(int x)
    {
        int n=listofadvices.length;
        String[] newD=new String[n-1];
        int k=0;
        for(int i=0;i<n-1;i++)
        {
            if(i==x)
            {
                continue;
            }
            newD[k++]=listofadvices[i];
        }
      
        listofadvices=newD;
    }
    void removec(int x)
    {
        int n=courses.length;
        int k=0;
        String[] newC=new String[n-1];
        for(int i=0;i<n-1;i++)
        {
            if(i==x)
            {
                continue;
            }
            newC[k++]=courses[i];
        }
      
        courses=newC;
    }
}


public class problem3 {
    
    public static void main(String[] args) {
        
       

        Student student = new Student(20, 70, 170, "01/01/2000", "123 Street, City", 101, 
            new String[]{"Math", "Science", "English"}, new int[]{85, 90, 80});
        student.calcGrade();
        

        Technician technician = new Technician(30, 80, 180, "02/02/1990", "456 Street, Town", 
        40000, "01/01/2010", 10);
        
        Professor professor = new Professor(40, 90, 190, "03/03/1980", "789 Road, Village", 
        60000, "01/01/2005", 15);
    

    professor.addcourses("course1");
    professor.addlistofadvices("list1");

        
    }
}
