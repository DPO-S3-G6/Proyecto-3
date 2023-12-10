package model;

public class MedioPago {

    private String tipo;
    private int numero;
    private int fechaVenc;

    public String getTipo() {
        return tipo;
    }

        public int getNumero() {
        return numero;
    }

    public int getFechaVenc() {
        return fechaVenc;
    }

    //Constructor de la clase medio de pago
    
    public MedioPago(String tipo, int numero, int fechaVenc) {
        this.tipo = tipo;
        this.numero = numero;
        this.fechaVenc = fechaVenc;
    }

}
