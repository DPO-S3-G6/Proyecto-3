package model;

import java.io.File;

public class Empleado {
    
    private String Cargo;
    private int Horario;

    //constructor de la clase empleado
    public Empleado(String Cargo, int Horario) {
		this.Cargo = Cargo;
		this.Horario = Horario;
	}
    
    public int getHorario() {
        return Horario;
    }

    public String getCargo() {
        return Cargo;
    }
    
    public String ReporteVeh() { 
		return "";
	}
    public File Inv() { 
		return null;
	}
}
