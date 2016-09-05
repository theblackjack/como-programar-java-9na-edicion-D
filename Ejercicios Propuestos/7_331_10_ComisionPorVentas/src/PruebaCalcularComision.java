import java.util.Random;

public class PruebaCalcularComision 
{
	public static void main(String[] args) 
	{
		
		System.out.printf("\n\t\t===== CALCULO DE COMISIONES =====\n");		
		
		Random nAleatorio = new Random();
		int[] salarios = new int[20] ;
		
		
		for (int i = 0; i < salarios.length; i++) 
		{
			int s = 200 + nAleatorio.nextInt(1200);
			salarios[i] += s;			
		}
		
//		for (int i : salarios) 
//		{
//			System.out.printf(" %d ",i);
//		}
//		System.out.println();
		
		CalcularComision miC = new CalcularComision( salarios );
		miC.procesarConteo();
		
	}

}
