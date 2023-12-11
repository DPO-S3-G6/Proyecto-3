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

import Interfaz.VentanaPrincipal_1.ImagenFondo;

public class MenuAdministradorLocal extends JFrame
{
	private JButton btnGestionarEmple;
	private JButton btnSalir;
	
	private JLabel lblTitulo;
	


	public MenuAdministradorLocal ()    
	{
		
		this.setContentPane(new ImagenFondo());
		
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		getComponents();
        this.dispose();
        setResizable(false);
        
		setLayout(new BorderLayout());
		setSize(1250,800);
        setLocationRelativeTo( null );
        
        
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
		panelCentral.add(btnGestionarEmple);
		

	    btnSalir = new JButton ("SALIR");
	    btnSalir.setPreferredSize(new Dimension (50,10));
	    panelCentral.add(btnSalir);

	    
	    JPanel panelDerecha = new JPanel();
	    ImageIcon icono = new ImageIcon("/images/Logo.png");
	    JLabel etiquetaImagen = new JLabel();
	    Icon icon = new ImageIcon(icono.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));      
	    etiquetaImagen.setIcon(icon);
	    etiquetaImagen.repaint();
	    panelDerecha.add(etiquetaImagen);
		add(panelDerecha, BorderLayout.EAST);
	    
	    
		
		btnGestionarEmple.addActionListener(oyente);
		btnSalir.addActionListener(oyente);
		
	}
	
	
	
    public static void main(String[] args)
    {
    	java.awt.EventQueue.invokeLater(new Runnable()
    	{
    		public void run() {
    			new MenuAdministradorLocal().setVisible(true);
    		}
    	});
    	
    }
    
    
    
    public class ImagenFondo extends JPanel
    {
    	
    	public void paint (Graphics g)
    	{
    		
    		ImageIcon imagen = new ImageIcon(getClass().getResource("/images/background.png"));
    		g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
    		setOpaque(false);
    		super.paint(g);
    		
    	}
        	
    }
    
    
    
    ActionListener oyente = new ActionListener() 
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			if (e.getSource() == btnGestionarEmple) 
			{
				GestionEmpleados GE = new GestionEmpleados();
				GE.setVisible(true);
				dispose();
			}		
			else if (e.getSource() == btnSalir)
			{
				VentanaPrincipal_1 VP = new VentanaPrincipal_1();
				VP.setVisible(true);
				dispose();
			}
		}

		
    };


   


}
