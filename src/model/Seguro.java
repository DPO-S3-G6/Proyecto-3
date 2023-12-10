package model;

public class Seguro {

    private String nombre;
    private int tarifa;

    public String getNombre() {
        return nombre;
    }

    public int getTarifa() {
        return tarifa;
    }
    //Constructor de la clase seguro
    public Seguro(String nombre, int tarifa) {
        this.nombre = nombre;
        this.tarifa = tarifa;
    }

}
