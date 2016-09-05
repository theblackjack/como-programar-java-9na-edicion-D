import java.util.Scanner;

public class SepararDigitos 
{
	Scanner dato = new Scanner(System.in);
	
	public void Menu() 
	{		
		boolean sigue = true;
		int rsp;
		do 
		{
			System.out.printf("\n%s\n%s\n%s\n%s\n%s\n\n%s",
					"Menu de Opciones:",
					"1) - Parte Entera del Cociente",
					"2) - Parte Entera del Residuo",
					"3) - Separar Digitos",
					"4) - Salir",
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
					enteroCociente();
					break;
				case 2:
					enteroResiduo();
					break;
				case 3:
					separarD();
					break;
				default:
					sigue = false;
					break;
				} // fin swicth				
			} // fin if
		}		
		while (sigue);		
		
	}
	
	public void enteroCociente() 
	{
		int a = 0;
		int b = 0;
		boolean sig = true;
		
		System.out.print("\nIngrese \"a\": ");
		a = dato.nextInt();
		
		do 
		{
			System.out.print("Ingrese \"b\": ");
			b = dato.nextInt();
			
			if ( b != 0 ) 
			{
				double r = (double) a / b;
				int e = (int)r;
				
				System.out.printf("\n%10s%15s%20s\n%8d/%d%15.2f%20d\n",
						"Operacion:","Cociente:","Parte Entera:",
						a,b,r,e);
				sig = false;
			} 
			else
			{
				System.out.printf("\n\t%s\n\n","Opcion Invalida! Intente de Nuevo!");
			}
			
		} while (sig);				
		
	}
	
	public void enteroResiduo() 
	{
		int a = 0;
		int b = 0;
		boolean sig = true;
		
		System.out.print("\nIngrese \"a\": ");
		a = dato.nextInt();
		
		do 
		{
			System.out.print("Ingrese \"b\": ");
			b = dato.nextInt();
			
			if ( b != 0 ) 
			{
				double r = (double) a % b;
				int e = (int)r;
				
				System.out.printf("\n%10s%15s%20s\n%8d%%%d%15.2f%20d\n",
						"Operacion:","Residuo:","Parte Entera:",
						a,b,r,e);
				sig = false;
			} 
			else
			{
				System.out.printf("\n\t%s\n\n","Opcion Invalida! Intente de Nuevo!");
			}
			
		} while (sig);		
	}
	
	public void separarD() 
	{
		int num = 0;
		int div = 10000;
		boolean sig = true;
		
		do 
		{
			System.out.print("\nIngrese un Numero entre 1 y 99999: ");
			num = dato.nextInt();
			
			if ( num < 1 || num > 99999 ) 
			{
				System.out.printf("\n\t%s\n\n","Opcion Invalida! Intente de Nuevo!");
			} 
			else 
			{
				sig = false;
			}
			
		} while (sig);
		
		sig = true;
		int tmp = 0;
		int cont = 5;
		
		do 
		{
			tmp = num / div;
			if ( tmp > 0 ) 
			{
				System.out.printf("\n%20s","Resultado:");
				for (int i = 0; i < cont; i++) 
				{
					System.out.printf(" %d ",tmp);
					
					if ( div >= 10 ) 
					{
						div =  div/10;
					}						
					tmp = ( num / div ) % 10;
				}
				sig = false;									
			}
			else 
			{
				cont--;
				if ( div >= 10 ) 
				{
					div =  div/10;
				}
			} // fin if 
			
		} while (sig);		
		System.out.println("\n");
				
	} // fin separarD	

}
