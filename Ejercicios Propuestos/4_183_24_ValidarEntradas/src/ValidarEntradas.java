import java.util.Scanner;

public class ValidarEntradas {

	int aprobados;
	int reprobados;
		
	public void Evaluados() 
	{
		Scanner leer = new Scanner(System.in);;
		int cont = 0;
		
		System.out.println("\n\t\tDatos para el Analisis:");
		
		while ( cont < 10 ) 
		{
			System.out.printf("\n%s ","Ingrese Estado: (1)Aprobado o (2)Reprobado:");
			int v = leer.nextInt();
			if ( v == 1 || v == 2 ) 
			{
				if ( v == 1 ) 
				{
					aprobados++;
				}
				else 
				{
					reprobados++;
				}
				cont++;
			}
			else 
			{
				System.out.println("\nSeleccion NO VALIDA. Intente de Nuevo.");
			}
		}
		
		System.out.println("\n\t\tResultados del Analisis:");
		System.out.printf("\t%s %d\n\t%s %d\n","-Aprobados:",aprobados,"-Reprobados",reprobados);
		
		if ( aprobados >= 8 ) 
		{
			System.out.println("\n\t\t¡¡¡BONO PARA EL INSTRUCTOR!!!");
		}
		
	}
	
}
