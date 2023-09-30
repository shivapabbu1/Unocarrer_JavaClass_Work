package lists_Array;
import java.util.ArrayList;
public class Lists {

	public static void main(String[] args) {
		ArrayList<Integer> numbers= new ArrayList<>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		System.out.println(numbers.size());
		System.out.println(numbers);
		numbers.add(1,6); // add at index
		System.out.println(numbers);
		numbers.set(3, 100); // set a element to array
		System.out.println(numbers);
		System.out.println(numbers.get(3));//acces value 
		numbers.remove(2);
		System.out.println(numbers);//remove at index
		

	}

}
