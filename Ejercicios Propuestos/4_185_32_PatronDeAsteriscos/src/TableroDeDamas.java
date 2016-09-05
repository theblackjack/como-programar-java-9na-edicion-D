
public class TableroDeDamas {

	
	public void mostrarTablero() 
	{
		int cont = 1;
		int cont2;
		
		while ( cont <= 4 ) 
		{

			cont2 = 8;
			while ( cont2 >= 0 ) 
			{
				System.out.print("* ");
				System.out.print(" ");
				cont2--;
			}
			System.out.println();
			cont2 = 8;
			while ( cont2 >= 0 ) 
			{
				System.out.print(" ");
				System.out.print("* ");
				cont2--;
			}
			System.out.println();
			cont++;
			
		}
		
		
		
	}
	
	
	
}
