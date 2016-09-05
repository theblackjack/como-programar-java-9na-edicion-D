
public class TriplesPitagoras 
{
	
	public void calcularTriples() 
	{
		for (int i = 1; i <= 500; i++) 
		{
			int catA2 = (int) Math.pow(i, 2);
						
			for (int k = 1; k <= 500; k++) 
			{
				int catB2 = (int) Math.pow(k, 2);
				
				for (int j = 1; j <= 500; j++) 
				{
					int hipo2 = (int) Math.pow(j, 2);
					
					if ( catA2 + catB2 == hipo2 ) 
					{
						if (!( hipo2 >= 500 )) 
						{
							mostrarResultado(i, k, j);
						}
						
					}					
				}								
			}			
		}		
	}
	
	public void mostrarResultado( int ca, int cb, int hp ) 
	{
		System.out.printf("%10d%10s%10d%10s%10d\n",ca,"+",cb,"=",hp);		
	}
	
}


