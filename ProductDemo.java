package lists_Array;

import java.util.*;

class Product{
	int id;
	String name;
	String brand;
	int price;
	int discount;
	
	public Product(int id, String name, String brand, int price, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.discount = discount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	
	 static void dispalyproducts(ArrayList<Product>productList,String catgeory,int dis) {
		   System.out.println("Name\tBrand\tdiscount");
		   for(Product pro:productList) {
			   if(pro.getName().equalsIgnoreCase(catgeory)) {
				   if(pro.getDiscount()>=dis) {
					   System.out.println(pro.getName()+"\t"+pro.getBrand()+"\t"+ pro.getDiscount());
				   } //if
			   }//2 if
		   }//for
	 }//method
}

public class ProductDemo {

   public static void main(String[] args) {
	Product p1=new Product(01,"Laptop","HP",30000,7);
	Product p2=new Product(02,"Laptop","Dell",50000,10);
	Product p3=new Product(03,"Laptop","lenovo",450000,0);
	Product p4=new Product(02,"Tab","HP",20000,0);
	Product p5=new Product(02,"Tab","Samsung",25000,20);
	Product p6=new Product(02,"Tab","Hcl",22000,5);
	Product p7=new Product(03,"Mobile","Apple",60000,8);
	Product p8=new Product(04,"Mobile","Nokia",56000,15);
	Product p9=new Product(05,"Mobile","Realme",80000,20);
	
		ArrayList<Product>productList=new ArrayList<Product>();
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);	
		productList.add(p7);
		productList.add(p8);
		productList.add(p9);
		
		System.out.println("****Available products are:********");
		System.out.println("Name\tBrand\tPrice\tdiscount");
		
		for(Product pro:productList) {
		System.out.println(pro.getName() +"\t"+ pro.getBrand()+"\t"+ pro.getPrice() +"\t"+ pro.getDiscount());
		}
		System.out.println(" ");
		System.out.println("****Laptops are more  with than 5 %discount ********");
		
		 Product.dispalyproducts(productList, "Laptop", 5);
		 System.out.println(" ");
		 
			System.out.println("****Laptops are more  with  NO discount ********");
		 Product.dispalyproducts(productList, "Laptop", 0);
		 System.out.println(" ");
		 
			System.out.println("****Mobiles are more  with than 15 %discount ********");
		 Product.dispalyproducts(productList, "Mobile",10 );
		 System.out.println(" ");
		 
		 System.out.println("****Mobiles are more  with  NO discount ********");
	      Product.dispalyproducts(productList, "Mobiles", 0);
		 System.out.println(" ");
		 
		 System.out.println("****tabs are more  with than 10 %discount ********");
		 Product.dispalyproducts(productList, "Tab",10 );
		 System.out.println(" ");
		 
		 System.out.println("****tabs are more  with  NO discount ********");
	      Product.dispalyproducts(productList, "Tab", 0);
		 System.out.println(" ");
		 
		
		
		
   
}
   

 }


