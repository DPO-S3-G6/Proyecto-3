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

import model.Empleado;

public class GestionEmpleados extends JFrame implements ActionListener{

    private JPanel plNavegacion;
    private JPanel plGestion;
    
    private JButton btnAnadir;
	private JButton btnBuscar;
    private JButton btnActualizar;
    private JButton btnBorrar;
    private JButton btnSalir;

    private JLabel lblTitle;
    private JLabel lblNum;
    private JLabel lblApe;
    private JLabel lblUsu;
    private JLabel lblCon;
    private JLabel lblNom;

    private JTextField txtNom;
    private JTextField txtNum;
    private JTextField txtApe;
    private JTextField txtUsu;
    private JTextField txtCon;

    public GestionEmpleados()
    {
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new BorderLayout());

        b        pnlGestion.setLayout( new GridLayout( 19, 1 ) );
        pnlGestion.setBorder();

        pnlGestion.add(new JLabel());
        lblTitle=new JLabel("Gestión Empleados");
        pnlGestion.add(lblTitle);
        pnlGestion.add(new JLabel());
        lblNum=new JLabel("Numeral");
        pnlGestion.add(lblNum);
        txtNum=new JTextField("");
        txtNum.setEditable( true );
        pnlGestion.add(txtNum);
        lblNom=new JLabel("Nombre(s)");
        pnlGestion.add(lblNom);
        txtNom=new JTextField("");
        txtNom.setEditable( true );
        pnlGestion.add(txtNom);
        lblApe=new JLabel("Apellidos");
        pnlGestion.add(lblApe);
        txtApe=new JTextField("");
        txtApe.setEditable( true );
        pnlGestion.add(txtApe);
        lblUsu=new JLabel("Usuario");
        pnlGestion.add(lblUsu);
        txtUsu=new JTextField("");
        txtUsu.setEditable( true );
        pnlGestion.add(txtUsu);
        lblCon=new JLabel("Contraseña");
        pnlGestion.add(lblCon);
        txtCon=new JTextField("");
        txtCon.setEditable( true );
        pnlGestion.add(txtCon);
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

     public class ImagenFondo extends JPanel
    {
        public void paint (Graphics g)
	    {
		
		ImageIcon Fondo = new ImageIcon(getClass().getResource("/images/Gestiones.png"));
		g.drawImage(Fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
		
	    }
    }

    public static void main(String[] args)
    {
    	JFrame ventana = new JFrame("GESTIÓN EMPLEADOS");
    	MenuAdministradorGeneral inicio = new GestionEmpleados();
        ventana.setContentPane(inicio);
        ventana.setSize(600,600);
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    public void Borrar()
    {
        String Numeral= JOptionPane.showInputDialog( this, "Ingrese el Numeral", 
                "Buscar Vehículo", JOptionPane.QUESTION_MESSAGE );
        
        if(Numeral!=null)
        {
            try
            {
                Vehiculo buscada= Vehiculo.darVehiculo( Numeral );
                panelCentro.actualizar( buscada );
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog( this, "No se encontró lo que buscaba", "ERROR", JOptionPane.WARNING_MESSAGE );
            }
        } 
    }
    
    public void Buscar()
    {
        String Numeral= JOptionPane.showInputDialog( this, "Ingrese el Numeral", 
                "Buscar Vehículo", JOptionPane.QUESTION_MESSAGE );
        
        if(Numeral!=null)
        {
            try
            {
                Vehiculo buscada= Vehiculo.darVehiculo( Numeral );
                panelCentro.actualizar( buscada );
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog( this, "No se encontró lo que buscaba", "ERROR", JOptionPane.WARNING_MESSAGE );
            }
        }
    }

    public void Añadir()
    {
        String Numeral= JOptionPane.showInputDialog( this, "Ingrese el Numeral", 
                "Buscar Vehículo", JOptionPane.QUESTION_MESSAGE );
        
        if(Numeral!=null)
        {
            try
            {
                Vehiculo buscada= Vehiculo.darVehiculo( Numeral );
                panelCentro.actualizar( buscada );
            }
            catch( Exception e )
            {
                JOptionPane.showMessageDialog( this, "No se encontró lo que buscaba", "ERROR", JOptionPane.WARNING_MESSAGE );
            }
        }
    }

    public void Actualizar(Vehículo )
    {
        txtNum.setText( Vehiculo.darNombreObra( ) );
        txtNombreArtista.setText( obra.darNombreArtista( ) );
        txtTipoObra.setText( obra.darTipo( ) );
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnAnadir)
        {
            Añadir( );
        }
        else if ((e.getSource() == btnBuscar)
        {
            Buscar();
        }
        else if ((e.getSource() == btnActualizar)
        {
            Actualizar();
        }
        else if ((e.getSource() == btnBorrar)
        {
            Borrar();
        }
        else if ((e.getSource() == btnSalir)
        {
            VentanaPrincipal_1 VP = new VentanaPrincipal_1();
				VP.setVisible(true);
				dispose();
        }
	}
        
}