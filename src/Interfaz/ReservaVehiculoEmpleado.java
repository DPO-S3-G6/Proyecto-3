package Interfaz;

import javax.swing.JFrame;

public class ReservaVehiculoEmpleado extends JFrame
{
	
	
	public ReservaVehiculoEmpleado ()
	{
		
	}
	
	
	public static void main(String[] args)
    {
    	java.awt.EventQueue.invokeLater(new Runnable()
    	{
    		public void run() {
    			new ReservaVehiculoEmpleado().setVisible(true);
    		}
    	});
    	
    }


}
