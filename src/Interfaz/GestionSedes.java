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
    private JLabel lblHi;
    private JLabel lblHc;
    private JLabel lblNom;

    private JTextField txtNom;
    private JTextField txtNum;
    private JTextField txtUbi;
    private JTextField txtHi;
    private JTextField txtHc;

    public GestionSedes()
    {
    	setSize( 750, 600 );
    	setTitle( "GESTION SEDES" );
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        setLayout(new BorderLayout());

        pnlGestion.add(new JLabel());
        pnlGestion.setLayout( new GridLayout( 19, 1 ) );
        pnlGestion.setBorder();

        
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
        lblHi=new JLabel("Hora Inicio");
        pnlGestion.add(lblHi);
        txtHi=new JTextField("");
        txtHi.setEditable( true );
        pnlGestion.add(txtHi);
        lblHc=new JLabel("Hora Cierre");
        pnlGestion.add(lblHc);
        txtHc=new JTextField("");
        txtHc.setEditable( true );
        pnlGestion.add(txtHc);
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
        pnlGestion.setLayout( new GridLayout( 3, 1 ) );
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
    	JFrame ventana = new JFrame("GESTIÓN SEDES");
    	MenuAdministradorGeneral inicio = new GestionSedes();
        ventana.setContentPane(inicio);
        ventana.setSize(600,600);
        ventana.setLocationRelativeTo( null );
        ventana.setVisible( true );
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    public void Buscar()
    {
        String Numeral= JOptionPane.showInputDialog( this, "Ingrese el Numeral", 
                "Buscar Sede", JOptionPane.QUESTION_MESSAGE );
        
        if(Numeral!=null)
        {
            try
            {
                Sedes buscada= GestionSedes.darSedeporNumeral( Numeral );
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


