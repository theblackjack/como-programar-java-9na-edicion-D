
public class ProductoEnterosImpar 
{
	public void calularProd_Impares() 
	{
		int prod = 1;
		for (int i = 3; i <= 15; i+=2) 
		{
			int v = prod;
			prod *= i;
			System.out.printf("\nProducto de %d * %d = %d\n",v,i,prod);
		}
		
		
		
		
	}
	

}
