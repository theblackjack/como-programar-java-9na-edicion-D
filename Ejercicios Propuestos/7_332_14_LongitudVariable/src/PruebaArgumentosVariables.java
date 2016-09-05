import java.util.Random;

public class PruebaArgumentosVariables 
{
	
	public static void main(String[] args) 
	{
		Random nAleatorio = new Random();
		ArgumentosVariables miA = new ArgumentosVariables();
		
		int n1 = 1 + nAleatorio.nextInt(15);
		int n2 = 1 + nAleatorio.nextInt(9);
		int n3 = 1 + nAleatorio.nextInt(5);
		int n4 = 1 + nAleatorio.nextInt(15);
		
		System.out.printf("\nProducto de %d * %d = %d\n",n1,n2,miA.producto(n1,n2));
		
		n1 = 1 + nAleatorio.nextInt(15);
		n2 = 1 + nAleatorio.nextInt(4);
		n3 = 1 + nAleatorio.nextInt(3);
		System.out.printf("\nProducto de %d * %d * %d * %d = %d\n",n1,n2,n3,n4,miA.producto(n1,n2,n3,n4));
		
		
	}
	

}
