import java.util.ArrayList;
import java.util.Random;

public class Eliminacion 
{
	
	public void procesar() 
	{
		Random nAleatorios = new Random();
		ArrayList< Integer > numeros = new ArrayList< Integer >();
     	boolean esta = true;

     	System.out.printf("\n\t\t%s\n","===== SIN NUMEROS DUPLICADOS =====");
     	
		for (int i = 0; i < 5; i++) 
		{			
			int n = 10 + nAleatorios.nextInt(100);
			System.out.printf("\n%20s %d: %d","Numero",i+1,n);
			esta = numeros.contains(n);
			if ( !esta ) 
			{
				numeros.add(n);
				mostrarArreglo(numeros);
			} 
			else 
			{
				System.out.printf("\n%30s\n","!!!Repetido!!!");
			}	
						
		}	
		
		System.out.printf("\n%s","Elementos finales:");
		mostrarArreglo(numeros);
		System.out.printf("%23s %d\n","Tamaño:",numeros.size());		
		
	}
	
	public void mostrarArreglo( ArrayList<Integer> a ) 
	{
		System.out.printf("\n%23s","Valores:");
		
		for (Integer v : a) 
		{
			System.out.printf(" %d",v);			
		}
		System.out.println();
	}

}
