package View;

import Controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {
	
	private ControllerMain createMain;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	
	public void settings () {
		size ( 600, 600);
	}
	
	public void  setup () {
		createMain = new ControllerMain (this);
		
		
	}
	
	public void draw () {
		background (100, 100, 200);
		
		for (int i = 0; i <createMain.dog().size(); i++) {
			createMain.dog().get(i).drawDog((i*(50))+ 80, this);
		}
		
	}
	
	public void keyPressed () {
		createMain.sortListController(key);
	}
	
	
	

}
