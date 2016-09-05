import java.util.Scanner;

public class Barras 
{
	String num = "";
	
	public void RegistrarNumeros() 
	{
		Scanner lee = new Scanner(System.in);
				
		System.out.println("Ingrese 5 Numeros Enteros: \n");
		
		for (int i = 1; i <= 5; i++) 
		{
			System.out.printf(" -Numero %d : ",i);
			num += lee.nextLine();			
		}
		System.out.println();
		
		ProcesarBarras();

	}
	
	public void ProcesarBarras() 
	{		
		int valores = Integer.parseInt(num);
		int div = 10000;
		int temp = 0;
		
		temp = valores / div;
		imprimirBarras(temp);
		
		for (int i = 0; i < 4; i++) 
		{				
			if ( div >= 10 ) 
			{
				div /= 10;
			}
			temp = ( valores / div ) % 10;
			imprimirBarras(temp);
		}		
	}
	
	public void imprimirBarras( int b ) 
	{		
		for (int i = 0; i < b; i++) 
		{
			System.out.print("*");
		}
		System.out.print("  ");
	}

}
