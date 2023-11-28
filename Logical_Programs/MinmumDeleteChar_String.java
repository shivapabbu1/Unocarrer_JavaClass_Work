
public class MinmumDeleteChar_String {

	public static void main(String[] args) {
		  String name="geeksforgeeks";
		 String res= MinDelete(name);
		 System.out.println(res);
		}
		
		static String MinDelete(String name){
			int ln=name.length();
			String n="";
			 
			 for(int i=0, j=ln-1;i<(ln/2)&& j>(ln/2);i++,j--) {
				   if(name.charAt(i)!=name.charAt(j)) {
					  n+=name.charAt(i);
					  n+=name.charAt(j);
					}
			  }//for i
		  if(n.length()>0) {
			  return (" \n Charcaters should be deleted are:" +n +"\n count is :" + n.length());
		  }else
			  return ("no one shoud delete");

			}
}
