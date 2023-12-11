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

public class MenuCliente extends JFrame  
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
		
		this.setContentPane(new ImagenFondo());
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        getComponents();
        this.dispose();
        setResizable(false);
        
        setSize(1250,800);
        setLocationRelativeTo( null );
		
		
		
		setLayout(new BorderLayout());
		
		JPanel panelArriba = new JPanel();
		add(panelArriba, BorderLayout.NORTH);
		
		lblTitulo = new JLabel("MENU CLIENTE");
		lblTitulo.setPreferredSize(new Dimension (300,20));
		panelArriba.add(lblTitulo);

		
		
		
		
		JPanel panelIzquierdo = new JPanel();
		add(panelIzquierdo, BorderLayout.WEST);
		//panelIzquierdo.setLayout(new GridLayout(2,1));
		panelIzquierdo.setPreferredSize(new Dimension (200,50));
		panelIzquierdo.setOpaque(false);
		
		JPanel panelIzquierdo_Arriba = new JPanel();
		panelIzquierdo.add(panelIzquierdo_Arriba);
		panelIzquierdo_Arriba.setLayout(new GridLayout(1,1));
		panelIzquierdo_Arriba.setPreferredSize(new Dimension (200,100));
		
		JPanel panelIzquierdo_Abajo = new JPanel();
		panelIzquierdo.add(panelIzquierdo_Abajo);
		panelIzquierdo_Abajo.setLayout(new GridLayout(1,1));
		panelIzquierdo_Abajo.setPreferredSize(new Dimension (200,100));
		
		
		btnReservarVehiculo = new JButton ("RESERVAR VEHICULO");
		btnReservarVehiculo.setPreferredSize(new Dimension (50,10));
		panelIzquierdo_Arriba.add(btnReservarVehiculo, BorderLayout.NORTH);
		
		btnVerReserva = new JButton ("VER RESERVA");
		btnVerReserva.setPreferredSize(new Dimension (50,10));
		panelIzquierdo_Abajo.add(btnVerReserva, BorderLayout.SOUTH);
		
		
		
		
		
		
		JPanel panelDerecho = new JPanel();
		add(panelDerecho, BorderLayout.EAST);
		//panelDerecho.setLayout(new GridLayout(2,1));
		panelDerecho.setPreferredSize(new Dimension (200,50));
		panelDerecho.setOpaque(false);
		
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
		panelDerecho_Arriba.add(btnConsultarPerfil, BorderLayout.NORTH);

	    btnSalir = new JButton ("SALIR");
	    btnSalir.setPreferredSize(new Dimension (50,10));
	    panelDerecho_Abajo.add(btnSalir, BorderLayout.SOUTH);


	    
	    
	    btnReservarVehiculo.addActionListener(oyente);
	    btnConsultarPerfil.addActionListener(oyente);
	    btnVerReserva.addActionListener(oyente);
		btnSalir.addActionListener(oyente);
	    
	}
	
	
    
	
    public static void main(String[] args)
    {
    	java.awt.EventQueue.invokeLater(new Runnable()
    	{
    		public void run() {
    			new MenuCliente().setVisible(true);
    		}
    	});
    	
    }
    
   
    public class ImagenFondo extends JPanel
    {
    	public void paint (Graphics g) 
    	{
    		
    		ImageIcon imagen = new ImageIcon(getClass().getResource("/images/background_3.png"));
    		
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
			if (e.getSource() == btnReservarVehiculo) 
			{
				ReservaVehiculoCliente RVC = new ReservaVehiculoCliente();
				RVC.setVisible(true);
				dispose();
			}
			
			else if (e.getSource() == btnConsultarPerfil)
			{
				Perfil P = new Perfil();
				P.setVisible(true);
				dispose();
			}
			
			else if (e.getSource() == btnVerReserva)
			{
				Reserva R = new Reserva();
				R.setVisible(true);
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


