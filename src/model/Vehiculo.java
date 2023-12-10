package model;

public class Vehiculo {
	
	private String placa;
	private String marca;
	private String color;
	private String transmision;
	private int capacidad;
	private boolean estado;	
	private int size;
	private boolean disponible;

	//constructor de vehiculo
	public Vehiculo(String placa, String marca, String color,String transmision, int capacidad, boolean estado, int size, boolean disponible) {
		this.placa = placa;
		this.marca = marca;
		this.color = color;
		this.transmision = transmision;
		this.capacidad = capacidad;
		this.estado = estado;
		this.size = 0;
		this.disponible = true;
	}

}
