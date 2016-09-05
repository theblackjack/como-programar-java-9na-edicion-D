import java.util.Random;

public class Exponente 
{
	public void procesarCalculos() 
	{
		Random nAleatorio = new Random();
		int resultado = 0;
		int exp = 0;
		int bs = 0;
				
		System.out.println("\nPrueba de Exponenciacion sin la clase Math: ");
		System.out.printf("\n%15s%15s%15s\n","Base:","Exponente:","Resultado:");
		
		for (int i = 0; i < 12; i++) 
		{
			exp = 1 + nAleatorio.nextInt(10);
			bs = nAleatorio.nextInt(10);
			resultado = enteroExponencia(exp, bs);
			mostrarResultado(exp, bs, resultado);
		}
		
	}	
	
	public int enteroExponencia( int exp, int b ) 
	{
		int valor = 1;
			
		for (int i = 1; i <= exp; i++) 
		{
			valor *= b;
		}		
		return valor;		
	}
		
	public void mostrarResultado( int e, int b, int valor ) 
	{
		System.out.printf("\n%15d%15d%15d\n",b,e,valor);
		
	}

}
