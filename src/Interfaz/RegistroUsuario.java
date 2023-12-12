package Interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistroUsuario extends JFrame {
    private JTextField firstNameField, lastNameField, emailField, phoneField, birthdateField, nationalityField, paymentField, usernameField, passwordField;

    public RegistroUsuario() {
        setTitle("Regsitro de Usuario");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new ImagenFondo());

        firstNameField = new JTextField(2);
        lastNameField = new JTextField(2);
        emailField = new JTextField(2);
        phoneField = new JTextField(2);
        birthdateField = new JTextField(2);
        nationalityField = new JTextField(2);
        paymentField = new JTextField(2);
        usernameField = new JTextField(2);
        passwordField = new JTextField(2);

		JButton conductionPassField = new JButton("Subir archivo");
        JButton idField = new JButton("Subir archivo");

        JButton confirmButton = new JButton("Confirm");
        JButton cancelButton = new JButton("Cancel");
		confirmButton.setBackground(Color.GREEN);
        cancelButton.setBackground(Color.RED);

        setLayout(new GridLayout(7, 4));

        add(new JLabel("Nombre:"));
        add(firstNameField);

        add(new JLabel("Apellido:"));
        add(lastNameField);

        add(new JLabel("Email:"));
        add(emailField);

        add(new JLabel("Número:"));
        add(phoneField);

        add(new JLabel("Fecha de nacimiento:"));
        add(birthdateField);

        add(new JLabel("Nacionalidad:"));
        add(nationalityField);

        add(new JLabel("Tipo de Pago:"));
        add(paymentField);

        add(new JLabel("Username:"));
        add(usernameField);

        add(new JLabel("Password:"));
        add(passwordField);

        add(new JLabel("Licencia de conducción:"));
        add(conductionPassField);

        add(new JLabel("ID:"));
        add(idField);

        add(confirmButton);
        add(cancelButton);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveInformation();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        conductionPassField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uploadFile("Conduction Pass");
            }
        });

        idField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uploadFile("ID");
            }
        });
    }



    private void saveInformation() {
        String folderPath = "appInformation";
        String fileName = "userInformation.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(folderPath + "/" + fileName, true))) {
            writer.println("Nombre: " + firstNameField.getText());
            writer.println("Apellido: " + lastNameField.getText());
            writer.println("Email: " + emailField.getText());
            writer.println("Número: " + phoneField.getText());
            writer.println("Fecha de nacimiento: " + birthdateField.getText());
            writer.println("Nacionalidad: " + nationalityField.getText());
            writer.println("Tipo de Pago: " + paymentField.getText());
            writer.println("Username: " + usernameField.getText());
            writer.println("Password: " + passwordField.getText());
            writer.println("Licencia de conducción: " + conductionPassField.getText());
            writer.println("ID: " + idField.getText());
            writer.println("----------------------------------");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        JOptionPane.showMessageDialog(this, "Information saved successfully!");
    }

	private void uploadFile(String fileType) {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(this, fileType + " file selected: " + selectedFile.getAbsolutePath());
        } else {
            JOptionPane.showMessageDialog(this, "File selection canceled");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    public class ImagenFondo extends JPanel
    {
    	
    	public void paint (Graphics g)
    	{
    		
    		ImageIcon imagen = new ImageIcon(getClass().getResource("/images/background_2.png"));
    		g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
    		setOpaque(false);
    		super.paint(g);
    		
    	}
        	
    }
}
