import java.util.Random;

public class Tirar 
{
	
	int[] frecuencia = new int[13]; 
	
	public void Jugar() 
	{
		int top = 36000000;
		
		Random nAleatorio = new Random();
		int d1, d2 = 0;
		
		for (int i = 0; i < top; i++) 
		{
			d1 = 1 + nAleatorio.nextInt(6);
			d2 = 1 + nAleatorio.nextInt(6);
			
			++frecuencia[d1+d2];
		}
		
		mostrarFrecuencia(frecuencia, top);
		
	}
	
	public void mostrarFrecuencia( int[] f, int veces ) 
	{
		System.out.printf("\nResultado de lanzar 2 dados %d veces: \n",veces);
		System.out.printf("\n%7s%15s\n","Numero:","Ocurrencia:");
		
		for (int i = 2; i < f.length; i++) 
		{
			System.out.printf("%7d%15d\n",i,f[i]);
		}
		
	}
	

}
