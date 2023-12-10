package model;

import java.io.File;

public class Admin implements User 
{

	public String nombreCompleto;
	public String login;
	public String contraseña;
	private String tipo;

	public String getTipo() {
        return tipo;
    }

    //constructor de la clase Admin
    public Admin(String Tipo, String string) {
		this.tipo = Tipo;
	}

	public String RegistroVeh() { 
		return "";
	}

    public String ModVeh() { 
		return "";
	}
    
	public String GestionSede() { 
		return ""; 
	}
	public String GestionEmple() { 
		return ""; 

	}
	public String RegistroEmple() { 
		return ""; 
	}
	public String IngresoApp() { 
		return "";
	}

	@Override
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	@Override
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String getContraseña() {
		return contraseña;
	}

	    public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
