//Create an abstract class “Publication” with data members ‘noOfPages’, ‘price’, ‘publisherName’ etc. with their accessor/modifier functions. Now create two sub-classes “Book” and “Journal”. Create a class Library that contains a list of Publications. Write a main() function and create three Books and two Journals, add them to library and print the details of all publications.
public abstract class  publication {
    int noOfPages;
	float price;
    String publisherName;

    void print()
    {
        System.out.println("Publication Name : " + publisherName);
        System.out.println("Price : " + price);
        System.out.println("No of Pages : " + noOfPages);
    }
    


    
        public static void main(String[] args) {
            
        
        
            Book b1=new Book("pb1", 100, 200);
            Book b2=new Book("pb2", 200, 300);
        
            Book b3 = new Book("pb3", 700, 900);

        Journal j1 = new Journal("pb4", 9900, 900);
        Journal j2 = new Journal("pb5", 900, 500);
            Library l=new Library(b1);
            l.add(b2);
            l.add(b3);
            l.add(j1);
            l.add(j2);
            
            l.printinfo();


        }
            
        }
            
        

class Book extends publication{
    Book(String pb, float p, int n )
    {
        publisherName = pb;
        price = p;
        noOfPages = n;
    }
}
class Journal extends publication{
    Journal(String pb, float p, int n )
    {
        publisherName = pb;
        price = p;
        noOfPages = n;
    }
}

 class Library {
publication p[] =new publication[1];

Library(publication x)
{
p[0]=x;
}
public void add(publication x)
{
   int n=p.length;
   publication[] newp= new publication[n+1];
   for(int i=0;i<n;i++)
   {
    newp[i]=p[i];
   }
   newp[n]=x;
   p=newp;
}

public void printinfo(){
  for(int i=0;i<p.length;i++)
  {
    p[i].print();
  }
}
    
}


