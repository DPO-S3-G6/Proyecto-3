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
import javax.swing.JTextField;

public class GestionVehiculos extends JFrame implements ActionListener{

    private JPanel pnlGestion;
    private JPanel pnlDatos;
    private JPanel 

    private JButton btnAnadir;
	private JButton btnBuscar;
    private JButton btnActualizar;
    private JButton btnBorrar;
    private JButton btnSalir;

    private JLabel lblTitle;
    private JLabel lblNum;
    private JLabel lblCar;
    private JLabel lblMar;
    private JLabel lblCat;
    private JLabel lblPla;
    private JLabel lblCol;
    private JLabel lblCap;
    private JLabel lblTam;
    private JLabel lblTra;
    private JLabel lblEst;
    private JLabel lblDis;

    private JTextField txtNum;
    private JTextField txtCar;
    private JTextField txtMar;
    private JTextField txtCat;
    private JTextField txtPla;
    private JTextField txtCol;
    private JTextField txtCap;
    private JTextField txtTam;
    private JTextField txtTra;
    private JTextField txtEst;
    private JTextField txtDis;
    
    public GestionVehiculos()
    {
    	setSize( 750, 600 );
    	setTitle( "CARBOOK: Gestión Vehiculos" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    	
        //panel Gestión escirtura y criterios
        pnlGestion.setLayout( new GridLayout( 31, 1 ) );
        pnlGestion.setBorder();

        pnlGestion.add(new JLabel());
        lblTitle=new JLabel("Gestión Vehículos");
        pnlGestion.add(lblTitle);
        pnlGestion.add(new JLabel());
        lblNum=new JLabel("Numeral");
        pnlGestion.add(lblNum);
        txtNum=new JTextField("");
        txtNum.setEditable( true );
        pnlGestion.add(txtNum);
        lblCar=new JLabel("Carro");
        pnlGestion.add(lblCar);
        txtCar=new JTextField("");
        txtCar.setEditable( true );
        pnlGestion.add(txtCar);
        lblMar=new JLabel("Marca");
        pnlGestion.add(lblMar);
        txtMar=new JTextField("");
        txtMar.setEditable( true );
        pnlGestion.add(txtMar);
        lblCat=new JLabel("Categoría");
        pnlGestion.add(lblCat);
        txtCat=new JTextField("");
        txtCat.setEditable( true );
        pnlGestion.add(txtCat);
        lblPla=new JLabel("Placa");
        pnlGestion.add(lblPla);
        txtPla=new JTextField("");
        txtPla.setEditable( true );
        pnlGestion.add(txtPla);
        lblCol=new JLabel("Color");
        pnlGestion.add(lblCol);
        txtCol=new JTextField("");
        txtCol.setEditable( true );
        pnlGestion.add(txtCol);
        lblCap=new JLabel("Capacidad");
        pnlGestion.add(lblCap);
        txtCap=new JTextField("");
        txtCap.setEditable( true );
        pnlGestion.add(txtCap);
        lblTam=new JLabel("Tamaño");
        pnlGestion.add(lblTam);
        txtTam=new JTextField("");
        txtTam.setEditable( true );
        pnlGestion.add(txtTam);
        lblTra=new JLabel("Transmisión");
        pnlGestion.add(lblTra);
        txtTra=new JTextField("");
        txtTra.setEditable( true );
        pnlGestion.add(txtTra);
        lblEst=new JLabel("Estado");
        pnlGestion.add(lblEst);
        txtEst=new JTextField("");
        txtEst.setEditable( true );
        pnlGestion.add(txtEst);
        lblDis=new JLabel("Disponibilidad");
        pnlGestion.add(lblDis);
        txtDis=new JTextField("");
        txtDis.setEditable( true );
        pnlGestion.add(txtDis);
        pnlGestion.add(new JLabel());
        btnAnadir= new JButton ("Añadir");
        btnAnadir.setBackground(new Color (126,27,87))
        pnlGestion.add(btnAnadir, BorderLayout.CENTER);
        btnBuscar= new JButton ("BUSCAR");
        btnBuscar.setBackground( Color.WHITE )
        pnlGestion.add(btnBuscar, BorderLayout.CENTER);
        btnActualizar = new JButton ("ACTUALIZAR");
        btnActualizar.setBackground( new Color (255,222,89) )
        pnlGestion.add(btnActualizar, BorderLayout.CENTER);
        btnBorrar= new JButton ("BORRAR");
        btnBorrar.setBackground( new Color (255,87,87) )
        pnlGestion.add(btnBorrar, BorderLayout.CENTER);
        pnlGestion.add(new JLabel());
        
        //panel datos mostrados
        pnlDatos= new JPanel( );
        add(pnlDatos,BorderLayout.CENTER);




        btnAnadir.addActionListener( this );
        btnAnadir.setActionCommand( "An" );

        btnBuscar.addActionListener( this );
        btnBuscar.setActionCommand( "Bu" );


        btnActualizar.addActionListener( this );
        btnActualizar.setActionCommand( "Ac" );

        btnBorrar.addActionListener( this );
        btnBorrar.setActionCommand( "Bo" );

        btnSalir = new JButton ("SALIR");
        add(btnSalir, BorderLayout.CENTER);

        btnSalir.addActionListener( this );
        btnSalir.setActionCommand( "SALIR" );

        pnlGestion = new JPanel( );
        add(pnlGestion,BorderLayout.EAST);
    }
    
    public void paint (Graphics g)
	{
		
		ImageIcon Fondo = new ImageIcon(getClass().getResource("/images/Gestiones.png"));
		g.drawImage(Fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
		
	}
    
    public static void main(String[] args)
    {
    	JFrame ventana = new JFrame("GESTIÓN VEHÍCULOS");
    	MenuAdministradorGeneral inicio = new GestionVehiculos();
        ventana.setContentPane(inicio);
        ventana.setSize(600,600);
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    public void Buscar()
    {
        String Numeral= JOptionPane.showInputDialog( this, "Ingrese el Numeral", 
                "Buscar Vehículo", JOptionPane.QUESTION_MESSAGE );
        
        if(Numeral!=null)
        {
            try
            {
                Sedes buscada= GestionVehiculos.darSedeporNumeral( Numeral );
                panelCentro.actualizar( buscada );
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog( this, "No se encontró lo que buscaba", "ERROR", JOptionPane.WARNING_MESSAGE );
            }
        }
        
    
    }
    

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(evento.getActionCommand( ).equals( "An" ))
        {
            AñadirSede( );
        }
        else if (evento.getActionCommand( ).equals( "Bu" ))
        {
            BuscarSede();
        }
        else if (evento.getActionCommand( ).equals( "Ac" ))
        {
            Actualizar();
        }
        else if (evento.getActionCommand( ).equals( "Bo" ))
        {
            BorrarSede();
        }
        else if (evento.getActionCommand( ).equals( "SALIR" ))
        {
            SALIR();
        }
	}
        
}
