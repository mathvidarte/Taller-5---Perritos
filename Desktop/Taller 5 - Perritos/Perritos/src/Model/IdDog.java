package Model;

import processing.core.PApplet;

public class IdDog {
	private String id;
	private int posX;
	private int posY;
	private int tam;
	private PApplet app;
	
	public IdDog (String id, int posX, int posY, int tam, PApplet app) {
		this.id = id;
		this.posX = posX;
		this.posY = posY;
		this.tam = tam;
		this.app = app;
	}
	
	public void drawIdDog () {
		
	}
	
	
	//GETTERS AND SETTERS
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
