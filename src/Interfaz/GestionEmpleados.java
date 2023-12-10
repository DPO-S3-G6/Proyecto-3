package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.EventListener;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent
public class GestionEmpleados extends JFrame implements ActionListener{
    
    private JButton btnAnadir;
	private JButton btnBuscar;
    private JButton btnActualizar;
    private JButton btnBorrar;
    private JButton btnSalir;

    public GestionEmpleados()
    {
    	setSize( 750, 600 );
    	setTitle( "GESTION EMPLEADOS" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        setLayout(new BorderLayout());

        btnAnadir= new JButton ("Añadir");
        add(btnAnadir, BorderLayout.CENTER);

        btnAnadir.addActionListener( this );
        btnAnadir.setActionCommand( "An" );

        btnBuscar= new JButton ("BUSCAR");
        add(btnBuscar, BorderLayout.CENTER);

        btnBuscar.addActionListener( this );
        btnBuscar.setActionCommand( "Bu" );

        btnActualizar = new JButton ("ACTUALIZAR");
        add(btnActualizar, BorderLayout.CENTER);

        btnActualizar.addActionListener( this );
        btnActualizar.setActionCommand( "Ac" );

        btnBorrar= new JButton ("BORRAR");
        add(btnBorrar, BorderLayout.CENTER);

        btnBorrar.addActionListener( this );
        btnBorrar.setActionCommand( "Bo" );

        btnSalir = new JButton ("SALIR");
        add(btnSalir, BorderLayout.CENTER);

        btnSalir.addActionListener( this );
        btnSalir.setActionCommand( "SALIR" );
    	
    }
    
    public void actionPerformed( ActionEvent evento )
    {
        // TODO Auto-generated method stub
        if(evento.getActionCommand( ).equals( "An" ))
        {
        	JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando Añadir" );
        }
        else if (evento.getActionCommand( ).equals( "Bu" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando Buscar" );
        }
        else if (evento.getActionCommand( ).equals( "Ac" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción Actualizar" );
        }
        else if (evento.getActionCommand( ).equals( "Bo" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción Borrar" );
        }
        else if (evento.getActionCommand( ).equals( "SALIR" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción SALIR" );
        }
        
    }
    
    public void dispose()
    {
        JOptionPane.showMessageDialog( this, "se guardó la aplicación" );
        System.exit( 0 );
    }
    public static void main(String[] args)
    {
        MenuCliente ventana = new MenuGestionEmpleadosCliente( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }
        
}
