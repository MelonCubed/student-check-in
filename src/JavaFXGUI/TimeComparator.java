package JavaFXGUI;

import java.util.Comparator;

import backend.Student;

public class TimeComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		System.out.println(o1.getTime() + o2.getTime());
		return o1.getTime().compareTo(o2.getTime());
	}
}
