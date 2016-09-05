import java.util.Scanner;

public class Palindromos {

	int num;
	
	public Palindromos() {
		// TODO Auto-generated constructor stub
	}
	
	public void RegistrarNumero() 
	{
		Scanner leer = new Scanner(System.in);
		boolean valor = false;
		System.out.println("\nIngrese un Numero de 5 Digitos");
		while (valor == false ) 
		{			
			System.out.print("Numero: ");
			num = leer.nextInt();
			if ( num / 100000 != 0 ) 
			{
				System.out.println("\nError! Numero Mayor a 5 Digitos. Intente de Nuevo.\n");
			}
			else if ( num / 10000 == 0 ) 
			{
				System.out.println("\nError! Numero Menor a 5 Digitos. Intente de Nuevo.\n");
			}			
			else 
			{
				valor = true;				
			}
		}		
	}
	
	public void ValidarPalindrome() 
	{
		int n1;
		int n2;
		
		n1 = (num / 10000) % 10;	// 1er digito
		n2 = num % 10;			// 5to digito
		System.out.printf("1er D: %d\t5to D: %d\n",n1,n2);
		
		if ( n1 == n2 ) 
		{
			n1 = (num / 1000) % 10;	// 2do digito
			n2 = (num / 10) % 10;	// 4to digito
			System.out.printf("2do D: %d\t4to D: %d\n",n1,n2);

			if ( n1 == n2 ) 
			{
				System.out.println("\n\t\t\"¡SI ES PALIMDROMO!\"");
			}
			else 
			{
				System.out.println("\n\t\t\"¡NO ES PALIMDROMO!\"");
			}
		}
		else 
		{
			System.out.println("\n\t\t\"¡NO ES PALIMDROMO!\"");
		}
		
		
		
		
	}
	
}
