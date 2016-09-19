import java.util.Random;
import java.util.Scanner;

public class PaseoDelCaballo 
{
	Scanner lee = new Scanner(System.in);
	Random pAleatoria = new Random();
		
	int filActual = pAleatoria.nextInt(8);
	int colActual = pAleatoria.nextInt(8);
	int aciertos = 0;
	int[][] tablero = new int[8][8];
	int[] mov_horizontales = {2,1,-1,-2,-2,-1,1,2};
	int[] mov_verticales = {-1,-2,-2,-1,1,2,2,1};
		
	public void IniciarPaseo() 
	{
		Reconocimiento();		
		System.out.println("\nFin del Juego! Caballo Encerrado!\n");
		MostrarTablero();				
	}	
		
	public void Reconocimiento() 
	{
		int mov = 0;		
		int saltos = 0;
		
		while ( mov < 8 )
		{		
			int coltmp = colActual;
			int filtmp = filActual;			
					
			coltmp += mov_horizontales[mov];
			filtmp += mov_verticales[mov];

			Status(mov, filtmp, coltmp, saltos, aciertos);
						
			if ( ( coltmp >= 0 && coltmp <= 7 ) && ( filtmp >= 0 && filtmp <= 7 ) ) 
			{
				if ( tablero[filtmp][coltmp] != 8 ) 
				{
					System.out.printf("\n SI: %d\n",mov);
					Mover(mov);
					MostrarTablero();
//					lee.nextLine();
					mov = 0;		
					aciertos++;
				}		
				else 
				{
					System.out.printf("\n NO: %d\n",mov);
					mov++;					
				}
			}	
			else 
			{
				System.out.printf("\n NO: %d\n",mov);
				mov++;
			}
			saltos++;
			
//			lee.nextLine();			
		}
						
	}
		
	public void Mover( int m ) 
	{
//		System.out.printf("\n%s\n","Dentro de Mover");
		
		colActual += mov_horizontales[m];
		filActual += mov_verticales[m];
		tablero[filActual][colActual] = 8;
//		
//		switch (m) {
//		case 0:			 
//			c +=2;
//			f -=1;					
//			break;
//		case 1:
//			c += 1;
//			f -= 2;			
//			break;
//		case 2:
//			c -= 1;
//			f -= 2;	
//			break;
//		case 3:
//			f -= 1;
//			c -= 2;
//			break;
//		case 4:
//			f += 1;
//			c -= 2;
//			break;
//		case 5:
//			f += 2;
//			c -= 1;
//			break;
//		case 6:
//			f += 2;
//			c += 1;
//			break;
//		default:
//			f += 1;
//			c += 2;
//			break;
//		}
//		
	
}
	
	public void Status( int m, int ft, int ct, int s, int a) 
	{		
		System.out.printf("\nEstatus:\n%15s %3d\n%10s Col: %3d | Fil: %3d\n%10s Col: %3d | Fil: %3d\n%15s %3d\n%15s %3d\n",
				"Mov:",m,"Antes->",colActual,filActual,"Despues->",ct,ft,"Saltos:",s,"Aciertos:",a);		
	}
	
	public void MostrarTablero() 
	{		
//		System.out.println("\n\nTablero Final: Paseo Del Caballo\n");
		
		for (int i = 0; i < tablero.length; i++) 
		{			
			for (int j = 0; j < tablero.length; j++) 
			{
				if ( tablero[i][j] == 0 ) 
				{
					System.out.print("[ ]");
				}
				else 
				{
					System.out.print("["+tablero[i][j]+"]");
				}												
			}	
			System.out.println();
		}		
	}	

}
