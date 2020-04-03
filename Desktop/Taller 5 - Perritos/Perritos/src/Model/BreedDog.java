package Model;

import processing.core.PApplet;

public class BreedDog {
	private String breed;
	private int posX;
	private int posY;
	private int tam;
	private PApplet app;
	
	public BreedDog (String breed, int posX, int posY, int tam, PApplet app) {
		this.breed = breed;
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		this.app = app;
	}
	
	public void drawBreedDog () {
		
	}

		
	//GETTERS AND SETTERS
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
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
