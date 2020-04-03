package Model;

import processing.core.PApplet;

public class AgeDog {
	private String age;
	private int posX;
	private int posY;
	private int tam;
	private PApplet app;
	
	public AgeDog (String age, int posX, int posY, int tam, PApplet app) {
		this.age = age;
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		this.app = app;
	}
	
	public void drawAgeDog () {
		
	}
	
	
	//GETTERS AND SETTERS
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
}
