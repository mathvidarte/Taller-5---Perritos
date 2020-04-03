package Model;

import processing.core.PApplet;

public class NameDog {
	private String name;
	private int posX;
	private int posY;
	private int tam;
	private PApplet app;
	
	public NameDog (String name, int posX, int posY, int tam, PApplet app) {
		this.name = name;
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		this.app = app;
	}
	
	public void drawNameDog () {
		
	}
	
	//GETTERS AND SETTERS
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
