package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaPrincipal_1 extends JLabel
{
	private JButton btnAdminGeneral;
	private JButton btnAdminLocal;
	private JButton btnCliente;
	private JButton btnEmpleado;
	
	private JLabel etiquetaImagen;
	
	private MenuAdministradorGeneral adminGeneral;
	private MenuAdministradorLocal adminLocal;
	private MenuCliente cliente;
	private MenuEmpleado empleado;
	private static boolean condicion;
	
	
	
	
	public VentanaPrincipal_1()      
	{
		
		//setSize(750, 600);
		setLayout(new BorderLayout());
		
		JPanel panelDerecha = new JPanel();
		add(panelDerecha, BorderLayout.EAST);
		
		panelDerecha.setLayout(new GridLayout(4,1));
		
		btnAdminGeneral = new JButton ("NOMBRE COMPLETO");
		btnAdminGeneral.setPreferredSize(new Dimension (200,80));
		btnAdminGeneral.setActionCommand("OPCION_1");
		//btnAdminGeneral.addActionListener(ActionListener.class, this);
		panelDerecha.add(btnAdminGeneral);

	    btnAdminLocal = new JButton ("USUARIO");
	    panelDerecha.add(btnAdminLocal);

	    btnCliente = new JButton ("CONTRASEÑA");
	    panelDerecha.add(btnCliente);

	    btnEmpleado = new JButton ("REGISTRARSE");
	    panelDerecha.add(btnEmpleado);
	    
	    //ImageIcon icono = new ImageIcon( "Data/.png" );
	    //etiquetaImagen = new JLabel( "" );
	    //etiquetaImagen.setIcon( icono );
	    
		
	}
	
	
	
	public void paint (Graphics g)
	{
		
		ImageIcon imagen = new ImageIcon(getClass().getResource("/images/background.png"));
		g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
		
		
		//setOpaque(false);
		//super.paint(g);
		
	}
    
	
    public static void main(String[] args)
    {
    	JFrame ventana = new JFrame("MENU");
        VentanaPrincipal_1 inicio = new VentanaPrincipal_1();
        ventana.setContentPane(inicio);
        ventana.setSize(600,600);
        ventana.setLocationRelativeTo( null );
        condicion = true;
        ventana.setVisible( condicion );
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
    

    
    public void actionPerformed( ActionEvent evento, MenuEmpleado pEmpleado, MenuCliente pCliente, MenuAdministradorLocal pAdminLocal, MenuAdministradorGeneral pAdminGeneral )
    {
    	
    	empleado = pEmpleado;
    	cliente = pCliente;
    	adminLocal = pAdminLocal;
    	adminGeneral = pAdminGeneral;
    	
        // TODO Auto-generated method stub
        if(evento.getActionCommand( ).equals( "OPCION_1" ))
        {
        	this.setVisible(false);
        	adminGeneral.setVisible(true);
        }
        else if (evento.getActionCommand( ).equals( "U" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando GS" );
        }
        else if (evento.getActionCommand( ).equals( "C" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción SALIR" );
        }
        else if (evento.getActionCommand( ).equals( "R" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción SALIR" );
        }
        
    }
   
}


