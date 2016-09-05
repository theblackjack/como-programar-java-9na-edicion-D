import java.util.Random;
import java.util.Scanner;

public class Lanzamiento 
{
	Scanner dato = new Scanner(System.in);
		
	public void Menu() 
	{
		
		int opc = 0;
		boolean sigue = true;
		
		do 
		{
			System.out.printf("\n%s\n%s\n%s\n\n%s ",
					"===== MENU ======",
					"1) - Lanzar Moneda",
					"2) - Salir",
					"Seleccione una opcion:");
			opc = dato.nextInt();
			
			switch (opc) {
			case 1:
				lanzarMoneda();				
				break;
			case 2:
				sigue = false;
			default:
				System.out.println("\nError1 Opcion Invalida!");
				break;
			}
			
		} while (sigue);
		
		
	}
	
	public void lanzarMoneda() 
	{
		int nVeces = 1;
		int cara = 0;
		int cruz = 0;
		
		System.out.print("\nCuantas Veces: ");
		nVeces = dato.nextInt();
		
		Random vAleatorio = new Random();
						
		for (int i = 0; i < nVeces; i++) 
		{
			int n = vAleatorio.nextInt(2);
			if ( n== 1 ) 
			{
				cara++;
			} 
			else
			{
				cruz++;
			}			
		}
		
		mostrarResultado(cara,cruz);
	}
	
	public void mostrarResultado( int ca, int cr ) 
	{
		System.out.printf("\n%45s\n%35s %d\t%s %d\n",
				"Resultado: ",
				"CARA:",ca,
				"CRUZ:",cr);
	}

}
