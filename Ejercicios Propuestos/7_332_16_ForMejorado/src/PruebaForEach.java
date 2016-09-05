
public class PruebaForEach 
{
	
	public static void main(String[] args) 
	{
		
		ForEach miFM ;
				
		if ( args.length == 0 ) 
		{
			System.out.println("\nError\n");
		} 
		else 
		{
			miFM = new ForEach( args );
			miFM.procesar();
		}
		
		
		
		
		
	}

}
