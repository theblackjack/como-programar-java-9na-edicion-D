import java.util.Scanner;

public class ConstanteE {

	int num;
	int factorial;
	double e;
	
	
	
	public void RegistrarValor() 
	{
		boolean sigue = true;
		Scanner leer = new Scanner(System.in);
		while (sigue) 
		{
			System.out.print("\nIngrese un Numero: ");
			num = leer.nextInt();
			if ( num < 0 ) 
			{
				System.out.println("\nEl numero debe SER POSITIVO. Intente de Nuevo!\n");
			}
			else 
			{
				sigue = false;
			}
		}
	}
	
	public void calcularFactorial( int valor ) 
	{
//		System.out.printf("\n%s %d\n","Valor in fact: ",valor);
		int temp = valor;
		factorial = temp;

		if ( valor == 0 || valor == 1 ) 
		{
//			System.out.printf("\n%s %d\n","El Factorial: ",num);
			factorial = 1;
		}
		else 			
		{			
			while ( temp != 1 ) 
			{
				//System.out.printf("\n%s %d %s %d\n","Vuelta:",temp,"Fact:",factorial);
				factorial *= --temp;				
			}
		}				
//		System.out.printf("\n%s %d\n","fact: ",factorial);
		
	}
	
	public void CalcularConstante() 
	{
		
		double temp = 0.0;
		int valor = num;
				
		while ( valor != 0 ) 
		{
			calcularFactorial(valor);
			temp += 1 / (double)factorial;
			System.out.printf("\n%s %f\n","temp: ",temp);
			valor--;						
		}
		
		e = 1 + temp;		
	}
	
	public void mostrarResultado() 
	{
		System.out.printf("\nEl Valor de e es: %f\n",e);
	}
	
	
	
}
