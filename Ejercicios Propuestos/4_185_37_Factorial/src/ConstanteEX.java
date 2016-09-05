import java.util.Scanner;

public class ConstanteEX {

	int num;
	int factorial;
	double e;
	
	public ConstanteEX() 
	{
		// TODO Auto-generated constructor stub
	}
	
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
		int p = 2;
		e = 1 + num;
				
		while ( p <= 12 ) 
		{
			calcularFactorial(p);
			double n = Math.pow(num, p);
			double d = factorial;
			temp = (n / d);
			System.out.printf("\nTemp = %.2f + %d^(%d) / (%d)! = %.2f + %.2f / %.2f = %.2f \n",e,num,p,p,e,n,d,e+temp);
			e += temp;
			p++;			
		}
					
		System.out.printf("\n\nPrueba: e^%d es: %f\n\n",num,Math.exp(num));
		
	}
	
	public void mostrarResultado() 
	{
		System.out.printf("\nEl Valor de e^%d es: %f\n",num,e);
	}
	
	
	
}
