//Matching Elements in Two ArrayLists
import java.util.*;
public class DemoArray {
	public static void main(String args[])
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(2);
		list1.add(5);
		list1.add(6);
		list1.add(55);
		list1.add(34);
		list1.add(9);
		list1.add(88);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(4);
		list2.add(8);
		list2.add(6);
		list2.add(55);
		list2.add(9);
		list2.add(78);
		list2.add(44);
		

		//Storing the Comparison elements in  the Array List
		ArrayList<Integer> list3=new ArrayList<Integer>();
		for(Integer x:list1){
			list3.add(list2.contains(x) ? 1 : 0);
		}
		System.out.println(list3);
		
		ArrayList<String> list4=new ArrayList<String>();
		for(Integer x:list1){
			list4.add(list2.contains(x) ? "YES" : "NO");
		}
		System.out.println(list4);		
	}
}