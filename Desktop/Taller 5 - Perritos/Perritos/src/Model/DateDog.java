package Model;

import processing.core.PApplet;

public class DateDog {
	private String date;
	private int posX;
	private int posY;
	private int tam;
	private PApplet app;
	
	public DateDog (String date, int posX, int posY, int tam, PApplet app) {
		this.date = date;
		this.date = date;
		this.posX = posX;
		this.tam = tam;
		this.app = app;
	}
	
	public void drawDateDog () {
		
	}
	
	
	//GETTERS AND SETTERS
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
