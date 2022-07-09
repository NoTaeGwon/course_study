import java.util.*;

class Student implements Comparable<Student> {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number= number;
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public int compareTo(Student s) {
		return number - s.number;
	}
	
}

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student array[] = {
				new Student(2009001, "±èÃ¶¼ö"),
				new Student(2009002, "ÀÌÃ¶¼ö"),
				new Student(2009003, "¹ÚÃ¶¼ö"),
		};
		
		List<Student> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);

	}

}
