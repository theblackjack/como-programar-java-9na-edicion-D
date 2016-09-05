
public class Rombos 
{
	
	public void mostrarRombos() 
	{
		int e = 0;
		int a = 1;
		int top = 9;
		int centro = ( top / 2 ) + 1;
		
		for (int filas = 0; filas < top; filas++) 
		{		
			if ( filas < centro ) 
			{
				for (int k = filas; k < centro; k++) 
				{
					System.out.print(" ");			
				}
				for (int j = 0; j < a; j++) 
				{
					System.out.print("*");
				}
				a += 2;			
//				System.out.println("\nCentro "+centro+"\n");
			} 
			else
			{				
				for (int k = centro-1; k <= e; k++) 
				{
					System.out.print(" ");			
				}				
				for (int j = centro-1; j < a; j++) 
				{
					System.out.print("*");
				}
				a -= 2;

			}					
			++e;
			System.out.println();
			
		}
		
		
	}
	

}
