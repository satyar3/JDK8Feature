package SDET.Streams.Terminal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ComparatorComparing
{
	public static void main(String[] args)
	{
		Student stud1 = new Student("Satya", 1);
		Student stud2 = new Student("Pinu", 2);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(stud1);
		studentList.add(stud2);
		
		
		Optional<Student> opt = studentList.stream().min(Comparator.comparing(student -> student.getRoll()));
		
		String studentName = opt.get().getName();
		System.out.println("Student Name : "+studentName);
	}
}
