package Model;

import java.util.Comparator;

public class DateDog implements Comparator <Dog> {


	public int compare(Dog o1, Dog o2) {
		
		return o1.getDate().compareTo(o2.getDate());
	
}
}
	  
	

	
	
	
	


