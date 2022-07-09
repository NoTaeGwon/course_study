import java.awt.List;
import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("MILK");
		list.add("BREAD");
		list.add("BUTTER");
		list.add(1, "APPLE");
		list.set(2,  "CRAPE");
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		
		ArrayList<String> list1 = new ArrayList<String>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("넷");
		
		String s;
		Iterator e = list.iterator();
		while(e.hasNext())
		{
			s = (String)e.next();
			System.out.println(s);
		}

	}

}
