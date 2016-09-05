import java.util.Random;

/**
 * @author JARVIS
 * @fecha 8 de ago. de 2016
 * @Projecto 7_333_20_VentasTotales
 * @hora 14:36:52
 * 
 */

public class Ventas 
{	
	int[][][] notasMesVend = new int[31][][];	// notas que genero un vendedor por mes
	int[][] ventasTotales = new int[6][5];	// f: productos - c: vendedores
	
	public void GenerarDatos() 	//	"GENERACION DE DATOS POR PROCEDIMIENTOS"
	{							// genera las notas de un vendedor al mes
		
		Random nAleatorio = new Random();

		for (int dia = 1; dia < notasMesVend.length; dia++) 
		{				
			int nro_notas = nAleatorio.nextInt(6);			// Nro. de notas (0-5) que puede entregar un vendedor al dia
								
			if ( nro_notas != 0 ) 
			{
//				System.out.printf("\n\n\tDia: %d \tNotas: %d",dia,nro_notas);
				
				// si notas es mayor a cero inicializo los arreglos
				int[] prod = new int[nro_notas+1];							// guarda el producto generado en cada nota para que no se repitan al dia
				notasMesVend[dia] = new int[nro_notas+1][2];				
				
//				System.out.printf(" \tColumnas: %d",notasMesVend[dia].length);
				
				for (int c = 1; c <= nro_notas; c++)						// una vuelta por cada nota 
				{				
					int p = 1 + nAleatorio.nextInt(5);				
					if ( Repetido(prod, p) )
					{
						c--;					
					} 
					else
					{						
						prod[c] = p;
						notasMesVend[dia][c][0] = p;
						notasMesVend[dia][c][1] = 10 + nAleatorio.nextInt(300);
//						System.out.printf("\nCol: %d ",c);
//						System.out.printf("  Tipo: %d ",notasMesVend[dia][c][0]);						
//						System.out.printf("  Precio: %d ",notasMesVend[dia][c][1]);					
					}												
				}				
			}
			else 
			{
				// si notas es igual a cero inicializo el arreglo en un valor alto que sirva de bandera
				notasMesVend[dia] = new int[8][1];
			}
		}	
	}	
	
	public boolean Repetido( int[] a, int n ) 
	{
		boolean rep = false;
		
		for (int i = 1; i < a.length; i++) 
		{
			if ( a[i] == n ) 
			{
				rep = true;
			}
		}
						
		return rep;		
	}
	
	public String TipoProducto( int t ) 
	{
		String tip = "";
		
		switch (t) {
		case 1:
			tip = "Harina";
			break;
		case 2:
			tip = "Azucar";
			break;
		case 3:
			tip = "Cafe";
			break;
		case 4:
			tip = "Leche";
			break;
		default:
			tip = "Aceite";
			break;
		}		
		
		return tip;
	}
	
	public void Procesar() 
	{			
			
			for (int ve = 1; ve <= 4; ve++) 	// en cada vuelta cambia de columna
			{
				GenerarDatos();		// carga el arreglo notasMesVend con las notas generadas por un vendedor al mes
			
				for (int dia = 1; dia < notasMesVend.length; dia++) 
				{	
					if ( notasMesVend[dia].length != 8 ) 	
					{
//						System.out.printf("\nDia: %d    Notas: %d\n",dia,notasMesVend[dia].length);					
						for (int nota = 1; nota < notasMesVend[dia].length; nota++) 
						{					
							int tip_pro = notasMesVend[dia][nota][0];
							int pre = notasMesVend[dia][nota][1];
							ventasTotales[tip_pro][ve] +=  pre;
						}
					}									
				}				
			}
			
			MostrarResultados();
			
			
	}	// fin procesar
	
	public void MostrarResultados() // refactorizar este codigo (instrucciones repetitivas)
	{		
		int tot_ve;
		int[] tot_pr = new int[5];	// deberia ser de cinco posiciones 
		
		System.out.printf("\nRegistro de Ventas de cada vendedor al mes: \n");
		
		System.out.printf("\n%25s%14s%14s%14s%16s\n","Karmen:","Karoline:","Ninja:","Angel:","TOTAL:");
		
		for (int p = 1; p < ventasTotales.length; p++) 
		{
			tot_ve = 0;
			System.out.printf("\n%15s:",TipoProducto(p));
			
			System.out.printf("%9d",ventasTotales[p][1]);
			tot_ve += ventasTotales[p][1];			
			tot_pr[1] += ventasTotales[p][1];
			
			for (int v = 2; v < ventasTotales[p].length; v++) 
			{		
				System.out.printf("%14d",ventasTotales[p][v]);
				tot_ve += ventasTotales[p][v];			
				tot_pr[v] += ventasTotales[p][v];
			}
			
			System.out.printf("%14d %s\n",tot_ve,"Bs.");			
		}
		
		System.out.printf("\n%16s","TOTAL:");
		System.out.printf("%9d %s",tot_pr[1],"Bs.");
		
		for (int i = 2; i < tot_pr.length; i++) 
		{
			System.out.printf("%10d %s",tot_pr[i],"Bs.");			
		}
						
	}


}
