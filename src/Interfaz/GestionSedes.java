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

public class GestionSedes extends JFrame implements ActionListener{

    private JPanel plNavegacion;
    private JPanel plGestion;
    
    private JButton btnAnadir;
	private JButton btnBuscar;
    private JButton btnActualizar;
    private JButton btnBorrar;
    private JButton btnSalir;
    
    private JLabel lblTitle;
    private JLabel lblNum;
    private JLabel lblUbi;
    private JLabel lblHor;
    private JLabel lblPla;
    private JLabel lblNom;

    private JTextField txtNom;
    private JTextField txtNum;
    private JTextField txtUbi;
    private JTextField txtHor;
    private JTextField txtPla;

    public GestionSedes()
    {
    	setSize( 750, 600 );
    	setTitle( "GESTION SEDES" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        setLayout(new BorderLayout());

        pnlGestion.setLayout( new GridLayout( 19, 1 ) );
        pnlGestion.setBorder();

        pnlGestion.add(new JLabel());
        lblTitle=new JLabel("Gestión Sedes");
        pnlGestion.add(lblTitle);
        pnlGestion.add(new JLabel());
        lblNum=new JLabel("Numeral");
        pnlGestion.add(lblNum);
        txtNum=new JTextField("");
        txtNum.setEditable( true );
        pnlGestion.add(txtNum);
        lblNom=new JLabel("Nombre");
        pnlGestion.add(lblNom);
        txtNom=new JTextField("");
        txtNom.setEditable( true );
        pnlGestion.add(txtNom);
        lblUbi=new JLabel("Ubicación");
        pnlGestion.add(lblUbi);
        txtUbi=new JTextField("");
        txtUbi.setEditable( true );
        pnlGestion.add(txtUbi);
        lblHor=new JLabel("Hora Inicio");
        pnlGestion.add(lblHor);
        txtHor=new JTextField("");
        txtHor.setEditable( true );
        pnlGestion.add(txtHor);
        lblPla=new JLabel("Placa");
        pnlGestion.add(lblPla);
        txtPla=new JTextField("");
        txtPla.setEditable( true );
        pnlGestion.add(txtPla);
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
    
    public void paint (Graphics g)
	{
		
		ImageIcon Fondo = new ImageIcon(getClass().getResource("/images/Gestiones.png"));
		g.drawImage(Fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
		super.paint(g);
		
	}
    
    public static void main(String[] args)
    {
    	JFrame ventana = new JFrame("GESTIÓN SEDES");
    	MenuAdministradorGeneral inicio = new GestionSedes();
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


