import java.util.Scanner;

public class Cuadrados 
{
		
	public void cuadradoCaracteres( int n, char c ) 
	{
		for (int i = 0; i < n; i++) 
		{
			System.out.printf("\t");
			for (int j = 0; j < n; j++) 
			{
				System.out.printf("%s",c);
			}
			System.out.println();			
		}
		
	}
	
	
	public void procesarCuadrado() 
	{
		Scanner lee = new Scanner(System.in);
		int a = 0;
		char c ;
		
		System.out.print("\nIngrese un Numero: ");
		a = lee.nextInt();
		System.out.print("Ingrese un Caracter: ");
		c = lee.next().charAt(0);
		
		System.out.println();
		cuadradoCaracteres(a, c);
		
	}

}
