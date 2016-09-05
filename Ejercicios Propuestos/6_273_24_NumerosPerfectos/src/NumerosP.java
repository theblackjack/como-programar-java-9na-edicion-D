
public class NumerosP 
{
	
	public void numeroPerfectos() 
	{
		int suma = 0;
		int top = 100000;
		
		System.out.printf("\n%s %d :\n","Numeros Perfectos del 1 al",top);		
		System.out.printf("\n%10s%17s","Numero:","Factores:");
		for (int i = 2; i <= top; i++) 
		{
			for (int j = 1; j < i; j++)
			{				
				if ( j < i && i % j == 0 ) 
				{	
					suma += j;										
				}												
			}
			
			if ( suma == i ) 
			{
				esPerfecto(i,top);
			}			
			suma = 0;
		}
		System.out.println("\nFinal. No hay mas Numeros Perfectos!");
		
			
	}
	
	public void esPerfecto( int np, int top ) 
	{
		System.out.printf("\n%7d",np);
		for (int j = 1; j < top; j++)
		{				
			if ( j < np && np % j == 0 ) 
			{	
				if ( j == 1  ) 
				{
					System.out.printf("%10d",j);
				}
				else 
				{
					System.out.printf(" %d",j);
				}										
			} // fin if												
		} // fin for
		System.out.println();		
	}
	
	
	
	

}
