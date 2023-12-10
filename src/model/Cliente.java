package model;

public class Cliente {

    private String CorreoElec; 
    private int NumeroCel;

    //constructor de la clase CLiente
    public Cliente(String CorreoElec, int NumeroCel) {
		this.CorreoElec = CorreoElec;
		this.NumeroCel = NumeroCel;
	}

    public int getNumeroCel() {
        return NumeroCel;
    }

    public String getCorreoElec() {
        return CorreoElec;
    }
    
    public String Reservar() {
		return "" ;
	}

    public String Licencia() {
		return "" ;
	}

    public String Pago() {
		return "" ;
	}

    public String CrearUsuario() { 
		return "";
	}

    public String IngresoApp() { 
		return "";
	}
}
