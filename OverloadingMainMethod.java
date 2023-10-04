package methodOverload.demo;

public class OverloadingMainMethod {

	public static void main(String[] args) {
		System.out.println("Hello i am main method");
		main();
		int[] x= {};
		main(x);
		char[] y= {};
		main(y);
		main(10,20);
		
	}

	public static void main() {
		System.out.println("Hello2 i am method with no params");
			
	}
	public static void main(int[] args) {
		
		System.out.println("Hello3 i am with int params ");
	}
	public static void main(char[] args) {
		System.out.println("Hello4 i am char params");
		
	}
	public static void main(int a,int b) {
		
		System.out.println("Hello5");
	}


}
