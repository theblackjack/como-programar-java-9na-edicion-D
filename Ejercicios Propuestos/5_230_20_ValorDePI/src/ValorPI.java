
public class ValorPI 
{
	double pi = 0.0;
	double c = 4;
	
	public void CalcularPI() 
	{
		int cont = 0;
		double tmp = 0;
		for ( int i = 1 ; i <= 2000000 ; i+=2 ) 
		{
			++cont;
			if ( cont%2 == 0 && cont != 1 ) 
			{
				tmp -= c / (double) i;
			} 
			else 
			{
				tmp += c / (double) i;
			}
		
		}		

		pi = tmp;		
	}
	
	public void mostrarResultado() 
	{
		System.out.printf("\n%s : %f\n","Valor Aprox. de PI",pi);
	}
		
}
