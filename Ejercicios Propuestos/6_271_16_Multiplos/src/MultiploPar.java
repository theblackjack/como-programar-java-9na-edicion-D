import java.util.Random;

public class MultiploPar 
{	
	public boolean esMultiplo( int a, int b ) 
	{
		boolean loEs = false;
		if ( b % a == 0 ) 
		{
			loEs = true;
		}
		return loEs;		
	}
	
	public void mostrarResultado( int a, int b, boolean rest ) 
	{
		System.out.printf("\n%10d%10d",a,b);
		if (rest) 
		{
			System.out.printf("%25s\n","Si es Multiplo");
		} 
		else 
		{
			System.out.printf("%25s\n","No es Multiplo");

		}
	}
	
	public void ProcesarNumeros()
	{
		boolean resultado = false;
		Random nAleatorio = new Random();
		
		System.out.println("\nDeterminar si \"b\" es multiplo de \"a\": ");
		System.out.printf("\n%10s%10s%25s\n","Nro. a:","Nro. b:","Resultado:");
		
		for (int i = 0; i < 15; i++) 
		{
			int a = 1 + nAleatorio.nextInt(20);
			int b = 1 + nAleatorio.nextInt(200);			
			resultado = esMultiplo(a, b);
			mostrarResultado(a, b, resultado);			
		}
				
	}
		
}
