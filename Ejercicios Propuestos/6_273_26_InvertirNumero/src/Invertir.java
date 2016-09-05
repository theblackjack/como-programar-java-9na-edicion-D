import java.util.Scanner;

public class Invertir 
{
	public void procesarNum() 
	{
		int num_O = 0; // original
		int cant = 1;
		int num_I = 0; // invertido
		
		do 
		{
			num_O = registrarNumero();
			cant = cantidadCifras(num_O);
			
		} while ( cant == 1 );
				
		num_I = invertirNumero(num_O,cant);
		mostrarNumero(num_O, num_I);		
		
	}
	
	public int registrarNumero() 
	{
		int n = 0;
		Scanner dato = new Scanner(System.in);
		
		System.out.print("\nIngrese un Numero de 2 cifras o mas: ");
		n = dato.nextInt();
		
		return n;		
	}
	
	public int cantidadCifras( int n ) 
	{
		int cont = 1;
		int div = 10;
		boolean sigue = true;
		
		do 
		{
			if ( n / div == 0 && cont == 1  ) 
			{
				System.out.println("\nError! El numero debe ser Igual o Mayor a 2 Digitos!");
				sigue = false;				
			}
			else 
			{				
				cont++;
				div *= 10;
				if ( n / div == 0 ) 
				{
					sigue = false;
				}
			}
			
		} while (sigue);
				
//		System.out.printf("\n%s %d\n","Numero de Cifras:",cont);
		
		return cont;
	}
	
	public int invertirNumero( int n, int c ) 
	{
		int valor = 0;
		int div = 10;
		String temp = "";
		
		temp += n % div;
				
		for (int i = 1; i < c; i++) 
		{			
//			System.out.printf("\t%d\n",div);
			temp += (n / div) % 10;		
			div *= 10;
		}
		
		valor = Integer.parseInt(temp);
		return valor;		
	}
	
	public void mostrarNumero( int o, int i ) 
	{
		System.out.printf("\n%20s\t%20s\n%20d\t%20d\n","Original:","Invertido:",o,i);
		
	}
	
	

}
