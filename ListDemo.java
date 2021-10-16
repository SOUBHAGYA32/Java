import java.util.*;
public class ListDemo{
	public static void main(String args[])
	{
	ArrayList<String> fruits = new ArrayList<String>();
	fruits.add("Orange");
	fruits.add("Apple");
	fruits.add("Banana");
	fruits.add("Grapes");
	fruits.add("Sweet");
	fruits.add("Mango");
	fruits.add("Guava");

	Collections.sort(fruits);
	for(String x:fruits)
	{
		System.out.println(x);
	}
	
	}


}