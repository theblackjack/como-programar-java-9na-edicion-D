
public class Factorial 
{
	public void calcularFactorial() 
	{
		
		for (int i = 1; i <= 20; i++) 
		{
			int fact = 1;
			System.out.printf("\nFactorial de %d es : ",i);
			
			for (int j = 1; j <= i; j++) 
			{
				 fact *= j;				
			}
			
			System.out.print(fact);		
			
		}		
	}	

}
