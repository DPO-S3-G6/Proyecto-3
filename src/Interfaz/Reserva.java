package Interfaz;

import javax.swing.JFrame;

public class Reserva extends JFrame
{
	public Reserva ()
	{
		
	}
	
	
	public static void main(String[] args)
    {
    	java.awt.EventQueue.invokeLater(new Runnable()
    	{
    		public void run() {
    			new Reserva().setVisible(true);
    		}
    	});
    	
    }

}
