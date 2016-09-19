import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class PaseoDeTortuga 
{
	Random nAleatorio = new Random();
	
	int[][] piso = new int[20][20];		// bloc de dibujo
	int filActual = 0;
	int colActual = 0;
	int n_cmd = 1;
	boolean pluma = false;						// f: arriba  t: abajo
	enum Frente { NORTE, SUR, ESTE, OESTE};		// Direccion que apunta
	
	Frente actualFrente = Frente.ESTE;
	Frente anteriorFrente = actualFrente;
	Scanner lee = new Scanner(System.in);
	
	
	public void Dibujar() 
	{		

		boolean sigue = true;
		
		Estatus();
		
		while ( sigue ) 
		{
			System.out.println("\nComandos para Dibujar con la Tortuga: ");
			System.out.printf("%12d%10d%12d%12d%10d%10d%10d\n %13s%12s%12s%12s%10s%10s%10s\n",
					1,2,3,4,5,6,9,
					"P. Arriba","P. Abajo","Giro Dcha","Giro Izq","Avanzar","Mostrar","Terminar");
			System.out.print("\nIngrese un Comando: ");
			n_cmd = lee.nextInt();
			
			switch (n_cmd) {
			case 1:
				pluma = false;		// pluma arriba = no dibuja
				break;
			case 2:
				pluma = true;		// pluma abajo = dibuja
				break;
			case 3:			
			case 4:
				Gira(n_cmd);
				break;
			case 5:
				Avanza();
				break;
			case 6:
				MostrarDibujo();
				break;
			case 9:
				sigue = false;
				break;				
			default:
				System.out.println("\nComando Invalido! Intente Nuevamente\n");
				break;
			}	
			
			Estatus();
		}	
				
	}
		
	
	public void Avanza( ) 						
	{
		int p = 0;
		boolean sigue = true;
		
		do 
		{
			System.out.print("\nCuantas casillas: ");
			p = lee.nextInt();
			
			if ( mover(p) ) 	// automaticamente se produce el desplazamiento
			{
				sigue = false;
			} 
			else 
			{
				System.out.println("\nExcede las casillas disponibles! Ingrese un valor menor!");
				System.out.printf("(F=%d , C=%d)\n",filActual,colActual);
			}						
			
		} while (sigue);
				
	}
	
	public void Gira( int d )					
	{
		if ( d == 3 )					// si gira a la derecha 
		{
			switch (actualFrente) {
			case ESTE:
				actualFrente = Frente.SUR;				
				break;
			case OESTE:
				actualFrente = Frente.NORTE;
				break;
			case SUR:
				actualFrente = Frente.OESTE;
				break;
			case NORTE:
				actualFrente = Frente.ESTE;
				break;		
			}			
		} 
		else
		{
			switch (actualFrente) {
			case ESTE:
				actualFrente = Frente.NORTE;				
				break;
			case OESTE:
				actualFrente = Frente.SUR;
				break;
			case SUR:
				actualFrente = Frente.ESTE;
				break;
			case NORTE:
				actualFrente = Frente.OESTE;
				break;		
			}
		}

	}
	
	public void AjustePosicional() 
	{
		System.out.println("Entre en ajuste posicional\n");
		
		if ( actualFrente == Frente.ESTE ) 
		{
			colActual++;			
		} 
		else if ( actualFrente == Frente.OESTE )
		{
			colActual--;
		}
		else if ( actualFrente == Frente.NORTE )
		{
			filActual--;
		}		
		else 
		{
			filActual++;
		}
	}
	
	public boolean mover( int pasos ) 
	{	
		boolean hecho = false;
		
		pasos--;
		
		if ( actualFrente == anteriorFrente )  
		{
			if ( filActual != 0 || colActual != 0 )
			{
				AjustePosicional();
			}			
		}
		
		switch (actualFrente) {
		case ESTE:
			if ( colActual + pasos <= piso.length )		// piso.length = 20 
			{				
				int topeE = colActual + pasos;
				for ( int c = colActual; c <= topeE; c++) 
				{					
					if (pluma) 
					{
						piso[filActual][c] = 1;
					}	System.out.print(" "+c);				
				}
				hecho = true;
				colActual = topeE;
			}
			break;			
		case OESTE:			
			if ( colActual - pasos >= 0 )
			{	
				int topeO = colActual - pasos;
				for ( int c = colActual; c >= topeO; c--) 
				{
					if (pluma) 
					{
						piso[filActual][c] = 1;
					}	System.out.print(" "+c);
				}
				hecho = true;
				colActual = topeO;
			}
			break;
		case SUR:
			if ( filActual + pasos <= piso.length )
			{				
				int topeS = filActual + pasos;
				for ( int f = filActual; f <= topeS; f++) 
				{
					if (pluma) 
					{
						piso[f][colActual] = 1;						
					}	System.out.print(" "+f);				
				}
				hecho = true;
				filActual = topeS;				
			}
			break;
		case NORTE:			
			if ( filActual - pasos >= 0 )
			{				
				int topeN = filActual - pasos;
				for ( int f = filActual; f >= topeN; f--) 
				{
					if (pluma) 
					{
						piso[f][colActual] = 1;
					}	System.out.print(" "+f);								
				}
				hecho = true;
				filActual = topeN;
			}
			break;
		}
		
		anteriorFrente = actualFrente;
		return hecho;
	}	
		
	// metodo auxiliar para seguimiento de valores
	public void Estatus( ) 
	{
		System.out.printf("\n\nPosicion: (F=%d,C=%d) \nDireccion: %s\nPluma: %s\n",
				filActual,colActual,actualFrente,pluma ? "Abajo":"Arriba");		
	}
	// metodo auxiliar para seguimiento de valores
	
	public void MostrarDibujo() 
	{
		System.out.println();
		
		for (int f = 0; f < piso.length; f++) 
		{
			for (int c = 0; c < piso.length; c++) 
			{
				if ( piso[f][c] == 1 ) 
				{
					System.out.print("*");
//					System.out.print(piso[f][c]);
				} 
				else if ( piso[f][c] == 0 )
				{
					System.out.print("#");
				}			
			}
			System.out.println();
			
		}
		
		System.out.println();
	}
		

}
