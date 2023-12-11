package model;

import java.util.Properties;
public class Vehiculo {
	
	private String Numeral;
	private String Nombre;
	private String placa;
	private String marca;
	private String color;
	private String transmision;
	private int capacidad;
	private boolean estado;	
	private int size;
	private boolean disponible;

	//constructor de vehiculo
	public Vehiculo darVehiculo(int pNumVehiculo, Properties pDatos) throws Excepcion {
		try
        {
    
            Nombre = pDatos.getProperty( "GestionVehiculos.Vehiculo" + pNumVehiculo + ".Carro" );
            nombreArtista = pDatos.getProperty( "museo.obra" + pNumVehiculo + ".nombreArtista" );
            estaRemate = Boolean.parseBoolean( pDatos.getProperty( "museo.obra" + pNumVehiculo + ".remate" ) );
            intTipo = Integer.parseInt( pDatos.getProperty( "museo.obra" + pNumVehiculo + ".tipo" ) );
            
        }
        catch( Exception e )
        {
//            e.printStackTrace( );
            throw new EjemploExcepcion( "Error en el formato del archivo", nombreObra );
            
    
	
		}
	public getVehiculo
	
	
	}
}
