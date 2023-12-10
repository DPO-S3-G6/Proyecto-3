package model;

public class Licencia {
    
    private int Numero;
    private String PaisExp;
    private int FechaVenc;
    private String Imagen;

    

    //constructor de la clase LicenciaCond
    public Licencia(int Numero, String PaisExp, int FechaVenc, String Imagen) {
		this.Numero = Numero;
		this.PaisExp = PaisExp;
        this.FechaVenc = FechaVenc;
        this.Imagen = Imagen;
	}
    
    public String getImagen() {
        return Imagen;
    }

    public int getFechaVenc() {
        return FechaVenc;
    }

    public String getPaisExp() {
        return PaisExp;
    }

    public int getNumero() {
        return Numero;
    }
}
