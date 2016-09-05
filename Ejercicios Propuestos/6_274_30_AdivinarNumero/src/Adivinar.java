import java.util.Random;
import java.util.Scanner;

public class Adivinar 
{
	Scanner dato = new Scanner(System.in);
	
	public void Comenzar() 
	{
		boolean sigue = true;
		Scanner dato = new Scanner(System.in);
		int rsp = 0;
		
		System.out.print("\nBienvenido, Jugamos?  (1)SI - (2)NO : ");
		
		do 
		{
			rsp = dato.nextInt();
			
			switch (rsp) {
			case 1:
				Jugar();
				System.out.print("\nJugamos de Nuevo?  (1)SI - (2)NO : ");
				break;
			case 2:
				sigue = false;
				break;
			default:
				System.out.println("\nError! Opcion invalida!");
				break;
			}			
			
		} while ( sigue );
		
		System.out.printf("\n\n%s\n","Fin del Juego! Bye!");
				
	}
	
	public void Jugar() 
	{
		System.out.println("\n\t\t¡¡¡...Que comienze el Juego...!!! ");
		
		boolean sigue = true;
		int cont_int = 0;
		int valor = 0;
		Random vAleatorio = new Random();
		int n = 1 + vAleatorio.nextInt(1000);
		
		System.out.printf("\n%45s %d\n","Numero:",n);
		
		System.out.println("\nYa pense en un Numero, Adivina cual es: ");
		
		do 
		{
			cont_int++;
			System.out.print("\nEscribe un Numero : ");
			valor = dato.nextInt();
			if ( valor > n ) 
			{
				System.out.println("\n\tDemasiado Alto! Intenta de Nuevo!");
				if ( valor < n+10 ) 
				{
					System.out.printf("\n%35s\n","Pista: Estas Cerca...!");
				}
			} 
			else if ( valor < n )
			{
				System.out.println("\n\tDemasiado Bajo! Intenta de Nuevo!");
				if ( valor > n-10 ) 
				{
					System.out.printf("\n%35s\n","Pista: Estas Cerca...!");
				}
			}
			else 
			{
				System.out.printf("\n\t\t%s\n","Felicidades! Acertastes!");
				sigue = false;
			}
			
		} while ( sigue );
		
		desempeno(cont_int);
				
	}
	
	public void desempeno( int ni ) 
	{
		if ( ni < 10 ) 
		{
			System.out.printf("\n\t\t%s\n","O ya sabia el secreto! O Tuvo Suerte!");
		}
		else if ( ni > 10 ) 
		{
			System.out.printf("\n\t\t%s\n","Bueno, Pudo haberlo hecho Mejor!");
		}
		else 
		{
			System.out.printf("\n\t\t%s\n","Aja! Usted sabia el secreto!");
		}
	}
	
	

}
