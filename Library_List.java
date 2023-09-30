package lists_Array;
import java.util.*;

class Book{
	int id;
	String title;
	String author;
	int price;
	int discount;
	
	public Book(int id, String title, String author, int price, int discount) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	static void discountbooks(ArrayList<Book>lib,int discount) {
		for(Book disc:lib) {
			if(disc.getDiscount()>(discount)) {
				System.out.println(disc.getTitle()+"\t"+disc.getAuthor()+"\t"+disc.getPrice()+"\t"+disc.getDiscount());
			}//if
		}//for
	}//method
	
	static void discountbooksforcommic(ArrayList<Book>lib,String title,int discount) {
		for(Book disc:lib) {
			if(disc.getTitle().equalsIgnoreCase(title)) {
			if(disc.getDiscount()>(discount)) {
				System.out.println(disc.getTitle()+"\t"+disc.getAuthor()+"\t"+disc.getPrice()+"\t"+disc.getDiscount());
			}//if
			}//if
		}//for
	}//method
	static void Author(ArrayList<Book>lib,String author) {
		for(Book disc:lib) {
			if(disc.getAuthor().equalsIgnoreCase(author)) {
			System.out.println(disc.getTitle()+"\t"+disc.getAuthor()+"\t"+disc.getPrice()+"\t"+disc.getDiscount());
		  }//if
		}//for
	}//method
	
}

public class Library_List {

	public static void main(String[] args) {
	
      Book book1=new Book(1,"Commics","Shiva",999,10);
      Book book2=new Book(2,"Commics","Kiran",799,8);
      Book book3=new Book(3,"Ethics","Vijju",899,5);
      
      Book book4=new Book(4,"Travel","Balu",1099,10);
      Book book5=new Book(5,"Travel","Jashu",500,15);
      Book book6=new Book(6,"Commics","Kiran",900,12);
      
      Book book7=new Book(7,"Ethics","Raju",900,9);
      Book book8=new Book(8,"History","Shiva",700,18);
      Book book9=new Book(9,"History","Kiran",999,16);
      
      Book book10=new Book(10,"Travel","Lucky",1000,15);
      Book book11=new Book(11,"Ethics","Kumar",1299,5);
      Book book12=new Book(12,"Commics","Vijju",1199,10);
      
      ArrayList<Book> lib=new ArrayList<Book>();
      
       lib.add(book1);
       lib.add(book2);
       lib.add(book3);
       lib.add(book4);
       lib.add(book5);
       lib.add(book6);
       lib.add(book7);
       lib.add(book8);
       lib.add(book9);
       lib.add(book10);
       lib.add(book11);   
       lib.add(book12);
      
         System.out.println("___All books availble in Library___");
        System.out.println("\n Tittle\tAuthor\tPrice\tDiscount");
         
         for(Book book:lib) {
        	 System.out.println(book.getTitle()+"\t"+ book.getAuthor()+"\t"+ book.getPrice()+"\t"+ book.getDiscount());
         }//for
         
         System.out.println("\n ___All books  with discount >10%___");
         System.out.println("\n Tittle\tAuthor\tPrice\tDiscount");
         Book.discountbooks(lib, 10);
         
         System.out.println("\n ___All commics books  with discount >5%___");
         System.out.println("\n Tittle\tAuthor\tPrice\tDiscount");
         Book.discountbooksforcommic(lib,"Commics",5);
         
         System.out.println("\n ___All  books by Shiva Author___");
         System.out.println("\n Tittle\tAuthor\tPrice\tDiscount");
         Book.Author(lib,"Shiva");
          
	}

}
