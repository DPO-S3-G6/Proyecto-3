package controller;

import java.util.ArrayList;
import java.util.List;

import model.Admin;
//Hola
public class Empresa {

    private List<Admin> administradores;

    public void validarU() {
		administradores = new ArrayList<Admin>();
		cargarUsuarios();
	}
	private List<Admin> cargarUsuarios() {
		Admin administrador = new Admin("admin1","1234");
		administradores.add(administrador);
		Admin administrador2 = new Admin("admin2","1234");
		administradores.add(administrador2);
		System.out.println(administradores);
		return administradores;
	}
    public boolean validarCedencialesAdmin(String login,String contraseña) {
		System.out.println(administradores.size());
		boolean encontre=false;
		for (int i=0;i<administradores.size();i++) {
			System.out.println(login);
			System.out.println(administradores.get(i).getLogin());
			if (administradores.get(i).getLogin().equals(login) ) {
				if (administradores.get(i).getContraseña().equals(contraseña)) {
					encontre=true;
				}
			}
		}
		return encontre;
	}

}

