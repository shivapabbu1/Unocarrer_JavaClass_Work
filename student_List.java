package lists_Array;
import java.util.*;

	
	class Student{
		int ID;
		String name;
		String collegename;
		float fee;
		int maths;
		int social;
		int science;
		
      public Student(int ID,String name,   String collegename, float fee,
    		    int maths,   int social,  int science)  
	{
	this.ID=ID;
	this.name=name;
	this.collegename=collegename;
	this.fee=fee;
	this.maths=maths;
	this.social=social;
	this.science=science;
	
    }
	public int getId() {
		return ID;
	}
    public String getName() {
		return name;
	}
    public void setId(int ID) {
		this.ID = ID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegeName() {
		return collegename;
	}
	
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public int getMaths() {
		return maths;
	}
	public int getScience() {
		return science;
	}
	public int getSocial() {
		return social;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public void setSocial(int social) {
		this.social = social;
	}
}
	
   public class student_List {
	public static void main(String[] args) {
		 Student s1=new Student(01,"Shiva","TKR",40000f,30,35,86);
		 Student s2=new Student(02,"kiran","KTR",45000f,45,67,90);
		 Student s3=new Student(03,"chinna","MRR",89000f,35,50,77);
		 Student s4=new Student(04,"kulfi","VBIT",96000f,76,20,68);
		 Student s5=new Student(05,"ram","CBIT",42300f,34,88,69);
		 Student s6=new Student(06,"manju","VNR",78000f,49,89,78);
		
		 ArrayList<Student> StuList=new ArrayList<Student>();
		 StuList.add(s1);
		 StuList.add(s2);
		 StuList.add(s3);
		 StuList.add(s4);
		 StuList.add(s5);
		 StuList.add(s6);

        System.out.println(" failed students in maths:"	);	
        System.out.println("Name \t Maths\tScience\tSocial");
        
        for(Student stu:StuList) {
        	if(stu.getMaths()<=35 && stu.getScience()>35 && stu.getSocial()>35) {
        	    System.out.println(stu.getName()+"\t"+ stu.getMaths()+"\t"+ stu.getScience()+"\t"+ stu.getSocial());

        	}
		 
		// for due fee and college fess by students who are passed 
		 float totalFee=850000f;
		 int collegetotal=0;
		    System.out.println("total college fee for each student:"+ totalFee);
		    System.out.println("Name \t Totalfee\tpaid\tDue");
		     
		    for(Student stu:StuList) {
	        	 
	           System.out.println(stu.getName()+"\t"+ totalFee+"\t"+stu.getFee()+"\t"+(totalFee-stu.getFee()));
                }//for
		    
		    System.out.println("***Students who have passed in all subjcects:****");
		    System.out.println("Name \t Maths\tScience\tSocial\tpaidfee\tduefee");
		    for(Student stu:StuList) {
	        	if(stu.getMaths()>35 && stu.getScience()>35 && stu.getSocial()>35) {
	        	    System.out.println(stu.getName()+"\t"+ stu.getMaths()+"\t"+ stu.getScience()+"\t"+ stu.getSocial()+ "\t" +stu.getFee() +"\t"+ (totalFee-stu.getFee()));
	        	      collegetotal+=(totalFee-stu.getFee());
	        	  
	        }//for
	     }
		    System.out.println("Students Due fess to college immediatly to pay:"+ collegetotal );
		    
		    
	 }
	}
   
