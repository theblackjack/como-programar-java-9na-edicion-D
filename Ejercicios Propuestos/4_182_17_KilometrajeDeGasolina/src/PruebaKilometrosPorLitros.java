import java.util.Scanner;

public class PruebaKilometrosPorLitros {

	public static void main(String[] args) 
	{
		
		Scanner valor = new Scanner(System.in);
		
		KilometrosPorLitros miKilometraje = new KilometrosPorLitros();
		
		System.out.println("\n\t\t\"CALCULADORA DE KILOMETRAJE\"\n");
		
		int r = 1;
		while ( r == 1 ) 
		{
			System.out.print("\nPresione (1) Para Ingresar - (0) Para Salir: ");
			r = valor.nextInt();
			if ( r == 1 ) 
			{
				miKilometraje.RegistrarDatos();
			}
		}
		
		System.out.printf("\n\t%s %.2f %s\n","Promedio Total:",miKilometraje.getTotal(),"km/lts");
		
	}
	
}
