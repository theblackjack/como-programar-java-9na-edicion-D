import java.util.Scanner;

public class MaxComDivisor 
{
	int a = 0;
	int b = 0;
	
	public void ProcesarMCD() 
	{
		int resulatdo = 0;
		registrarNum();
		resulatdo = calcularMCD(a, b);
		mostrarResultado(resulatdo);	
		
	}
	
	public void registrarNum() 
	{
		Scanner dato = new Scanner(System.in);
		boolean sigue = true;
		do 
		{
			System.out.println("\nValores de \"a\" y de \"b\": ");
			System.out.print("\nValores de a: ");
			a = dato.nextInt();
			System.out.print("Valores de b: ");
			b = dato.nextInt();
			
			if ( a == b ) 
			{
				System.out.println("\nError! Los Numeros deben ser Diferentes! Reintentar!\n");				
			}
			else 
			{
				sigue = false;
			}
			
		} while (sigue);
						
	}	
	
	public int calcularMCD( int a, int b ) 
	{
		int mcd = 0;
		
		if ( b == 0 ) 
		{
			mcd = a;
		} 
		else 
		{
			int r = 0;
			int may = Math.max(a, b);
			int men = Math.min(a, b);

			r = may % men;  // residuo
			
			mcd = calcularMCD(men, r);
		}				
		
		return mcd;		
	}
	
	public void mostrarResultado( int r ) 
	{
		System.out.printf("\n%45s %d\n","Maximo Comun Divisor:",r);
	}
	
	

}
