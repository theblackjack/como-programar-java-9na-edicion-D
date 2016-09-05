import java.util.Scanner;

public class PruebaComisionesPorVentas {

	public static void main(String[] args) 
	{
		System.out.println(" \n\t\t\"CALCULADORA DE COMISIONES\" ");
		
		ComisionesPorVentas miComision = new ComisionesPorVentas();
		Scanner leer = new Scanner(System.in);
		
		int r = 1;
		
		while ( r == 1 ) 
		{
			System.out.print("\nIngrese (1) Para Procesar - (2) Para Salir: ");
			r = leer.nextInt();
			if ( r == 1 ) 
			{
				miComision.RegistrarDatos();
				miComision.mostrarResultados();
			}			
			
		}
				
		
	}
	
}
