import java.util.Random;

public class Conjunto 
{
	
	public void mostrarNumero() 
	{
		Random aleatorio = new Random();
		
		int n = 2 + 2 * aleatorio.nextInt(5);
		System.out.printf("\n%10s %d","Par:",n);

		n = 3 + 2 * aleatorio.nextInt(5);
		System.out.printf("%10s %d","Impar:",n);			
		
		n = 6 + 4 * aleatorio.nextInt(5);
		System.out.printf("%10s %d","Par:",n);
		
	}
	

}
