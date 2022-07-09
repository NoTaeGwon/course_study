import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set);
		System.out.println("-------------------------------");
		
		Set<String> s = new HashSet<String>();
		String[] sample = { "단어", "중복", "구절", "중복" };
		for (String a : sample)
			if (!s.add(a))
				System.out.println("중복된 언어 " + a);
		
		System.out.println(s.size() + "중복되지 않은 단어: " + s);
	}

}
