package Model;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	public PApplet app;
	private String [] datos;
	private String [] datosDos; 
	private String [] textSplit;
	private String [] textSplitTwo;
	private LinkedList <Dog> dog;
	private int id;
	private String name;
	private String age;
	private String breed;
	private String date;
	
	private BreedDog breedDog;
	private DateDog dateDog;
	private NameDog nameDog;
	private AgeDog ageDog;
	
	public Logic (PApplet app) {
		this.app = app;
		
		breedDog = new BreedDog();
		dateDog = new DateDog();
		nameDog = new NameDog();
		ageDog = new AgeDog();
		
		datos = app.loadStrings ("../data/datosUno.txt");
		datosDos = app.loadStrings("../data/datosDos.txt");
		dog = new LinkedList <Dog> ();
		createDog();
	}
	
	private void createDog () {
		for (int i = 0; i < datos.length; i++) {
			textSplit = datos[i].split(",");
			for (int j = 0; j <datosDos.length; j++) {
				textSplitTwo = datosDos[j].split(",");
			if (textSplitTwo[0].equals(textSplit[0])) {
			    id = Integer.parseInt (textSplit[0]);
			    name = textSplit[1];
			    age =  textSplit[2];
			    breed = textSplitTwo[1];
			    date = textSplitTwo [2];
			    
			    dog.add(new Dog (name, age, breed, date, id, app));
			}
		}
	}
	}
	
	public LinkedList <Dog> getDog () {
		return dog;
	}
	
	public void setDog (LinkedList<Dog> dog) {
		this.dog = dog;
	}

	public void sortList(char i) {
		switch (i) {
		case 'i':
			Collections.sort(dog);
			
			/*for (int j = 0; j < dog.size(); j++) {
				System.out.println(dog.get(j).getId());
			
			}*/
			break;
		case 'b':
			Collections.sort(dog, breedDog);
			try {
                printReport();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
			break;
		case 'd':
			Collections.sort(dog, dateDog);
			try {
                printReport();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
			break;
		case 'n' :
			Collections.sort(dog, nameDog);
			try {
                printReport();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
			break;
			
		case 'a' :
			Collections.sort(dog, ageDog);
			try {
                printReport();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
		}
	}
	
	public void printReport () throws FileNotFoundException {
		PrintWriter pw = new PrintWriter (new File("data/datosNuevo.txt"));
		pw.print(info());
		pw.close();
	}
	
	public String info() {
		String myInfo = "";
		for ( int i = 0; i < dog.size(); i++) {
			Dog d = dog.get(i);
			String msg = d.getId() + " " + d.getName().toLowerCase() + " " + d.getDate() + " " + d.getBreed().toLowerCase() + " " + d.getAge();;
			myInfo += msg + "/n";
		}
		return myInfo;
		
	}
	

	
}
	
	
	
	


