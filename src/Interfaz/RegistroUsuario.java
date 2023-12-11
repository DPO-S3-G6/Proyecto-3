package Interfaz;

import javax.swing.JFrame;

public class RegistroUsuario extends JFrame 
{
	
	public RegistroUsuario()
	{
		
	}

	
	
	public static void main(String[] args)
    {
    	java.awt.EventQueue.invokeLater(new Runnable()
    	{
    		public void run() {
    			new RegistroUsuario().setVisible(true);
    		}
    	});
    	
    }
    
   
	
	
	
}
