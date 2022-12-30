import java.util.*;
import java.util.UUID;
class bank{
    class Account{
        protected  String Name;
        protected UUID accno;
        protected double balance;
        Account(String Name,double balance){
            this.Name=Name;
            this.accno=UUID.randomUUID();
            this.balance=balance;
        }
        void Enquiry(String Name,UUID accno){
            System.out.println("Name of Account holder"+Name+"\n");
            System.out.println("Account number"+accno+"\n");
            System.out.println("Balance"+balance+"\n");
        }
      
     }
     class Savings extends Account{
         private float interest=7;
         Savings(String Name,double balance){
            super(Name,balance);
            
         }
         void deposit(UUID accno,double value){
            this.balance+=value;
            
       }
       void withdraw(UUID accno,double value){
         if(value>this.balance)
         this.balance-=value;
         else
          System.out.println("Insufficient balance");
    }
        
     }
      
     class Current extends Accounts{
         private float minBalance=1000;
         private float serCharge=500;
         Current(String Name,double balance){
            super(Name,balance);
            if(this.balance<minBalance){
                this.balance-=serCharge;
            }
          
     }
   void deposit(UUID accno,double value){
        this.balance+=value;
   }
   void withdraw(UUID accno,double value){
     if(value>this.balance)
     this.balance-=value;
     else
      System.out.println("Insufficient balance");
}
     
}
}

class Main {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     while(1)
     {
        System.out.println("Welcome to HDFC Bank\n\n");
        System.out.println("1.Create Account\n2.Balance Enquiry\n3.Deposit\n4.Withdrawal\n5.Exit");
        int choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println("Enter the type of account you are interested in\n");
                   System.out.println("1.Savings Account\n2.Current Account\n\n");
                   int choice1=sc.nextInt();
                   Current c=new Current();
                   Savings s=new Savings();
                   switch(choice1){
                    case 1: 
                            System.out.println("Enter Your Name\n");
                            String Name=sc.nextLine();
                            System.out.println("Deposit Some amount to create account\n");
                            double Balance=sc.nextDouble();
                            System.out.println("Successfully created you Savings account\n");
                            break;

                    case 2: 
                            System.out.println("Enter Your Name\n");
                            Name=sc.nextLine();
                            System.out.println("Deposit Some amount to create account\n");
                            Balance=sc.nextInt();
                            System.out.println("Successfully created you Current account\n");
                            break;
                   }
                   break;
            case 2:             
                                System.out.println("Enter your account number\n");
                                UUID choice2=sc.nextUUID();
                                System.out.println("Enter your account type 1:Savings  and  2:Current\n");
                                int choice3=sc.nextInt();
                                if(choice3==1)
                                 System.out.println("Details of your account is\n\n"+s.Enquiry);
                                else
                                  System.out.println("Details of your account is\n\n"+c.Enquiry);  
                                  break;


            case 3:   System.out.println("Enter your account number\n");
                      choice2=sc.nextUUID();
                      System.out.println("Enter your account type 1:Savings  and  2:Current\n");
                      choice3=sc.nextInt();
                      System.out.println("Enter the amount to be deposited");
                      choice=sc.nextInt();
                      
                      if(choice3==1)
                       s.deposit(choice2,choice);
                      else
                       c.deposit(choice2,choice);
                       break;
            case 4:   System.out.println("Enter your account number\n");
                       choice2=sc.nextUUID();
                       System.out.println("Enter your account type 1:Savings  and  2:Current\n");
                       choice3=sc.nextInt();
                       System.out.println("Enter the amount to be withdrawn");
                       choice=sc.nextInt();
                       
                       if(choice3==1)
                        s.withdraw(choice2,choice);
                       else
                        c.withdraw(choice2,choice);
                        break;
            case 5: exit(0);
        }

     }
    }
}
