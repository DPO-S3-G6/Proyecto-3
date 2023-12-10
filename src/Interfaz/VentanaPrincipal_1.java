package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaPrincipal_1 extends JFrame
{
	private JButton btnAdminGeneral;
	private JButton btnAdminLocal;
	private JButton btnCliente;
	private JButton btnEmpleado;
	
	private JLabel etiquetaImagen;
	
	
	public VentanaPrincipal_1()
	{
		
		setSize(750, 600);
		setTitle("BIENVENIDO");
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		
		JPanel panelDerecha = new JPanel();
		panelDerecha.setLayout(new BorderLayout());
		
		
		setLayout(new GridLayout(4,1));
		
		btnAdminGeneral = new JButton ("NOMBRE COMPLETO");
	    add(btnAdminGeneral);

	    btnAdminLocal = new JButton ("USUARIO");
	    add(btnAdminLocal);

	    btnCliente = new JButton ("CONTRASEÑA");
	    add(btnCliente);

	    btnEmpleado = new JButton ("REGISTRARSE");
	    add(btnEmpleado);
	    
	    ImageIcon icono = new ImageIcon( "Data/.png" );
	    etiquetaImagen = new JLabel( "" );
	    etiquetaImagen.setIcon( icono );
	    
		
	}
	
	
   


	public void dispose()
    {
        JOptionPane.showMessageDialog( this, "se guard� la aplicaci�n" );
        System.exit( 0 );
    }
    
    
    public static void main(String[] args)
    {
        VentanaPrincipal_1 ventana = new VentanaPrincipal_1( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }

    
    

    //-----------------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------------

    /**
     * Constructor del panel.
     * <b>post: </b> Se construyó el panel.
     */

    
    
  //Etiqueta de Imagen
    //ImageIcon icono = new ImageIcon( "data/linea" + numeroLinea + ".png" );
    //etiquetaImagen = new JLabel( "" );
    //etiquetaImagen.setIcon( icono );
    //etiquetaImagen.setHorizontalAlignment( JLabel.CENTER );
}


