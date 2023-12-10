package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Icon;

public class VentanaPrincipal_1 extends JLabel implements ActionListener
{
	private JButton btnAdminGeneral;
	private JButton btnAdminLocal;
	private JButton btnCliente;
	private JButton btnEmpleado;
	

	
	private MenuAdministradorGeneral adminGeneral;
	private MenuAdministradorLocal adminLocal;
	private MenuCliente cliente;
	private MenuEmpleado empleado;
	
	
	
	
	
	public VentanaPrincipal_1( )      
	{
		
		
		//setSize(750, 600);
		setLayout(new BorderLayout());
		
		JPanel panelDerecha = new JPanel();
		add(panelDerecha, BorderLayout.EAST);
		
		panelDerecha.setLayout(new GridLayout(4,1));
		
		btnAdminGeneral = new JButton ("ADMINISTRADOR GENERAL");
		btnAdminGeneral.setPreferredSize(new Dimension (10,10));
		btnAdminGeneral.setActionCommand("OPCION_1");
		btnAdminGeneral.addActionListener(this);
		panelDerecha.add(btnAdminGeneral);
		

	    btnAdminLocal = new JButton ("ADMINISTRADOR LOCAL");
	    btnAdminLocal.setPreferredSize(new Dimension (10,10));
	    btnAdminLocal.setActionCommand("OPCION_2");
	    btnAdminLocal.addActionListener(this);
	    panelDerecha.add(btnAdminLocal);

	    btnCliente = new JButton ("EMPLEADO");
	    btnCliente.setPreferredSize(new Dimension (10,10));
	    btnCliente.setActionCommand("OPCION_3");
	    btnCliente.addActionListener(this);
	    panelDerecha.add(btnCliente);

	    btnEmpleado = new JButton ("CLIENTE");
	    btnEmpleado.setPreferredSize(new Dimension (200,30));
	    btnEmpleado.setActionCommand("OPCION_4");
	    btnEmpleado.addActionListener(this);
	    panelDerecha.add(btnEmpleado);
	    
	    JPanel panelIzquierda = new JPanel();
	    ImageIcon icono = new ImageIcon("/images/Logo.png");
	    JLabel etiquetaImagen = new JLabel();
	    Icon icon = new ImageIcon(icono.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));      
	    etiquetaImagen.setIcon(icon);
	    etiquetaImagen.repaint();
	    panelIzquierda.add(etiquetaImagen);
		add(panelIzquierda, BorderLayout.WEST);
	    
	    
	}
	
	
	
	public void paint (Graphics g)
	{
		
		ImageIcon imagen = new ImageIcon(getClass().getResource("/images/background.png"));
		g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
		
		
		setOpaque(false);
		super.paint(g);
		
	}
    
	
    public static void main(String[] args)
    {
    	JFrame ventana = new JFrame("MENU");
        VentanaPrincipal_1 inicio = new VentanaPrincipal_1();
        ventana.setContentPane(inicio);
        ventana.setSize(600,600);
        ventana.setLocationRelativeTo( null );
        
      
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
        	
        });

    }
    
    
    

    

    
    public void actionPerformed( ActionEvent e)
    {
    	
    	//empleado = pEmpleado;
    	//cliente = pCliente;
    	//adminLocal = pAdminLocal;
    	//adminGeneral = pAdminGeneral;
    	
        // TODO Auto-generated method stub
        if(e.getActionCommand( ).equals( "OPCION_1" ))
        {
        	MenuEmpleado MAG = new MenuEmpleado();
			MAG.setVisible(true);
        	
        }
        
        
    }







	



	
   
}


