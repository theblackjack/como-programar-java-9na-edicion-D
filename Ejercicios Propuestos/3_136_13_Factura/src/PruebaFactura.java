import java.util.Scanner;

import javax.swing.JOptionPane;

public class PruebaFactura {

	public static void main(String[] args) 
	{
		
		Scanner lee = new Scanner(System.in);
		
		String msg = "Tipo de Producto: (1) Llave Inglesa  -  (2) Alicate de Presion: ";
		
		int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
//		miFactura.setTipoProd(tipo);
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Nro. De Unidades:"));
//		miFactura.setCantidad(cant);
		
		Factura miFactura = new Factura(tipo,cant);
		miFactura.DatosFactura();
		
		
	}
	
}
