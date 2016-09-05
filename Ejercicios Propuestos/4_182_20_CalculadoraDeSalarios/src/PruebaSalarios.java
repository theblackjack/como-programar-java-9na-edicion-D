import java.util.Scanner;

public class PruebaSalarios {

	public static void main(String[] args) 
	{
		
		Scanner leer = new Scanner(System.in);
		Salarios miSalario = new Salarios();
		
		System.out.println("\n\t\t\"DATOS DEL EMPLEADO\"");
		
		int r = 1;
		while ( r == 1 ) 
		{
			System.out.print("\n(1) Para Procesar - (2) Para Salir: ");
			r = leer.nextInt();	
			if ( r == 1 ) 
			{
				miSalario.RegistrarDatos();
				miSalario.mostrarResultados();
			}
		}
		
	}
	
}
