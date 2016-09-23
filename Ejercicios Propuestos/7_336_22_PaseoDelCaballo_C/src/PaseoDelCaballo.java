import java.util.Random;
import java.util.Scanner;

import javax.swing.text.TabableView;

public class PaseoDelCaballo 
{
	Scanner lee = new Scanner(System.in);
	Random pAleatoria = new Random();
		
	int aciertos = 0;
	int[][] tablero = new int[8][8];
	int[] mov_horizontales = {2,1,-1,-2,-2,-1,1,2};
	int[] mov_verticales = {-1,-2,-2,-1,1,2,2,1};
//	int filActual = 7;	
//	int colActual = 0;
	
	int filActual = pAleatoria.nextInt(8);	
	int colActual = pAleatoria.nextInt(8);
	
	int fil_ini = filActual;
	int col_ini = colActual;
	
	int[][] accesibilidad = new int[8][8];
		
	public void IniciarPaseo() 
	{
		Accesibilidad();
		System.out.println("\n\n");		
		Desplazamiento();			
		MostrarTablero(tablero);
	}	
	
	public void Accesibilidad() 
	{			
		System.out.println("\nAccesibilidad de cada Posicion!\n");
		
		for (int f = 0; f < accesibilidad.length; f++)
		{		
			int filtmp = f;
			
			for (int c = 0; c < accesibilidad.length; c++) 
			{	
				int coltmp = c;
				
				for (int mov = 0; mov < mov_horizontales.length; mov++) 
				{						
					coltmp += mov_horizontales[mov];
					filtmp += mov_verticales[mov];
								
					if ( ( coltmp >= 0 && coltmp < accesibilidad.length ) && ( filtmp >= 0 && filtmp < accesibilidad.length ) ) 
					{
//						System.out.printf("\n SI: %d\n",mov);
//						Status(mov, f, c);
						accesibilidad[f][c]++;
//						MostrarTablero(accesibilidad);
//						lee.nextLine();											
					}					
					
					coltmp = c;
					filtmp = f;					
				}							
			}							
	
		}		
		
//		MostrarTablero(accesibilidad);
		System.out.println("\nFin de la Heuristica!\n");
	}
	
	public void Desplazamiento() 
	{
		int saltos = 0;
		boolean sigue = true;
		
		int filpos = filActual;
		int colpos = colActual;
		
		while ( sigue )
		{			
//			System.out.printf("\n%s\nfilActual: %d  -  colActual: %d\n","Iniciando:",filActual,colActual);

			int mov = 0;
			int menor = 99;
						
			while ( mov < 8 )
			{				
				int col_tmp = colActual;
				int fil_tmp = filActual;
				
//				System.out.printf("\nMov: %d",mov);
					
				col_tmp += mov_horizontales[mov];
				fil_tmp += mov_verticales[mov];
				
//				System.out.printf("\t- filtmp: %3d - coltmp: %3d",fil_tmp,col_tmp);
								
				if ( ( col_tmp >= 0 && col_tmp < tablero.length ) && ( fil_tmp >= 0 && fil_tmp < tablero.length ) )	// si no traspasa los limites 
				{
					if ( tablero[fil_tmp][col_tmp] == 0 ) 	// si esta disponible
					{
						if ( accesibilidad[fil_tmp][col_tmp] < menor ) 
						{							
							menor = accesibilidad[fil_tmp][col_tmp];
//							System.out.print(" --(valido) ("+accesibilidad[fil_tmp][col_tmp]+")");
							filpos = fil_tmp;
							colpos = col_tmp;
						}												
					}										
				}			
				
				mov++;
				
			}	// fin while (mov < 8)				
			
			
			if ( menor > 8 ) 	// no hay posiciones disponibles
			{
				sigue = false;					
			} 
			else 
			{
//				System.out.printf("\n\nMenor Mov: %d\n",menor);
//				System.out.printf("Nro de access: %d\n",accesibilidad[filpos][colpos]);
//				lee.nextLine();
				tablero[filActual][colActual] = 8;	// marco la posicion
				accesibilidad[filpos][colpos]--;
//				System.out.println();
				
//				MostrarTablero(accesibilidad);
//				System.out.println();
				// me posiciono en la de menor accesibilidad 
				filActual = filpos;								
				colActual = colpos;	
				saltos++;				
//				MostrarTablero(tablero);
				
			}	// fin if ( menor < 2 || menor > 8 )				

		}	// fin del while ( sigue )
	}
	
	public void Status( int m, int ft, int ct) 
	{		
		System.out.printf("\nEstatus:\n%15s %3d\n%15s (F:%d,C:%d)\n%15s %d\n",
				"Mov:",m,"Posicion:",ft,ct,"Conteo:",accesibilidad[ft][ct]);		
	}
	
	public void MostrarTablero( int[][] arreglo ) 
	{		
//		System.out.println("\n\nTablero Final: Paseo Del Caballo\n");
		
		System.out.printf("\nFila Inicial: %d  -  Col Inicial: %d\n\n",fil_ini,col_ini);
		
		for (int i = 0; i < arreglo.length; i++) 
		{			
			for (int j = 0; j < arreglo.length; j++) 
			{
				if ( arreglo[i][j] == 0 ) 
				{
					System.out.print("[ ]");
				}
				else 
				{
					System.out.print("["+arreglo[i][j]+"]");
				}												
			}	
			System.out.println();
		}		
	}	

}
