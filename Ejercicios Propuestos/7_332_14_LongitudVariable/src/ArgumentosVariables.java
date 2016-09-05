
public class ArgumentosVariables 
{

	public int producto(  int... num ) 
	{
		int p = 1;
		
		for (int i : num) 
		{
			p *= i;
		}	
		
		return p;
	}
}
