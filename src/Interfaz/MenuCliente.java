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

public class MenuCliente extends JLabel implements ActionListener  
{
	private JButton btnReservarVehiculo;
	private JButton btnConsultarPerfil;
	private JButton btnVerReserva;
	private JButton btnSalir;
	
	private JLabel lblTitulo;
	

	
	private ReservaVehiculoCliente reservarVehiculo;
	private Reserva consultarReserva;
	private Perfil consultarPerfil;
	
	
	
	
	
	
	public MenuCliente ()    
	{
		
		//setSize(750, 600);
		setLayout(new BorderLayout());
		
		JPanel panelArriba = new JPanel();
		add(panelArriba, BorderLayout.NORTH);
		
		lblTitulo = new JLabel("MENU CLIENTE");
		lblTitulo.setPreferredSize(new Dimension (300,20));
		panelArriba.add(lblTitulo);

		
		
		
		
		JPanel panelIzquierdo = new JPanel();
		add(panelIzquierdo, BorderLayout.WEST);
		panelIzquierdo.setLayout(new GridLayout(2,1));
		
		btnReservarVehiculo = new JButton ("RESERVAR VEHICULO");
		btnReservarVehiculo.setPreferredSize(new Dimension (50,10));
		btnReservarVehiculo.setActionCommand("OPCION_1");
		btnReservarVehiculo.addActionListener(this);
		panelIzquierdo.add(btnReservarVehiculo, BorderLayout.NORTH);
		
		btnVerReserva = new JButton ("VER RESERVA");
		btnVerReserva.setPreferredSize(new Dimension (50,10));
		btnVerReserva.setActionCommand("OPCION_2");
		btnVerReserva.addActionListener(this);
		panelIzquierdo.add(btnVerReserva, BorderLayout.SOUTH);
		
		
		
		
		
		
		JPanel panelDerecho = new JPanel();
		add(panelDerecho, BorderLayout.EAST);
		//panelDerecho.setLayout(new GridLayout(2,1));
		panelDerecho.setPreferredSize(new Dimension (200,100));
		
		JPanel panelDerecho_Arriba = new JPanel();
		panelDerecho.add(panelDerecho_Arriba);
		panelDerecho_Arriba.setLayout(new GridLayout(1,1));
		panelDerecho_Arriba.setPreferredSize(new Dimension (200,100));
		
		JPanel panelDerecho_Abajo = new JPanel();
		panelDerecho.add(panelDerecho_Abajo);
		panelDerecho_Abajo.setLayout(new GridLayout(1,1));
		panelDerecho_Abajo.setPreferredSize(new Dimension (200,100));
		
		btnConsultarPerfil = new JButton ("CONSULTAR PERFIL");
		btnConsultarPerfil.setPreferredSize(new Dimension (50,10));
		btnConsultarPerfil.setActionCommand("OPCION_3");
		btnConsultarPerfil.addActionListener(this);
		panelDerecho_Arriba.add(btnConsultarPerfil, BorderLayout.NORTH);

	    btnSalir = new JButton ("SALIR");
	    btnSalir.setPreferredSize(new Dimension (50,10));
	    btnSalir.setActionCommand("OPCION_4");
	    btnSalir.addActionListener(this);
	    panelDerecho_Abajo.add(btnSalir, BorderLayout.SOUTH);

	    
	    
	    
	    
	    
	    
	    
	}
	
	
	
	public void paint (Graphics g)
	{
		
		ImageIcon imagen = new ImageIcon(getClass().getResource("/images/background_3.png"));
		g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
		
		
		setOpaque(false);
		super.paint(g);
		
	}
    
	
    public static void main(String[] args)
    {
    	JFrame ventana = new JFrame("MENU ADMIN GENERAL");
    	MenuCliente inicio = new MenuCliente();
        ventana.setContentPane(inicio);
        ventana.setSize(600,600);
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
    
    
    
    

 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	

    


}
