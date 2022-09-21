package collectionsample;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
	List<String>obj=new ArrayList<String>();
	obj.add("RED");
	obj.add("blue");
	obj.add("white");
Iterator itr= obj.iterator();
{
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
	}

}
