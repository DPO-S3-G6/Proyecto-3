package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Perfil extends JFrame {
    private JTextField nombreField, usuarioField;
    private JPasswordField contraseñaField;

    public Perfil() {
		this.setContentPane(new ImagenFondo());
        setTitle("Login Interface");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		setLayout(new BorderLayout());
        JPanel panelDerecha = new JPanel();
		add(panelDerecha, BorderLayout.EAST);
        panelDerecha.setLayout(new GridLayout(4, 1));


		nombreField = new JTextField(10);
        usuarioField = new JTextField(10);
        contraseñaField = new JPasswordField(10);

        JButton registrarseButton = new JButton("Registrarse");
        JButton accederButton = new JButton("Acceder");

        panelDerecha.add(new JLabel("Nombre:"));
        panelDerecha.add(nombreField);

        panelDerecha.add(new JLabel("Usuario:"));
        panelDerecha.add(usuarioField);

        panelDerecha.add(new JLabel("Contraseña:"));
        panelDerecha.add(contraseñaField);

        panelDerecha.add(registrarseButton);
        panelDerecha.add(accederButton);

        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
            }
        });

        accederButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
    }

    private void register() {

		RegistroUsuario registroUsuario = new RegistroUsuario();
        registroUsuario.setVisible(true);

    }

    private void login() {
		JTextField usuario = usuarioField;
		String U1 = usuario.getText();
		JTextField contraseña = contraseñaField;
		String U2 = contraseña.getText();


		String filePath = "appInformation/userInformation.txt";
		boolean userFound = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String storedUsuario = parts[0].trim();
                String storedContraseña = parts[1].trim();

                if (U1.equals(storedUsuario) && U2.equals(storedContraseña)) {
                    userFound = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (userFound) {
            JOptionPane.showMessageDialog(this, "Welcome!");
            }
		else {	
			JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
			}
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Perfil().setVisible(true);
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
}
