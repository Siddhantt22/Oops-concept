 class Employee {
   String name;
   int id;
   String address;
   int Salary;
   
   Employee(String name,int id,String address,int Salary)
   {
    this.name=name;
    this.id=id;
    this.address=address;
    this.Salary=Salary;
   }
}

class Dept{
String  name;
String Location;
Employee[] Em;

Dept(String name,String Location,Employee E[]){
this.name=name;
this.Location=Location;
Em=E;
}


public void  add(Employee x)
{
    int n=Em.length;
    Employee newE[]=new Employee[n+1];
    

    for(int i=0;i<=n;i++)
    {
        
        if(i==n){
            newE[i]=x;
        }
        else{
        newE[i]=Em[i];
        }
    }
   Em=newE;
}
public void  Remove(int x)
{
    int n=Em.length;
    Employee newEm[]=new Employee[n-1];
    
    int j=0;
    for(int i=0;i<n;i++)
    {
        
        if(i==x){
            continue;
            
        }
        else{
        newEm[j]=Em[i];
        j++;
        }
    }
   Em=newEm;
}
}

public class problem9{

public static void main(String[] args) {
    int s=0;
    Employee[] Em=new Employee[5];
    int Salary[]={10000,120000,50000,110000,600000};
    for(int i=0;i<Em.length;i++)
    {
        String n= new String("Employee"+(i+1));
        String ad=new String("Address"+(i+1));

        Em[i]=new Employee(n, i+1, ad, Salary[i]);
        System.out.println(Em[i]);
       
    }
    
    //Case1: if we are not adding nor removing 
    Dept d1=new Dept("IT", "Pune", Em);

     s=0;
    for(int i=0;i<Em.length;i++)
    {
        s+=d1.Em[i].Salary;
    }

    System.out.println("total Expendiure is"+s);
    //Case2: if we are  removing 
    Dept d2=new Dept("Accounts", "pune", Em);
    d2.Remove(3);
    
     s=0;
    for(int i=0;i<d2.Em.length;i++)
    {
        s+=d2.Em[i].Salary;

    }

    System.out.println("total Expendiure is"+s);


    //Case3: if we are  adding

    Dept d3=new Dept("HR", "pune", Em);
    Employee k=new Employee("Employee6", 6, "Addrss6", 190000);
    d3.add(k);
    
     s=0;
    for(int i=0;i<d3.Em.length;i++)
    {
        s+=d3.Em[i].Salary;

    }

    System.out.println("total Expendiure is"+s);

}
}

