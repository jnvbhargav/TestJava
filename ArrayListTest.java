import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<Integer> arrlis = new ArrayList<>();
		
		LinkedList<Integer> arrlis = new LinkedList<>();

		
		
		//Array List 
		arrlis.add(100);
		
		ArrayList<Integer> arrlis2 = new ArrayList<>(List.of(50,60,70,80));
		
		arrlis.addAll(arrlis2);
			
		arrlis.add(1, 200);

		System.out.println(arrlis);
		
		System.out.println(arrlis.contains(100));
		
		System.out.println(arrlis.get(2));
		
		System.out.println(arrlis.indexOf(70));
		
		
		//Method 1 of looping
		
		for(int i=0; i<arrlis.size();i++)
		{
			System.out.println(arrlis.get(i));
		}

		
		
		
	//Linked List
		
		arrlis.addFirst(1);
		
		arrlis.addLast(99);
		
		//Iteration method 2 
		for(int x : arrlis)
		{
			System.out.println("-"+ x);
		}
		
	}

}
