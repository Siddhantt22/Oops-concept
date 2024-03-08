

class BankAccount {
    int AccountNumber ;
    float  balance ;
     String ownername;
    BankAccount(int a,float b,String o){
       AccountNumber=a;
      balance =b;
      ownername=o;

    }
     public void add(int x)
     {
        balance+=x;
     }
     public void subtract(int x)
     {
        balance-=x;
     }
     public void print()
     {
        System.out.println(balance);
     }
}
class AcoountManager{
BankAccount[] Account;

AcoountManager(BankAccount[] A)
{
    Account=A;
}
public void  create(BankAccount x)
{
    int n=Account.length;
    BankAccount newB[]=new BankAccount[n+1];
    

    for(int i=0;i<=n;i++)
    {
        
        if(i==n){
            newB[i]=x;
        }
        else{
        newB[i]=Account[i];
        }
    }
   Account=newB;
}
public void  delete(int x)
{
    int n=Account.length;
    BankAccount newB[]=new BankAccount[n-1];
    
    int j=0;
    for(int i=0;i<n;i++)
    {
        
        if(i==x){
            continue;
            
        }
        else{
        newB[j]=Account[i];
        j++;
        }
    }
   Account=newB;
}
public void  deposit(int x,int Amount)
{
     Account[x].balance=Account[x].balance+Amount;
}
public void  withdraw(int x,int Amount)
{
     Account[x].balance=Account[x].balance-Amount;
}
}

public class Bank {
    public static void main(String[] args) {
        BankAccount[] Account=new BankAccount[5];
        float[] balance={10000.77f,9999999.45f,69.69f,232323.66f,666666.4f};
        for(int i=0;i<Account.length;i++)
        {
            String ownername = "ownername" + (i + 1);

            Account[i]=new BankAccount(i+1, balance[i],ownername);
        }
        //create
        AcoountManager A1=new AcoountManager(Account);
        BankAccount account=new BankAccount(6, 669, "owner6");
        A1.create(account);

        for(int  i=0;i<A1.Account.length;i++)
        {
            System.out.println("Account Number for "+A1.Account[i].AccountNumber);
            System.out.println("Owner Name: " +  A1.Account[i].ownername);
            System.out.println("Balance: " + A1.Account[i].balance);
            System.out.println("---------------------------");
        }

        System.out.println("---------------------------");
        System.out.println("---------------------------");

        //delete

        AcoountManager A2=new AcoountManager(Account);
        
        A2.delete(3);

        for(int  i=0;i<A2.Account.length;i++)
        {
            System.out.println("Account Number for "+A2.Account[i].AccountNumber);
            System.out.println("Owner Name: " +  A2.Account[i].ownername);
            System.out.println("Balance: " + A2.Account[i].balance);
            System.out.println("---------------------------");
        }
        }   
    }

    


