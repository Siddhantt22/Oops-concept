class Date{

    int days[]={ 0,31,28,31,30,31,30,31,31,30,31,30,31 };

    int d;
    int m;
    int y;

   public Date()
{
    d=01;
    m=01;
    y=1970;
}

public Date(int d)
{
    this.d=d;
    m=01;
    y=1970;
}

public Date(int d,int m)
{
    this.d=d;
    this.m=m;
    y=1970;
}

public Date(int d,int m,int y)
{
    this.d=d;
    this.m=m;
    this.y=y;
}

public void nextDay(){
    int dd=d;
    int mm=m;
    int yy=y;
if(m==12 && d==31)
{
    mm=1;
    dd=1;
    yy=y+1;
}
else if(d==days[m])
{
    dd=1;
   mm= m+1;
}
else{
    dd=d+1;
}
System.out.println("NextDate :"+dd+"/"+mm+"/"+yy);
}

public void previousDay(){
    int dd=d;
    int mm=m;
    int yy=y;
    if(m==1 && d==1 )
    {
       mm=12;
        dd=31;
        yy=y-1;
    }
    else if(d==1)
    {
        dd=days[m-1];
       mm=m-1;
    }
    else{
        dd=d-1;
    }
    System.out.println("Previous Date :"+dd+"/"+mm+"/"+yy);

    }

public void  printDate(){
System.out.println("Date :"+d+"/"+m+"/"+y);
}

}
public class problem7 {

    public static void main(String[] args) {
        Date d1=new Date();
        d1.printDate();
        d1.previousDay();
        d1.nextDay();

        Date d2=new Date(31,12);
        d2.printDate();
        d2.previousDay();
        d2.nextDay();

        Date d3=new Date(28,2,1999);
        d3.printDate();
        d3.previousDay();
        d3.nextDay();

        
    }
    
    
}
