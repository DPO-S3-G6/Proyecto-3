package Interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.EventListener;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent
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
