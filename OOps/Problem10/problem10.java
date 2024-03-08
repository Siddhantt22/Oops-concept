//Implement a class for a “Student”. Information about a student includes name, roll no and an array of five subject names. The class should have suitable constructor and get/set methods. Implement a class “TabulationSheet”. A tabulation sheet contains roll numbers and marks of each student for a particular subject. This class should have a method for adding the marks and roll no of a student. Implement a class “MarkSheet”. A mark sheet contains marks of all subjects for a particular student. This class should have a method to add name of a student and marks in each subject. Write a main() function to create three “Student” objects, Five “Tabulationsheet” objects for Five subjects and three “Marksheet” object for three students. Print the mark sheets.
class Student{
   
    String Name;
    int roll;
    String[] sub=new String[5];

    Student(String n,String s[],int roll)
   {
      Name = n;
      this.roll=roll;
      sub = new String[s.length];
      for (int i = 0; i < s.length; i++)
       sub[i] = s[i];
   }

   void printStudent()
   {
      System.out.println("Student subName : " + Name);
      System.out.println("Roll No : " + roll);
      for(int i=0; i<5; i++)
      {
         System.out.println("Subject " + (i + 1) + " : "+sub[i]);
      }
   }
}

 class TabulationSheet {
    int[] Roll;
    int[] marks;
    int size;
    
    
    public TabulationSheet(int[] r, int[] m) {
        Roll = new int[r.length];
        marks = new int[m.length];
        size = r.length;
        for (int i = 0; i < size; i++) {
            Roll[i] = r[i];
            marks[i] = m[i];
        }
    }
    
    void add(int r,int m)
    {
        int[] newR=new int[size+1];
        for (int i = 0; i < Roll.length; i++) 
            newR[i] = Roll[i]; 
  
        newR[size] = r; 
  
      Roll = newR;
        
      int newM[] = new int[marks.length + 1]; 
  
        for (int i = 0; i < marks.length; i++) 
        {
            newM[i] = marks[i];
        }
  
        newM[marks.length] = m; 
  
      marks = newM;
   }
    }
    class MarkSheet {
       
    String studentName;
    String[] subjects;
    int[] marks;

    public MarkSheet(String studentName, String[] subjects) {
        this.studentName = studentName;
        this.subjects = subjects;
        this.marks = new int[subjects.length];
    }

    public void addMarks(int[] marks) {
        if (marks.length == this.marks.length) {
            System.arraycopy(marks, 0, this.marks, 0, marks.length);
        } else {
            System.out.println("Number of marks does not match the number of subjects.");
        }
    }

    public void printMarkSheet() {
        System.out.println("Student Name: " + studentName);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
    }
}
    
public class problem10 {
    public static void main(String[] args) {
        Student student1 = new Student("A", new String[]{"Math", "Science", "English", "History", "Geography"}, 1);
        Student student2 = new Student("B", new String[]{"Math", "Science", "English", "History", "Geography"}, 2);
        Student student3 = new Student("C", new String[]{"Math", "Science", "English", "History", "Geography"}, 3);
        

        TabulationSheet T1 = new TabulationSheet(new int[]{1, 2, 3}, new int[]{78, 75,99});
        TabulationSheet T2 = new TabulationSheet(new int[]{1, 2, 3}, new int[]{85, 79, 88});
        TabulationSheet T3 = new TabulationSheet(new int[]{1, 2, 3}, new int[]{73, 77, 80});
        TabulationSheet T4 = new TabulationSheet(new int[]{1, 2, 3}, new int[]{68, 71, 65});
        TabulationSheet T5 = new TabulationSheet(new int[]{1, 2, 3}, new int[]{90, 85, 88});

        

        MarkSheet markSheet1 = new MarkSheet("A", new String[]{"Math", "Science", "English", "History", "Geography"});
        MarkSheet markSheet2 = new MarkSheet("B", new String[]{"Math", "Science", "English", "History", "Geography"});
        MarkSheet markSheet3 = new MarkSheet("C", new String[]{"Math", "Science", "English", "History", "Geography"});

        markSheet1.addMarks(new int[]{90, 85, 80, 75, 70});
        markSheet2.addMarks(new int[]{85, 80, 75, 70, 65});
        markSheet3.addMarks(new int[]{80, 75, 70, 65, 60});

        markSheet1.printMarkSheet();

        markSheet2.printMarkSheet();

       
        markSheet3.printMarkSheet();

    }
    
}
