import java.util.Random;
import java.util.Scanner;

public class CrapsMod 
{
	Scanner dato = new Scanner(System.in);
 	private static final Random nAleatorio = new Random();
 	private enum Estado { CONTINUA, GANA, PIERDE };
 		
 	private static final int DOS_UNO = 2;
 	private static final int TRES = 3;
 	private static final int SIETE = 7;
 	private static final int ONCE = 11;
 	private static final int DOCE = 12;
	
 	double saldoInicial = 1000;
 	
 	public double Apostar( double actual) 
 	{ 		
 		double cantidad = 0;
 		
 		System.out.printf("\nDinero disponible para Apostar: %,.1f\n", actual);
		
 		System.out.print("\n\tCuanto Desea Apostar: ");
		cantidad = dato.nextDouble();
		
		if ( cantidad > saldoInicial ) 
		{
			System.out.println("\nLo siento! Excedes el saldo en tu cuenta!");
		}
		
		return cantidad;		
	}
 	
 	public static int tirarDados() 
	{
		int suma = 0;
		int d1 = 1 + nAleatorio.nextInt(6);
		int d2 = 1 + nAleatorio.nextInt(6);
		suma = d1 + d2;
		System.out.printf("\nEl Jugador Tiro: %d + %d = %d\n",d1,d2,suma);
		return suma;		
	}

 	public void ganancia( double ini, double acu ) 
 	{
 		double cash = 0;
 		double saldoFinal = ini;
 		
 		System.out.printf("\n%35s %,.1f\n","Saldo Inicial:",ini);
 		
 		if ( ini > acu ) 
 		{
 			cash = ini - acu;
 			saldoFinal -= cash;
 			System.out.printf("%35s %,.1f\n","Perdiste:",cash);
		}
 		else if ( acu > ini ) 
 		{
 			cash = acu - ini;
 			saldoFinal += cash;
 			System.out.printf("%35s %,.1f\n","Ganaste:",cash);			
		}
 		else 
 		{
 			System.out.printf("%35s\n","Te vas igual");
		}
 		 		
 		System.out.printf("%35s %,.2f\n","Saldo Final:",saldoFinal); 		
 				
	}
 	
	public void Juguemos() 
	{		
		boolean sigue = true;
		int Punto = 0;
		double saldoActual = saldoInicial;
		Estado estadoJuego;
		
		do 
		{		
			double apostado = Apostar(saldoActual);
			int suma = tirarDados();
			
			switch (suma) {
			case SIETE:
			case ONCE:
				estadoJuego = Estado.GANA;
				break;
			case DOCE:
			case TRES:
			case DOS_UNO:
				estadoJuego = Estado.PIERDE;
			default:
				estadoJuego = Estado.CONTINUA;
				Punto = suma;
				System.out.printf("\nEl punto es: %d\n",Punto);
				break;
				
			} // fin switch
			
			while ( estadoJuego == Estado.CONTINUA ) 
			{
				suma = tirarDados();
				
				if ( suma == Punto ) 
				{
					estadoJuego = Estado.GANA;
				} 
				else 
				{
					if ( suma == SIETE ) 
					{
						estadoJuego = Estado.PIERDE;
					}
				}
				
			} // fin while
			
			if ( estadoJuego == Estado.GANA ) 
			{
				System.out.println("\n\t\t\t\tGANASTE!\n");		
				saldoActual += apostado;				
			} 
			else
			{
				System.out.println("\n\t\t\t\tPERDISTE!\n");
				saldoActual -= apostado;
				
			} // fin if
				
			if ( saldoActual != 0 ) 
			{	
				System.out.print("\n\nDeseas seguir Jugando? (1)SI - (2)NO : ");
				int rsp = dato.nextInt();
				
				if ( rsp == 2 ) 
				{
					ganancia(saldoInicial, saldoActual);
					sigue = false;					
				}
			}
			else 
			{
				System.out.println("\nLo siento! Te has quedado sin dinero para Seguir Jugando!");
				sigue = false;
				
			} // fin if
						
		} while (sigue);				
		
	} // fin Juguemos
	
}
