package model;

import java.io.File;

public class sede {
	
	private String nombre;
	private String Ubicación;
	private int horaAtención;

	public String getNombre() {
		return nombre;
	}

	public String getUbicación() {
		return Ubicación;
	}

	public int getHoraAtención() {
		return horaAtención;
	}

	//constructor de la clase sede
	public sede(String nombre, String ubicación, int horaAtención) {
		this.nombre = nombre;
		Ubicación = ubicación;
		this.horaAtención = horaAtención;
	}
	

	public String empleado() { 
		return "";
	}

	public File gestionInv() { 
		return null ;
	}
}
