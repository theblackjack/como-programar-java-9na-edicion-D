import java.util.Random;
import java.util.Scanner;

public class Craps 
{
	Scanner dato = new Scanner(System.in);
	private static final Random nAleatorio = new Random();
	private enum Estado { GANA, CONTINUA, PIERDE};
	
	private static final int DOS_UNO = 2;
	private static final int TRES = 3;
	private static final int SIETE = 7;
	private static final int ONCE = 11;
	private static final int DOCE = 12;
	
	int[] frecGANA = new int [22];	// vigesimo = 20
	int[] frecPIERDE = new int [22];	// vigesimo = 20
	
	public static int tirarDados() 
	{		
		int suma = 0;
		int d1 = 1 + nAleatorio.nextInt(6);
		int d2 = 1 + nAleatorio.nextInt(6);
		suma = d1 + d2;
		
//		System.out.printf("\nEl Jugador Tiro: %d + %d = %d\n",d1,d2,suma);
		return suma;				
	}
	
	
	public void Jugar() 
	{			
		int Punto = 0;
		int cont_tiros = 0;
		Estado estadoActual;
		int top = 10000;
		
		for (int i = 0; i < top; i++) 
		{			
			int suma = tirarDados();
			cont_tiros = 1;			// cada vuelta es un nuevo juego
			
			switch (suma) {
			case SIETE:
			case ONCE:
				estadoActual = Estado.GANA;
				++frecGANA[cont_tiros];	// siempre que gana en el primer tiro
				break;
			case DOCE:
			case TRES:
			case DOS_UNO:
				estadoActual = Estado.PIERDE;
				++frecPIERDE[cont_tiros];
				break;
			default:
				estadoActual = Estado.CONTINUA;
				Punto = suma;
//				System.out.printf("\nEl punto es: %d\n",Punto);
				break;
				
			} // fin switch			
			
			while ( estadoActual == Estado.CONTINUA ) 
			{
				suma = tirarDados();	// vuelve a tirar
				cont_tiros++;
				
				if ( suma == Punto ) 
				{
					estadoActual = Estado.GANA;
					if ( cont_tiros < 21 ) 
					{
						++frecGANA[cont_tiros];
					} 
					else
					{
						++frecGANA[21];
					}											
				} 
				else 
				{
					if ( suma == SIETE ) 
					{
						estadoActual = Estado.PIERDE;
						if ( cont_tiros < 21 ) 
						{
							++frecPIERDE[cont_tiros];
						} 
						else
						{
							++frecPIERDE[21];
						}
						
					} // fin if
					
				} // fin if 
				
			} // fin while			
			
		} // fin for
		
		mostrarResultados( top );
		
	} // fin Jugar()
	
	public double probGanar( int total ) 
	{
		double prob = 0.0;
		int ganadas = 0;
		
		for (int i : frecGANA) 
		{
			ganadas += i;
		}
//		System.out.printf("\n%d\n",ganadas);
		
		return prob = (double)ganadas / total ;		
	}
	
	public void mostrarResultados( int vueltas ) 
	{
		System.out.printf("\nResultados en %d Juegos de Craps:\n",vueltas);
		System.out.printf("\n%25s%30s\n\n%10s%15s%15s%15s\n",
				"Frecuencia de Victoria:","Frecuencia de Derrota:",
				"Tiro:","Ocurrencia:","Tiro:","Ocurrencia:");
		
		for (int i = 1; i < frecGANA.length; i++) 
		{
			System.out.printf("%10d%15d%15d%15d\n",i,frecGANA[i],i,frecPIERDE[i]);			
		}
				
		System.out.printf("\nProbabilidad de Ganar: %.2f%%\n",probGanar(vueltas)*100);
	}
	
}
