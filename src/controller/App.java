package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 

{

    public void ejecutarAplicacion()
	{
		System.out.println("BIENVENIDO AL SISTEMA DE RESERVA Y ALQUILER DE CARROS \n");
        System.out.println("A continuacion, se le presentara tres categorias. Por favor, seleccione la categoria que se acomoda a su rol. \n");
 
		boolean continuar = true;
        boolean continuar_menu_administrador_G = false;
        boolean continuar_menu_administrador_L = false;
        boolean continuar_menu_empleado = false;
        boolean continuar_menu_cliente = false;
        
		
        while (continuar)
		{
			try
			{
				System.out.println("\nOpciones de la aplicación\n");
				System.out.println("1. ADMINISTRADOR GENERAL\n");
                System.out.println("2. ADMINISTRADOR LOCAL\n");
                System.out.println("3. EMPLEADO\n");
                System.out.println("4. CLIENTE\n");
                System.out.println("5. SALIR DE LA APLICACION\n");

                int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));

                if (opcion_seleccionada == 1) {
                    String login = input("Ingrese su login");
                    String contraseña = input("Ingrese su contraseña");
                    /**Empresa empresa = new Empresa();
                    boolean verificar = empresa.validarCedencialesAdmin(login, contraseña);
                    if (verificar) {
                        System.out.println("Entrando en categoria...");
                        continuar = false;
                        continuar_menu_administrador_G = true;
                    } else {
                        System.out.println("Credenciales incorrectas. Por favor intente de nuevo.");
                    }**/
                    System.out.println("Entrando en categoria...");
                    continuar = false;
                    continuar_menu_administrador_G = true;
                } 
                else if (opcion_seleccionada == 2) {
                    String login = input("Ingrese su login");
                    String contraseña = input("Ingrese su contraseña");
                    System.out.println("Entrando en categoria...");
					continuar = false;
                    continuar_menu_administrador_L = true;
				}
            

                else if (opcion_seleccionada == 3)
                {
                    String login = input("Ingrese su login");
                    String contraseña = input("Ingrese su contraseña");
                    System.out.println("Entrando en categoria...");
					continuar = false;
                    continuar_menu_empleado = true;
				}

                else if (opcion_seleccionada == 4)
                {
                    String login = input("Ingrese su login");
                    String contraseña = input("Ingrese su contraseña");
                    System.out.println("Entrando en categoria...");
					continuar = false;
                    continuar_menu_cliente = true;
				}

				else if (opcion_seleccionada == 5)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}

				else	
				{
					System.out.println("\nPor favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}

    
        
        while (continuar_menu_administrador_G)
		{   
			try
			{
                
                System.out.println("\nBIENVENIDO ADMINISTRADOR GENERAL. Por favor seleccione una de las siguientes opciones");

                System.out.println("1. Gestionar inventario de vehiculos (Agregar)");
                System.out.println("2. Gestionar el estado de un vehiculo");
                System.out.println("3. Eliminar vehiculo del inventario");
                System.out.println("4. Gestionar sedes");
                System.out.println("0. Salir de la aplicacion");

                int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
        
                if (opcion_seleccionada == 1)
                {
                    String placa = input("Ingrese la placa del vehiculo\n");
                    String marca = input("Ingrese la marca del vehiculo\n");
                    String color = input("Ingrese el color del vehiculo\n");
                    String transmision = input("Ingrese la transmision del vehiculo\n");
                    String categoria = input("Ingrese la categoria del vehiculo\n");
                    int capacidad = Integer.parseInt(input("Ingrese la capcaidad del vehiculo\n"));
                    boolean estado = Boolean.parseBoolean(input("Ingrese el estado del vehiculo\n"));
                    boolean disponible = Boolean.parseBoolean(input("Ingrese la disponibilidad del vehiculo\n"));
                    int size = Integer.parseInt(input("Ingrese el tamaño del vehiculo\n"));

                    System.out.println("Datos recibidos...");
                }


                else if (opcion_seleccionada == 2)
                
                {
                    String placa = input("Ingrese la placa del vehiculo\n");
                }

                else if (opcion_seleccionada == 3)
                {
                    String placa = input("Ingrese la placa del vehiculo\n");
                }

                else if (opcion_seleccionada == 4)
                {
                    
                }


                else if (opcion_seleccionada == 0)
                {
                    System.out.println("Saliendo de la aplicación ....");
					continuar_menu_administrador_G = false;  
                }
                
                else	
				{
					System.out.println("\nPor favor seleccione una opción válida.");
				}
            }
            catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
        }





        while (continuar_menu_administrador_L)
		{
			try
			{
                
                System.out.println("\nBIENVENIDO ADMINISTRADOR LOCAL. Por favor seleccione una de las siguientes opciones");

                System.out.println("1. Modificar informacion empleados");
                System.out.println("2. Crear usuario para empleado");
                System.out.println("0. Salir de la aplicacion");

                int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
                if (opcion_seleccionada == 1)
                {

                }

                else if (opcion_seleccionada == 2)
                {
                    String Nombres = input("Ingrese los nombres del empleado");
                    String Apellidos = input("Ingrese los apellidos del empleado"); 
                    String Usuario = input("Ingrese el usuario para registrar al empleado al sistema");
                    String Contraseña = input("Ingrese la contraseña para el usuario del empleado");
                }

            
                else if (opcion_seleccionada == 0)
                {
                    System.out.println("Saliendo de la aplicación ....");
					continuar_menu_administrador_L = false;  
                }
                
                else	
				{
					System.out.println("\nPor favor seleccione una opción válida.");
				}
            }
            catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
        }





        while (continuar_menu_empleado)
        {
            try
            {
                System.out.println("\nBIENVENIDO EMPLEADO. Por favor seleccione una de las siguientes opciones");

                System.out.println("1. Consultar inventario de vehiculos");
                System.out.println("2. Realizar reserva por cliente");
                System.out.println("3. Reportar mantenimiento de vehiculo");
                System.out.println("0. Salir de la aplicacion");
                int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));

                if (opcion_seleccionada == 1)
                {

                }

                else if (opcion_seleccionada == 2)
                {
                    
                }

                else if (opcion_seleccionada == 3)
                {
                    
                }


                else if (opcion_seleccionada == 0)
                {
                    System.out.println("Saliendo de la aplicación ...");
					continuar_menu_empleado = false;  
                }
                
                else	
				{
					System.out.println("\nPor favor seleccione una opción válida.");
				}
            }
            catch (NumberFormatException e)
            {
                System.out.println("Debe seleccionar uno de los números de las opciones.");
            } 
        }






    
        while (continuar_menu_cliente)
        {
            try
            {
                System.out.println("\nBIENVENIDO CLIENTE. Por favor seleccione una de las siguientes opciones");
                    
                System.out.println("1. Crear Usuario");
                System.out.println("2. Ingresar al sistema");
                System.out.println("3. Realizar una Reserva");
                System.out.println("4. Confirmar la reserva y guardar la factura");
                System.out.println("5. Añadir conductor adicional");
                System.out.println("6. Cancelar Reserva");
                System.out.println("0. Salir de la aplicacion");

                int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));


                if (opcion_seleccionada == 1)
                {
                    String Nombres = input("Ingrese nombres");
                    String Apellidos = input("Ingrese apellidos");
                    int Contacto = Integer.parseInt(input("Ingrese numero de telefono"));
                    String Licencia = input("Confirme licencia");
                    String MetodoPago = input("Confirme metodo de pago");
                    String Usuario = input("Ingrese el usuario para registrarse en el sistema");
                    String Contraseña = input("Ingrese la contraseña para registrarse en el sistema");
                    String Nacimiento = input("Ingrese su fecha de nacimiento");
                    String Nacionalidad = input("Ingrese su nacionalidad\n");
                    int Documento = Integer.parseInt(input("Ingrese su documento de identidad\n"));  
                    String Email = input("Ingrese su correo electronico\n");      
                }

                else if (opcion_seleccionada == 2)
                {
                    mostrarMenu_C();   
                }


                else if (opcion_seleccionada == 3)
                {
                     String Categoria = input("Ingrese la placa del vehiculo\n");
                     String fechaEntrega = input("Ingrese la placa del vehiculo\n");
                     String fechaDevoculucion = input("Ingrese la placa del vehiculo\n");
                     String Temporada = input("Ingrese la placa del vehiculo\n");
                     String metodoPago = input("Ingrese la placa del vehiculo\n");
                     String Seguro = input("Ingrese la placa del vehiculo\n");
                     String conductorAdicional = input("Ingrese la placa del vehiculo\n");
                     String Sede = input("Ingrese la placa del vehiculo\n");
                }

                else if (opcion_seleccionada == 4)
                {
                        
                }

                else if (opcion_seleccionada == 5)
                {
                        
                }

                else if (opcion_seleccionada == 6)
                {
                        
                }

                else if (opcion_seleccionada == 0)
                {
                    System.out.println("Saliendo de la aplicación ...");
					continuar_menu_cliente = false;
                }

                else	
				{
					System.out.println("\nPor favor seleccione una opción válida.");
				}
              
            }
            catch (NumberFormatException e)
            {
                System.out.println("Debe seleccionar uno de los números de las opciones.");
            } 
        }
    
    
    
    
    
    
    }
                    






    public void mostrarMenu_A_G()
	
    {
        

    }



    public void mostrarMenu_A_L()
	
    {
        

    }


    public void mostrarMenu_E()
	
    {
        

    }


    public void mostrarMenu_C()
	
    {
        System.out.println("\n INFORMACION IMPORTANTE PARA LA RESERVA Y ALQUILER DE VEHICULOS \n");
        
        System.out.println("------ SEGUROS ------");
        System.out.println("Seguro diario obligatorio -> Precio: $150,000");
        System.out.println("1. Nivel bajo -> Precio: $170,000 ");
        System.out.println("2. Nivel normal -> Precio: $560,000");
        System.out.println("3. Nivel vip -> Precio: $960,000");

        System.out.println("------ CONDUCTOR ADICIONAL ------");
        System.out.println("Conductor adcional a la hora de recoger el vehiculo -> Precio: $40,000 ");

        System.out.println("------ SEDE ------");
        System.out.println("Si el vehiculo es entregada en otra sede -> Precio: $25,000 ");

        System.out.println("------ Temporada ------");
        System.out.println("Temporada Alta (mayo, junio, julio, agosto) -> Precio: $80,000 ");
        System.out.println("Temporada Baja (enero, febrero, marzo, abril, septiembre, octubre, noviembre, diciembre) -> Precio: $55,000 ");


    }


























    public static void main(String args[])
	{
		App consola = new App();
		consola.ejecutarAplicacion();
	}
	
	
	
	public static String input(String mensaje) {
		try {
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (IOException e) {
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

}
