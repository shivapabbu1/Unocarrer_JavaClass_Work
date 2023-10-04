

//METHOD OVERLOADING:
// In  a java class have 2 or more methods have same name in same class with called method over load
//  1.diff.no.params
//  2.diff type of params
//  3.diff order of params
// it doesnot depend on return type and acces modifier
// it is similar to compile time ploymprisphm

package methodOverload.demo;

class DummyOverloadMethod{
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
	void add(String fname,String lname) {
		System.out.println(fname+" "+lname);
	}
	
}

public class MethodOverload {

	public static void main(String[] args) {
		DummyOverloadMethod dummy = new DummyOverloadMethod();

      dummy.add(10,10);
      dummy.add(10,20,30);
      dummy.add("shiva","prasad");
	}

}
