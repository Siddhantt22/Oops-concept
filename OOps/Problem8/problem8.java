class Book{
    String title;
    String author[];
    int pages;
    float price;
    String publisher;

Book(String title,String a[],int pages,float price,String publisher)   
{
    this.title=title;
    author=a;
    this.pages=pages;
    this.price=price;
    this.publisher=publisher;
} 
}
class Library{
    Book lib[];

    Library(Book b[] )
    {
        lib=b;
    }  
    public void  add(Book x)
{
    int n=lib.length;
    Book newB[]=new Book[n+1];
    

    for(int i=0;i<=n;i++)
    {
        
        if(i==n){
            newB[i]=x;
        }
        else{
        newB[i]=lib[i];
        }
    }
   lib=newB;
}
public void  Remove(int x)
{
    int n=lib.length;
    Book newbo[]=new Book[n-1];
    
    int j=0;
    for(int i=0;i<n;i++)
    {
        
        if(i==x){
            continue;
            
        }
        else{
        newbo[j]=lib[i];
        j++;
        }
    }
    
   lib=newbo;
  

   

}
}
 

public class problem8 {

    public static void main(String[] args) {
    
        Book lib[]=new Book[5];
        int pages[]={121,500,7000,4545,2222};
        float price[]={155.5f,343.8f,999f,555f,10101f};
        int k=1;
       
        for(int i=0;i<lib.length;i++)
        {
            String title="title"+i;
            String author[]={"author"+(k++),"author"+(k++)};
            String publisher="publisher"+i;
    
            lib[i]=new Book(title,author,pages[i],price[i],publisher);
            System.out.println(lib[i].author);
    
        }


        Library L1=new Library(lib);
        float s=0;
        for(int i=0;i<lib.length;i++)
        {
            s+=L1.lib[i].price;
        
        }
        System.out.println("Total Price:"+s);

  Library d2=new Library(lib);
    d2.Remove(3);
    
     s=0;
    for(int i=0;i<d2.lib.length;i++)
    {
        s+=d2.lib[i].price;

    }

    System.out.println("total price: "+s);



        //add
        
    Library l3=new Library(lib);
    String author[]={"author11","author12"};
     Book m=new Book("title6", author, 450, 1000, "publisher6");
    l3.add(m);
    
     s=0;
    for(int i=0;i<l3.lib.length;i++)
    {
        s+=l3.lib[i].price;

    }

    System.out.println("Total Price: "+s);

    //add remove toegther;

    Library l4=new Library(lib);
    String dummy[]={"author13","author14"};
     Book f=new Book("title6", dummy, 800, 5000, "publisher7");
     l4.add(f);
     l4.Remove(2);
     
      s=0;
     for(int i=0;i<l4.lib.length;i++)
     {
         s+=l4.lib[i].price;
 
     }
 
     System.out.println("total price: "+s);

    
    }


    
    
    
}