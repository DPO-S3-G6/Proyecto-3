package Interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuAdministradorGeneral extends JFrame  
{
	private JButton btnGestionarInv;
	private JButton btnGestionarSede;
	private JButton btnSalir;
	
	private JLabel lblTitulo;
	

	
	private GestionVehiculos gestionVehiculo;
	private GestionSedes gestionSede;

	
	
	public MenuAdministradorGeneral ()    
	{
		
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        getComponents();
        this.dispose();
        setResizable(false);
        
        setSize(600,600);
        setLocationRelativeTo( null );

        
        
        
        setLayout(new BorderLayout());
		
		JPanel panelArriba = new JPanel();
		add(panelArriba, BorderLayout.NORTH);
		
		lblTitulo = new JLabel("BIENVENIDO DEVUELTA ADMIN GENERAL");
		lblTitulo.setPreferredSize(new Dimension (300,20));
		panelArriba.add(lblTitulo);

		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(3,1));
		
		btnGestionarInv = new JButton ("GESTIONAR INVENTARIO");
		btnGestionarInv.setPreferredSize(new Dimension (50,10));
		btnGestionarInv.setActionCommand("OPCION_1");
		//btnGestionarInv.addActionListener(this);
		panelCentral.add(btnGestionarInv);
		
		btnGestionarSede = new JButton ("GESTIONAR SEDE");
		btnGestionarSede.setPreferredSize(new Dimension (50,10));
		btnGestionarSede.setActionCommand("OPCION_2");
		//btnGestionarSede.addActionListener(this);
		panelCentral.add(btnGestionarSede);
		
	    btnSalir = new JButton ("SALIR");
	    btnSalir.setPreferredSize(new Dimension (50,10));
	    btnSalir.setActionCommand("OPCION_3");
	    //btnSalir.addActionListener(this);
	    panelCentral.add(btnSalir);

	    
	    JPanel panelDerecha = new JPanel();
	    ImageIcon icono = new ImageIcon("/images/Logo.png");
	    JLabel etiquetaImagen = new JLabel();
	    Icon icon = new ImageIcon(icono.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));      
	    etiquetaImagen.setIcon(icon);
	    etiquetaImagen.repaint();
	    panelDerecha.add(etiquetaImagen);
		add(panelDerecha, BorderLayout.WEST);

	    
	}
	
	
	public void paint (Graphics g)
	{
		
		ImageIcon imagen = new ImageIcon(getClass().getResource("/images/background_2.png"));
		g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
		
		
		//setOpaque(false);
		super.paint(g);
		
	}


	
	

	
    public static void main(String[] args)
    {
    	java.awt.EventQueue.invokeLater(new Runnable()
    	{
    		public void run() {
    			new MenuAdministradorGeneral().setVisible(true);
    		}
    	});
    	
    }
    
}

