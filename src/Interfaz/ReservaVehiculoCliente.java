package Interfaz;

import javax.swing.JFrame;

public class ReservaVehiculoCliente extends JFrame
{
	
	public ReservaVehiculoCliente ()
	{
		
	}
	
	
	
	public static void main(String[] args)
    {
    	java.awt.EventQueue.invokeLater(new Runnable()
    	{
    		public void run() {
    			new ReservaVehiculoCliente().setVisible(true);
    		}
    	});
    	
    }


}
