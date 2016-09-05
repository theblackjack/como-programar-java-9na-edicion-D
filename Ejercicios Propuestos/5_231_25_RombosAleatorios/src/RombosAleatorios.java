import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class RombosAleatorios 
{
	int top = 0;
	
	public void RegistrarNumero() 
	{
		Scanner lee = new Scanner(System.in);
		boolean sigue = true;
		
		do 
		{
			System.out.print("\nIngrese un Numero Impar del 1 al 19 :  ");
			top = lee.nextInt();
			
			if ( top % 2 == 0 ) 
			{
				System.out.println("\nInvalido! - Intente de Nuevo\n");
			} 
			else
			{
				sigue = false;
				System.out.println();
			}			
		} 
		while (sigue);
			
	}
		
	public void mostrarRombos() 
	{
		int e = 0;
		int a = 1;				
		int centro = ( top / 2 )+1;
		
		for (int i = 0; i < top; i++) 
		{
			if ( i < centro) 
			{
				for (int j = i; j < centro ; j++) 
				{
					System.out.print(" ");
				}				
				for (int j = 0; j < a; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
				a+=2;
			} 
			else
			{
				for (int j = centro; j <= i+1 ; j++) 
				{
					System.out.print(" ");
				}
				for (int j = a; j > 4 ; j--) 
				{
					System.out.print("*");
				}
				System.out.println();	
				a-=2;
			}			
		}			
	}

}
