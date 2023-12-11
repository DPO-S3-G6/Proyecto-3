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

public class VentanaPrincipal_1 extends JFrame 
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
		// Esta linea sirve para llamar a la funcion de ImagenFondo que dentro de ella esta
		// la funcion paint requerida para poder poner un fondo en el panel. Toca de esta
		// manera puesto que la funcion poemos establecerle la extension JLabel que es la unica
		// que permite ejeuctar setOpaque.
		this.setContentPane(new ImagenFondo());
		
		
		//Estas 4 lineas son para el funcionamiento del panel. Puede que getCompnents sea inservible pero
		// no quitar.
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        getComponents();
        this.dispose();
        setResizable(false);
        
        
        
        //De aqui para adelante es ubicar los botones, cajas de texto o otros elementos en el panel.
        // Tambien como tamaños y colores
        setSize(1250,800);
        setLocationRelativeTo( null );
        
        
		setLayout(new BorderLayout());
		
		JPanel panelDerecha = new JPanel();
		add(panelDerecha, BorderLayout.EAST);
		
		panelDerecha.setLayout(new GridLayout(4,1));
		
		btnAdminGeneral = new JButton ("ADMINISTRADOR GENERAL");
		btnAdminGeneral.setPreferredSize(new Dimension (10,10));
		panelDerecha.add(btnAdminGeneral);
		

	    btnAdminLocal = new JButton ("ADMINISTRADOR LOCAL");
	    btnAdminLocal.setPreferredSize(new Dimension (10,10));
	    panelDerecha.add(btnAdminLocal);

	    btnCliente = new JButton ("EMPLEADO");
	    btnCliente.setPreferredSize(new Dimension (10,10));
	    panelDerecha.add(btnCliente);

	    btnEmpleado = new JButton ("CLIENTE");
	    btnEmpleado.setPreferredSize(new Dimension (200,30));
	    panelDerecha.add(btnEmpleado);
	    
	    
	    //Planeaba poner la imagen de logo, pero ha habido percances en su aplicacion
	    JPanel panelIzquierda = new JPanel();
	    ImageIcon icono = new ImageIcon("/images/Logo.png");
	    JLabel etiquetaImagen = new JLabel();
	    Icon icon = new ImageIcon(icono.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));      
	    etiquetaImagen.setIcon(icon);
	    etiquetaImagen.repaint();
	    panelIzquierda.add(etiquetaImagen);
		add(panelIzquierda, BorderLayout.WEST);
	    
	    
		// Estas lineas son otro metodo para ejecutar los botones al presionarlos en el panel.
		// Esto lo que hace es vincular el boton a la funcion actionPerformed, que es para ejecutar algun
		// comando, en este caso el click del boton.
		btnAdminGeneral.addActionListener(oyente);
		btnAdminLocal.addActionListener(oyente);
		btnCliente.addActionListener(oyente);
		btnEmpleado.addActionListener(oyente);
	}
	
	
	


	//Funcion para ejecutar el panel
    public static void main(String[] args)
    {
    	java.awt.EventQueue.invokeLater(new Runnable()
    	{
    		public void run() {
    			new VentanaPrincipal_1().setVisible(true);
    		}
    	});
    	
    }
    
    
    
    
    // Esta funcion es necesaria para aplicarle la extension de JPanel y asi poder
    // usar setOpaque
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
    
    
  
    // Linea para implementar los botones
    // Esta funcion tiene como objetivo el de abrir un panel y cerrar el actual. Cuando
    // se presiona un boton, el boton creara un vinculo con la interfaz a la que conecta
    // y activara su setVisble, lo que permitira ver esa interfaz y ek dispose es para cerra la actual.
    ActionListener oyente = new ActionListener() 
    {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			if (e.getSource() == btnAdminGeneral) 
			{
				MenuAdministradorGeneral MAG = new MenuAdministradorGeneral();
				MAG.setVisible(true);
				dispose();
			}
			
			else if (e.getSource() == btnAdminLocal)
			{
				MenuAdministradorLocal MAL = new MenuAdministradorLocal();
				MAL.setVisible(true);
				dispose();
			}
			
			else if (e.getSource() == btnEmpleado)
			{
				MenuEmpleado ME = new MenuEmpleado();
				ME.setVisible(true);
				dispose();
			}
			
			else if (e.getSource() == btnCliente)
			{
				MenuCliente MC = new MenuCliente();
				MC.setVisible(true);
				dispose();
			}
		}

		
    };

    
    
 
	
   
}


