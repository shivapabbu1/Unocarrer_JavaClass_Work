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

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}
}
	
   public class student_List {
	public static void main(String[] args) {
		 Student s1=new Student(01,"Shiva","TKR",40000f,30,98,86);
		 Student s2=new Student(02,"kiran","KTR",45000f,45,67,90);
		 Student s3=new Student(03,"chinna","MRR",89000f,35,50,77);
		 Student s4=new Student(04,"kulfi","VBIT",96000f,76,50,68);
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
        System.out.println("Name \t MathsMarks");
        
        for(Student stu:StuList) {
        	if(stu.getMaths()<=35) {
        	    System.out.println(stu.getName()+"\t"+ stu.getMaths());
        	}
        }
		    
	}

}
   
