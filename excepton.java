import  java.util.*;
class MyException extends Exception {
    private int detail;
    
    MyException(int a) {
    detail = a;
    }
    
     public String toString() {
    return "MyException[" + detail +":user defined Exception" + "]";
    }                        
    
    }
    
    
    class ExceptionDemo {
    
    static void compute(int a) throws MyException 
    {
    
    System.out.println("Called compute(" + a + ") ");
    
    if(a > 10)
      throw new MyException(a);
    
    System.out.println("Normal exit");
    }
    static void throwOne1()  throws ArithmeticException {
        System.out.println("Inside throwOne1.");
         throw new ArithmeticException("demo");
    }
    static void throwOne()  throws IllegalAccessException {
       
      System.out.println("Inside throwOne.");
       throw new IllegalAccessException("demo");
     }
     static void demoproc()  throws NullPointerException{
       
        System.out.println("Inside demproc.");
         throw new NullPointerException("demo1");
       }
   
    
    public static void main(String args[]) {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Different exceptions\n----------------------------------------\n1.NullPointerException\n2.IllegalAccessException\n3.ArithmaticException\n4.UserdefinedException");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                try {
                demoproc();
                } 
                catch(NullPointerException e){
                    System.out.println("caught: " + e);
                }
            case 2:try{
                     throwOne();
                   }
                 catch ( IllegalAccessException e1) {
                     System.out.println("Caught " + e1);
                  } 
                  break;
            case 3:
              try{

                throwOne1();
                }
                
                catch ( ArithmeticException e) {
                System.out.println("Caught " + e);
                } 
                break;
            case 4:  try {
    
                          compute(1);
               
                           compute(20);
               
                        }
                     catch (MyException e) {
               
                           System.out.println("Caught "+e);
               
                      }
                
                    break;
        
            default:System.exit(0);
                
        }
  
        sc.close();
  }

}
    
