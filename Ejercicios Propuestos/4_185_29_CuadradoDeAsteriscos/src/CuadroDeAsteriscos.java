import java.time.Year;
import java.util.Scanner;

public class CuadroDeAsteriscos {

	int tama;
	
	public CuadroDeAsteriscos() {
		// TODO Auto-generated constructor stub
	}
	
	public void RecibirTamano() 
	{
		Scanner leer = new Scanner(System.in);
		boolean valor = false;
		System.out.println("\nTamaño de un lado del Cuadrado!");
		
		while (valor != true ) 
		{
			System.out.print("Ingrese valor  entre 1 y 20: ");
			tama = leer.nextInt();
			if ( tama >= 1 && tama <= 20 ) 
			{
				valor = true;
			}
			else 
			{
				System.out.println("\nValor NO VALIDO. Intente de Nuevo!\n");
			}
		}		
		
	}
	
	public void DibujarCuadrado() 
	{
		int y = tama;
		
		while ( y >= 1 ) 
		{
			int x = tama;
			if ( y == 1 || y == tama) 
			{
				while ( x >= 1 ) 
				{
					System.out.print("*");
					x--;
				}
			}
			else 
			{
				System.out.printf("%s","*");
				int s = tama - 1;
				while ( s > 1 ) 
				{
					System.out.print(" ");
					s--;
				}
				System.out.printf("%s","*");
			}
			System.out.println();
			y--;
		}
		
	}
	
	
}
