import java.util.Random;
import java.util.Scanner;

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
		if ( actualFrente == Frente.ESTE || actualFrente == Frente.OESTE ) 
		{
			if ( filActual > 0 ) 
			{
				if ( piso[filActual-1][colActual] != 0 ) 
				{
					filActual--;
				}
				else if ( piso[filActual+1][colActual] != 0 ) 
				{
					filActual++;
				}				
			}
		}
		else if ( actualFrente == Frente.SUR || actualFrente == Frente.NORTE )
		{
			if ( colActual > 0 ) 
			{
				if ( piso[filActual][colActual-1] != 0 ) 
				{
					colActual--;
				}						
				else if ( piso[filActual][colActual+1] != 0 ) 
				{
					colActual++;				
				}				
			}
		}
		
	}
	
	public boolean mover( int pasos ) 
	{	
		boolean hecho = false;
		//AjustePosicional();			
		
		int fila_temp = filActual;
		int col_temp = colActual;
				
		switch (actualFrente) {
		case ESTE:
			if ( colActual + pasos <= piso.length ) 
			{
				int topeE = colActual + pasos;
				for (int c = col_temp; c < topeE; c++) 
				{
					if (pluma) 
					{
						piso[filActual][c] = 1;
					} 
					colActual++;
				}
				hecho = true;
			}
			break;			
		case OESTE:
			if ( colActual - pasos >= 0 )
			{
				int topeO = colActual - pasos;
				for (int c = col_temp; c > topeO; c--) 
				{
					if (pluma) 
					{
						piso[filActual][c] = 1;
					} 
					colActual--;
				}
				hecho = true;
			}
			break;
		case SUR:
			if ( filActual + pasos <= piso.length )
			{
				int topeS = filActual + pasos;
				for (int f = fila_temp; f < topeS; f++) 
				{
					if (pluma) 
					{
						piso[f][colActual] = 1;
						filActual++;
					}
					filActual++;
				}
				hecho = true;
			}
			break;
		case NORTE:
			if ( filActual - pasos >= 0 )
			{
				int topeN = filActual - pasos;
				for (int f = fila_temp; f > topeN; f--) 
				{
					if (pluma) 
					{
						piso[f][colActual] = 1;
					} 
					filActual--;				
				}
				hecho = true;
			}
			break;
		}
		
		return hecho;
	}	
	
//	public boolean EspacioSuficiente( int pasos ) 
//	{
//		boolean espacio = false;
//		
//		switch (actualFrente) {
//		case ESTE:					
//			if ( colActual + pasos <= piso.length ) 
//			{
//				espacio = true;
//			}
//			break;
//		case OESTE:
//			if ( colActual - pasos >= 0 ) 
//			{
//				espacio = true;
//			}
//			break;
//		case SUR:
//			if ( filActual + pasos <= piso.length ) 
//			{
//				espacio = true;
//			}
//			break;
//		case NORTE:
//			if ( filActual - pasos >= 0 ) 
//			{
//				espacio = true;
//			}			
//			break;
//		}		
//		
//		return espacio;		
//	}
	
	// metodo auxiliar para seguimiento de valores
	public void Estatus( ) 
	{
		System.out.printf("\n\nPosicion: (F=%d,C=%d) \nDireccion: %s\nPluma: %s\n",
				filActual,colActual,actualFrente,pluma ? "Abajo":"Arriba");
				
	}
	
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
				} 
				else 
				{
					System.out.print(" ");
				}			
			}
			System.out.println();
			
		}
		
		System.out.println();
	}
		

}
