
public class AsteriscosTriangulos 
{
	
	
	public void mostrarTriangulos() 
	{
		int top = 10;
		
		for (int i = 1; i <= top; i++) 
		{
			
//			1er triangulo
			for (int j = 0; j < i; j++) 
			{
				System.out.printf("%s","*");				
			}
			
			if ( i > 7 ) 
			{
				System.out.print("\t");
			} 
			else
			{
				System.out.print("\t\t");
			}
//			1er Triangulo
			
//			2do Triangulo			
			for (int k = i; k <= top; k++) 
			{
				System.out.printf("%s","*");				
			}
			
			if ( i > 3 ) 
			{
				System.out.print("\t\t");
			} 
			else
			{
				System.out.print("\t");
			}
//			2do Triangulo
			
//			3er Triangulo
			for (int l = 0; l <= i; l++) 
			{
				System.out.print(" ");
			}
			
			for (int m = i; m <= top; m++) 
			{
				System.out.printf("%s","*");				
			}			
			System.out.printf("\t\t");
//			3er Triangulo
			
//			4to Triangulo
			for (int l = top; l >= i; l--) 
			{
				System.out.print(" ");
			}
			
			for (int n = 0; n < i; n++) 
			{
				System.out.printf("%s","*");
			}
//			4to Triangulo
			
			System.out.println();			
		}		
	}
}
