import java.util.*;
class grade{
     int[] credit = new int[]{ 3,3,3,4,4,2,1,1,1}; 
    double sgpa_calc(int[] marks)
    {
       
        int i;
        double std_sgpa=0;
       
        for(i=1;i<=9;i++)
        {  
           marks[i-1]=(marks[i-1]/10)+1;
           std_sgpa+=marks[i-1]*credit[i-1];
          
        }
         std_sgpa=std_sgpa/22;
         return std_sgpa;
    }
     
}
class sgpa{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int[] marks= new int[10]; 
        
        int i;
         System.out.println("Enter the USN of Student");
        String usn=sc.next();
         System.out.println("Enter theName of Student");
        String name=sc.next();
        for(i=1;i<=9;i++)
        {
            System.out.println("Enter the marks of sub"+i);
            marks[i-1]=sc.nextInt();
        }
        grade s1= new grade();
        double a=s1.sgpa_calc(marks);
        System.out.print("SGPA of "+name+" USN: "+usn+" is "+a);
    }
   
}
 
