package Model;

import java.util.Comparator;

public class NameDog implements Comparator <Dog> {

	public int compare(Dog o1, Dog o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

	
}
