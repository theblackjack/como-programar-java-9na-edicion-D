import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

public class Ventas 
{
	double tot_ventas = 0;
	
	public void ProcesarVentas() 
	{
		Scanner lee = new Scanner(System.in);
		int rsp = 1;
		System.out.printf("\n%s\n","Menu de Productos a sus Disposicion:");
		
		do 
		{
			int pro = 0;
			boolean sigue = true;
			
			while ( sigue ) 
			{			
				System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
						" -(1) LECHE   -  2.98 Bs.",
						" -(2) AZUCAR  -  4.50 Bs.",
						" -(3) JABON   -  9.98 Bs.",
						" -(4) SHAMPOO -  4.49 Bs.",
						" -(5) CREMA   -  6.87 Bs.");
				
				System.out.print("\nSeleccione un Producto: ");
				pro = lee.nextInt();
				
				if ( pro < 1 || pro > 5 ) 
				{
					System.out.println("\nOpcion Invalida! Intente de Nuevo!\n");
				} 
				else 
				{
					sigue = false;
				}
			}
			
			System.out.print("Cantidad a llevar: ");
			int cant = lee.nextInt();
			
			System.out.printf("\n%s%.2f Bs.\n","El Total a Facturar es : ",CalcularPrecio(pro, cant));
			
			System.out.print("\nDesea efectuar otra Compra ? (1)SI - (2)NO : ");
			rsp = lee.nextInt();			
		} 
		while ( rsp != 2 );
		
		TotalVendido();
		
	}
	
	
	public double CalcularPrecio( int tp, int cant ) 
	{
		double precio = 0;
		
		switch ( tp ) {
		case 1:
			precio = 2.98 * cant;
			break;
		case 2:
			precio = 4.50 * cant;
			break;
		case 3:
			precio = 9.98 * cant;
			break;
		case 4:
			precio = 4.49 * cant;
			break;
		case 5:
			precio = 6.87 * cant;
			break;	

		default:
			System.out.println("No Valido");
			break;
		}
		
		tot_ventas += precio;
		return precio;
		
	}
	
	public void TotalVendido() 
	{
		
		System.out.printf("\n%s%.2f Bs.\n","El Total en Ventas es : ",tot_ventas);
		
		
	}
	
	

}
