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
		String[] sample = { "�ܾ�", "�ߺ�", "����", "�ߺ�" };
		for (String a : sample)
			if (!s.add(a))
				System.out.println("�ߺ��� ��� " + a);
		
		System.out.println(s.size() + "�ߺ����� ���� �ܾ�: " + s);
	}

}
