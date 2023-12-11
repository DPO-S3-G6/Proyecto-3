package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.EventListener;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent
public class GestionVehiculos extends JFrame implements ActionListener{

    private JPanel pnlGestion;
    private JPanel pnlDatos;

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
    
    public GestionSedes()
    {
    	setSize( 750, 600 );
    	setTitle( "CARBOOK: Gestión Vehiculos" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );


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
    	
        //panel Gestión escirtura y criterios
        pnlGestion.setLayout( new GridLayout( 31, 1 ) );
        pnlGestion.setBorder();

        pnlGestion.add(new JLabel());
        lblTitle=new JLabel("Gestión Vehículos");
        pnlGestion.add(lblTitle);
        pnlGestion.add(new JLabel());
        lblNum=new JLabel("Número");
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
        pnlGestion.add(btnAnadir, BorderLayout.CENTER);
        btnBuscar= new JButton ("BUSCAR");
        pnlGestion.add(btnBuscar, BorderLayout.CENTER);
        btnActualizar = new JButton ("ACTUALIZAR");
        pnlGestion.add(btnActualizar, BorderLayout.CENTER);
        btnBorrar= new JButton ("BORRAR");
        pnlGestion.add(btnBorrar, BorderLayout.CENTER);
        pnlGestion.add(new JLabel());
        
        //panel datos mostrados
        pnlDatos= new JPanel( );
        add(pnlDatos,BorderLayout.CENTER);
    }
    
    public void actionPerformed( ActionEvent evento )
    {
        // TODO Auto-generated method stub
        if(evento.getActionCommand( ).equals( "An" ))
        {
        	JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando Añadir" );
        }
        else if (evento.getActionCommand( ).equals( "Bu" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó comando Buscar" );
        }
        else if (evento.getActionCommand( ).equals( "Ac" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción Actualizar" );
        }
        else if (evento.getActionCommand( ).equals( "Bo" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción Borrar" );
        }
        else if (evento.getActionCommand( ).equals( "SALIR" ))
        {
            JOptionPane.showMessageDialog(temporaryLostComponent, "se presionó opción SALIR" );
        }
        
    }
    
    public void dispose()
    {
        JOptionPane.showMessageDialog( this, "se guardó la aplicación" );
        System.exit( 0 );
    }
    public static void main(String[] args)
    {
        MenuCliente ventana = new MenuGestionEmpleadosCliente( );
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
    }
        
}