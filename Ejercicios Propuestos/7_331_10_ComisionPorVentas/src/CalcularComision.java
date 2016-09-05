
public class CalcularComision 
{
	// 200 x Semana + 9% de Comision de la ventas totales
	
	int[] montos;
		
	
	public CalcularComision( int[] valores ) 
	{
		montos = valores;	
	}
	
	public int[] conteoFrecuencia() 
	{
		int[] frecuencia = new int[11];		
		
		for (int i : montos) 
		{
			if ( i < 1000 ) 
			{
				++frecuencia[ i/100 ];
			} 
			else
			{
				++frecuencia[ 10 ];
			}			
		}
		
		return frecuencia;		
	}
	
	
	public void mostrarResultados( int[] f ) 
	{
		// imprimir formato y barras
		System.out.println("\nDistribucion de las Comisiones: \n");
		
		for (int i = 2; i < f.length; i++) 
		{			
			if ( i == 10 ) 
			{
				System.out.printf("%c%d o mas:",'$',1000);
			}
			else 
			{
				System.out.printf("%c%3d-%3d: ",'$',i * 100, i * 100 + 99);
			}
			
			for (int j = 0; j < f[i]; j++) 
			{
				System.out.print("*");
			}		
			System.out.println();			
		}		
	}	
	
	public void procesarConteo() 
	{
		int[] frecuencia = new int[montos.length];
		frecuencia = conteoFrecuencia();
		mostrarResultados(frecuencia);
	}	

}
