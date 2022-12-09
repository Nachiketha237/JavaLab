import java.util.*;
class books{
 String author;
 String book;
 double price;
 int no_pages;
 books(String au,String bo,double pr,int pa){
    author=au;
    book=bo;
    price=pr;
    no_pages=pa;
    }

public String getAuthor() {
    return author;
}
public void setAuthor(String author) {
    this.author = author;
}
public String getBook() {
    return book;
}
public void setBook(String book) {
    this.book = book;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public int getNo_pages() {
    return no_pages;
}
public void setNo_pages(int no_pages) {
    this.no_pages = no_pages;
}
}
class book_store{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Scanner s=new Scanner(System.in);

    System.out.println("Welcome to Java book house!!");
    System.out.println("Enter total number of books");
    int no =sc.nextInt();
    books[] b=new books[no];
    int i=0;
    while(i<no){
    System.out.println("Enter  name of Author"+i+1);
    String author=s.nextLine();
    System.out.println("Enter title of the book"+i+1);
    String book=s.nextLine();
    System.out.println("Enter the price of the book"+i+1);
    Double price=sc.nextDouble();
    System.out.println("Enter total number of pages in book"+i+1);
    int pages=sc.nextInt();
        b[i]=new books(author,book,price,pages);
        i++;
    }
     i=0;
    while(no>0){
        System.out.println("Name of the Author"+i+1+":"+b[i].getAuthor());
        System.out.println("Title of the book"+i+1+":"+b[i].getBook());
        System.out.println("Price of the book"+i+1+":"+b[i].getPrice());
        System.out.println("Total number of pages"+i+1+":"+b[i].getNo_pages()); 
        i++;
        no--;
    }
}
}
