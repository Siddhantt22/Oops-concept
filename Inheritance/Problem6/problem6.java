//A bookshop maintains the inventory of books that are being sold at the shop. The list includes details such as author, title, publisher, cost and stock position. Whenever a customer wants a book, the sales person inputs the title and author and the system searches the list and displays whether it is available or not. If it is not, an appropriate message is displayed. If it is, then the system displays the book details and details and requests for the number of copies required. If the required copies are available, the total cost of the requested copies is displayed, otherwise the message “requires copies not in stock” is displayed. Design a system using a class called “Book” with suitable member methods and constructors.

class Book{
    String author;
    String title;
    String publisher;
    int cost;
    int stock;

    Book(String t, String ps, String a, int c, int s) {
        publisher = ps;
        title = t;
        author = a;
        cost = c;
        stock = s;
      }
      void Details() {
        System.out.println("Book Details:- ");
        System.out.println("title - " + title);
        System.out.println("authors - " + author);
        System.out.println("publisher - " + publisher);
        System.out.println("Cost: " + cost);
        System.out.println("Stock: " + stock);
        
      }
}


class bookshop{
    Book[] b;

    bookshop( Book[] x )
	{
		b=x;
	}

    public void buy(String t, String a, int c){
       for(int j=0;j < b.length;j++)
       {
        if (b[j].author.equals(a) && b[j].title.equals(t)){
             b[j].Details();
             if(c<=b[j].stock)
             {
                System.out.println("Total cost will be  "+b[j].cost*c);
                return;
             }
             else{
                System.out.println("requires copies not in stock");
                return;

             }
       }
       }
       System.out.println("Book not available");
    }

}

public class problem6 {
    public static void main(String[] args) {
        
    
    Book[] b = new Book[5];
    int[] cost={200,500,1200,10000,5000};
    int[] stock={10,100,5,3,5};
        
    for(int i=0; i < b.length; i++)
    {
        String author="author"+(i+1);
    String title="title"+(i+1);
    String publisher="publisher"+(i+1);
    
        b[i]=new Book(title,publisher,author,cost[i],stock[i]);
    }

    bookshop b1=new bookshop(b);

    b1.buy("title2", "author2", 3);
     

}
}
