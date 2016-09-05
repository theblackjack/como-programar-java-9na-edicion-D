
public class ForEach 
{
	double num ;
	String[] temp;
	
	public ForEach(  String[] arr ) 
	{					
		temp = arr;		
	}
	
	
	public void procesar() 
	{		
		for ( int i = 0; i < temp.length; i++ ) 
		{
			num += Double.parseDouble(temp[i]);			
		}
		
		System.out.printf("\n%s %,.2f\n","Los numeros suman:",num);
		
	}

}
