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

public class MenuAdministradorLocal extends JLabel implements ActionListener  
{
	private JButton btnGestionarEmple;
	private JButton btnSalir;
	
	private JLabel lblTitulo;
	

	
	private GestionEmpleados gestionEmpleado;
	
	
	
	
	
	
	
	public MenuAdministradorLocal ()    
	{
		
		
		//setSize(750, 600);
		setLayout(new BorderLayout());
		
		JPanel panelArriba = new JPanel();
		add(panelArriba, BorderLayout.NORTH);
		
		lblTitulo = new JLabel("BIENVENIDO DEVUELTA ADMIN LOCAL");
		lblTitulo.setPreferredSize(new Dimension (300,20));
		panelArriba.add(lblTitulo);

		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new GridLayout(2,1));
		
		btnGestionarEmple = new JButton ("GESTIONAR EMPLEADOS");
		btnGestionarEmple.setPreferredSize(new Dimension (50,10));
		btnGestionarEmple.setActionCommand("OPCION_1");
		btnGestionarEmple.addActionListener(this);
		panelCentral.add(btnGestionarEmple);
		

	    btnSalir = new JButton ("SALIR");
	    btnSalir.setPreferredSize(new Dimension (50,10));
	    btnSalir.setActionCommand("OPCION_3");
	    btnSalir.addActionListener(this);
	    panelCentral.add(btnSalir);

	    
	    JPanel panelDerecha = new JPanel();
	    ImageIcon icono = new ImageIcon("/images/Logo.png");
	    JLabel etiquetaImagen = new JLabel();
	    Icon icon = new ImageIcon(icono.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));      
	    etiquetaImagen.setIcon(icon);
	    etiquetaImagen.repaint();
	    panelDerecha.add(etiquetaImagen);
		add(panelDerecha, BorderLayout.EAST);
	    
	    
	}
	
	
	
	public void paint (Graphics g)
	{
		
		ImageIcon imagen = new ImageIcon(getClass().getResource("/images/background_2.png"));
		g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
		
		
		setOpaque(false);
		super.paint(g);
		
	} 
    
	
    public static void main(String[] args)
    {
    	JFrame ventana = new JFrame("MENU ADMIN GENERAL");
    	MenuAdministradorLocal inicio = new MenuAdministradorLocal();
        ventana.setContentPane(inicio);
        ventana.setSize(600,600);
        ventana.setLocationRelativeTo( null );
        ventana.setVisible(  );
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
    
    
    
    

 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	

    


}
