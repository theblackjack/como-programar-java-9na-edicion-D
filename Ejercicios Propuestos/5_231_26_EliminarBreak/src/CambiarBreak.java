
public class CambiarBreak 
{
	public static void main(String[] args) 
	{
		int cuenta = 1;
		
		boolean sigue = true;
		
		do 
		{
			if ( cuenta <= 10 ) 
			{			
				System.out.printf(" %d",cuenta);
				cuenta++;
			}
			if ( cuenta == 5 ) 
			{
				sigue = false;
			}
			
		} while (sigue);
		
		System.out.printf("\nCuenta cerro en : %d",cuenta);
		
	}
	
	

}
