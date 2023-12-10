package model;

public class ConductorAdd {
    
    private int Cantidad;
    private String CorreoElec; 
    private int NumeroCel;

    //constructor de la clase Categoria
    public ConductorAdd(String CorreoElec, int NumeroCel, int Cantidad) {
		this.CorreoElec = CorreoElec;
		this.NumeroCel = NumeroCel;
        this.Cantidad = Cantidad;
	}

    public int getNumeroCel() {
        return NumeroCel;
    }

    public String getCorreoElec() {
        return CorreoElec;
    }

    public int getCantidad() {
        return Cantidad;
    }
    
    public String Licencia() {
		return "" ;
	}
}
