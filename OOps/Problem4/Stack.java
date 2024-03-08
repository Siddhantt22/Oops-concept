
public class Stack {
    int arr[];
    int n;
    int top=0;
    
    Stack(int x){
        n=x;
        arr=new int[x];
    }

    public int pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        int x = arr[--top];
        return x;
    }
    public void push(int x) {
        if (top == n) {
            System.out.println("Stack is full");
           return ;
        }
        arr[top++] = x;
    }
    public void print() {

        
        System.out.println("Stack :");

        for (int i = top-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack(30);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(15);
        st.push(9);

        st.print();

        st.pop();
        st.pop();
        st.pop();
        
        st.print(); 
    }
   



}
