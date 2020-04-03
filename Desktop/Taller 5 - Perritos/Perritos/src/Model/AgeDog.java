package Model;

import java.util.Comparator;

public class AgeDog implements Comparator <Dog> {
	
	public int compare(Dog o1, Dog o2) {
		int age1 = Integer.parseInt(o1.getAge());
		int age2 = Integer.parseInt(o2.getAge());
		return age1 - age2;
	}
}

