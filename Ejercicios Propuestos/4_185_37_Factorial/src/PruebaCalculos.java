import java.util.Scanner;

public class PruebaCalculos {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
				
		boolean sigue = true;
		while ( sigue ) 
		{
			System.out.println("\nQue desea hacer?\n");
			System.out.printf("%s\n%s\n%s\n%s\n\n%s ",
					"Opcion 1: Factorial de un Numero",
					"Opcion 2: Valor de la Constante e",
					"Opcion 3: Valor de la Constante e^x",
					"Opcion 4: Salir",
					"SELECCIONE UNA OPCION: ");
			int r = leer.nextInt();
			if ( r > 4 || r < 1 ) 
			{
				System.out.println("\nOpcion NO VALIDA. Intente de Nuevo!\n");
			}
			else 
			{
				if ( r == 1 ) 
				{
					Factorial miFactorial = new Factorial();
					System.out.println("\n\n\t\t\"¡FACTORIAL DE UN NUMERO!\"");
					miFactorial.RegistrarNumero();
					miFactorial.calcularFactorial();
					miFactorial.mostrarResultado();
				}
				if ( r == 2 ) 
				{
					ConstanteE miConst = new ConstanteE();
					System.out.println("\n\n\t\t\"¡VALOR DE e!\"");
					miConst.RegistrarValor();
					miConst.CalcularConstante();
					miConst.mostrarResultado();
					
				}
				if ( r == 3 ) 
				{
					ConstanteEX miConsrEX = new ConstanteEX();
					System.out.println("\n\n\t\t\"¡VALOR DE e^x!\"");
					miConsrEX.RegistrarValor();
					miConsrEX.CalcularConstante();
					miConsrEX.mostrarResultado();
				}
				if ( r == 4 ) 
				{
					sigue = false;
				}
			}
		}
		
		
		
		
		
		
		
	}
	
	
}
