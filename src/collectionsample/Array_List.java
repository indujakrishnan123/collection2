package collectionsample;

import java.util.*;

public class Array_List {
public static void main(String args[])
{
List <Integer>arr=new ArrayList<Integer>();
	arr.add(1);
	arr.add(2);
	arr.add(3);
	System.out.println("Array elements are"+arr.get(2));

	Iterator itr=arr.iterator();
	{
		while(itr.hasNext())
		{
			
			System.out.println("Array elements are"+itr.next());
		}
	System.out.print(arr.remove(2));
	
		
}
}
}


