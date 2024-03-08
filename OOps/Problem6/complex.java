
public class complex {

    float real;

    float imaginary;

    complex(float real)
    {
        this.real=real;
        imaginary=0;
    }
    complex(float real,float imaginary)
    {
        this.imaginary=imaginary;
        this.real=real;

    }
    complex()
    {
        real=imaginary=0;
    }

    public complex sum(complex c){
        complex t=new complex();
        t.imaginary=imaginary+c.imaginary;
        t.real=real+c.real;
        return t;
    }
    public complex multiply(complex c){
        complex t=new complex();
        t.real = (this.real * c.real) - (this.imaginary * c.imaginary);
        t.imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
        return t; 
    }

    public void print() {
        
        System.out.println(real+ " + i"+imaginary);
    }

    public static void main(String[] args) {
        complex c1=new complex(3,2);
        complex c2=new complex(4,-2);

        c1.print();
        c2.print();

       complex c3= c1.sum(c2);
       complex c4= c1.multiply(c2);

       c3.print();
       c4.print();

    }

    
}