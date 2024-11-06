abstract class Customer
{
  String name;
  String address;

  abstract void setCust(String cname,String caddress);
}

interface Account
{
  void deposit(double amt);
  void withdraw(double amt);
  double checkbalance();
}

class SavingAccount extends Customer implements Account
{
  long account_no;
  double balance;
  String date_of_acct_opening;

  void setCust(String cname,String caddress)
   {
     name=cname;
     address=caddress;
   } 

  void setAcct(long accno, double bal,String accdate)
   {
     account_no=accno;
     balance=bal;
     date_of_acct_opening=accdate;
   }  

  public void withdraw(double amt)
   {
     balance=balance-amt;
   }

  public void deposit(double amt)
   {
     balance=balance+amt;
   }

  public double checkbalance()
   {
     return balance;
   }
}

class Example18
{
  public static void main(String args[ ])
   {    
     SavingAccount sa=new SavingAccount();
     sa.setCust("Satish","Dhankawadi");
     sa.setAcct(100,10000,"10/10/09");
     System.out.println("Balance=" + sa.checkbalance());
     sa.deposit(1200);
     System.out.println("Balance=" + sa.checkbalance());
     sa.withdraw(1000);
     System.out.println("Balance=" + sa.checkbalance());     
   }
}