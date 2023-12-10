package model;

public class Categoria {

	private String id;
	private int tarifaPorDia;
	private int valorAdd;
	private int valorCondutorAdd;

	//constructor de la clase Categoria
    public Categoria(String id, int tarifaPorDia, int valorAdd, int valorCondutorAdd) {
		this.id = id;
		this.tarifaPorDia = tarifaPorDia;
		this.valorAdd = valorAdd;
		this.valorCondutorAdd = valorCondutorAdd;
	}
	
	public int getValorCondutorAdd() {
		return valorCondutorAdd;
	}
	public String getId() {
		return id;
	}
	public int getTarifaPorDia() {
		return tarifaPorDia;
	}
	public int getValorAdd() {
		return valorAdd;
	}
	public int ValorTotal() {
		return 0 ;
	}
}

