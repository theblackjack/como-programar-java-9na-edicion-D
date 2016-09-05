
public class NPrimos 
{
	
	public void nPrimos() 
	{
		int top = 10000;
		boolean primo = true;
		int b = 2;
		int cont = 0;
		
		System.out.printf("\n%6s\n","Primos:");		
		
		for (int i = 2; i <= top; i++) 
		{			
//			primo = esPrimoM1(i);
			primo = esPrimoM2(i);
			
			if (primo) 
			{				
				System.out.printf("%8d\n",i);
				cont++;
			}			
			
		} // fin for	
		
		System.out.printf("\n%s %d\n","Numeros probados:",cont);
	}
	
	public boolean esPrimoM1( int i ) 
	{
		boolean primo = true;
		int b = 2;
		
		while ( b < i && primo )
		{
			if ( i % b == 0 ) 
			{					
				primo = false;					
			}
			else 
			{
				b++;
			}		
			
		} // fin while	
		
		return primo;
		
	}
	
	public boolean esPrimoM2( int i ) 
	{
		boolean primo = true;
		int b = 2;
		int tope = (int) Math.floor(Math.sqrt(i) + 0.5);
		
		while ( b < tope && primo )
		{
			if ( i % b == 0 ) 
			{					
				primo = false;					
			}
			else 
			{
				b++;
			}		
			
		} // fin while	
		
		return primo;
		
	}
	
}
