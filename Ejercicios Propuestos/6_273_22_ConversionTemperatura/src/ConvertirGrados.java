import java.util.Scanner;

public class ConvertirGrados 
{
	Scanner dato = new Scanner(System.in);
	
	public void centigrados_F() 
	{
		double fah = 0;
		
		System.out.print("\nGrados Centigrados a Convertir: ");
		double g = dato.nextDouble();
		
		fah = 5.0 / 9.0 * ( g - 32 );
		
		System.out.printf("\n%20s%20s\n%20.2f%20.2f\n",
				"Centigrados","Fahrenheit:",g,fah);
	}
	
	public void fahrenheit_C() 
	{
		double cent = 0;
		
		System.out.print("\nGrados Fahrenheit a Convertir: ");
		double g = dato.nextDouble();
		
		cent = 9.0 / 5.0 * g + 32;
		
		System.out.printf("\n%20s%20s\n%20.2f%20.2f\n",
				"Fahrenheit:","Centigrados",g,cent);
	}
	
	public void Menu() 
	{		
		boolean sigue = true;
		int rsp;
		do 
		{
			System.out.printf("\n%s\n%s\n%s\n%s\n\n%s",
					"Menu de Opciones:",
					"1) - Centigrados a Fahrenheit",
					"2) - Fahrenheit a Centigrados",
					"3) - Salir",
					"Seleccione una Opcion: ");
			rsp = dato.nextInt();
			
			if ( rsp < 1 || rsp > 4 ) 
			{
				System.out.printf("\n\t%s\n","Opcion Invalida! Intente de Nuevo!");
			}
			else 
			{
				switch (rsp) {
				case 1:
					centigrados_F();
					break;
				case 2:
					fahrenheit_C();
					break;
				default:
					sigue = false;
					break;
				} // fin swicth				
			} // fin if
		}		
		while (sigue);		
		
	}
	
	

}
