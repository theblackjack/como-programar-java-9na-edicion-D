import java.util.Random;
import java.util.Scanner;

public class CAI 
{
	Scanner lee = new Scanner(System.in);
	Random nAleatorio = new Random();
	int a = 0;
	int b = 0;
	
	public void Procesar() 
	{
		boolean salir = false;
		
		do
		{
			int cont_pre = 1;
			int resp_cor = 0;
			int cont_tot = 0;
			
			int dif = Dificultad();
			
			if ( dif != -1 ) 
			{
				int tip = Tipo_Operacion();
				
				if ( tip != -1 ) 
				{			
					int resultado = 0;
					int rsp = 0;
					boolean prox_alu = false;
					boolean prox_pre = false;
				
					do 
					{
						int tipo_opera = 0;
//						System.out.printf("\n\tdo while 2\n");
												
						if ( tip == 5 ) 
						{
//							System.out.printf("\ndo while 1\n");
							tipo_opera = 1 + nAleatorio.nextInt(4);							
						}	
						else 
						{
							tipo_opera = tip;
						}
						
						resultado = generarOperacion(tipo_opera, dif);
												
						do 
						{
							cont_tot++;
							System.out.printf("\n\tCP:%d  P:%d  Tip:%d  a:%d  b:%d  Resultado:%d \n",cont_tot,cont_pre,tipo_opera,a,b,resultado);
							rsp = generarPregunta(cont_pre, tipo_opera);
						
							if ( rsp != -1 ) 
							{							
																					
								if ( rsp == resultado ) 
								{									
									resp_cor++;
									cont_pre++;
									contestaciones(!prox_alu);
									prox_pre = true;
								} 
								else 
								{
									contestaciones(prox_alu);
								}
															
								if ( cont_tot == 10 ) 
								{
									Rendimiento(cont_tot, resp_cor);
									System.out.printf("\n\n%s\n\n","Turno de siguiente alumno!");
									prox_alu = true;
									prox_pre = true;
								}																					
							}
							else 
							{
								prox_pre = true;
								prox_alu = true;
								salir = true;
							}
						
						} while ( !prox_pre );
												
						prox_pre = false;
					} 
					while ( !prox_alu );
					
					prox_alu = false;										
				} 
				else 
				{
					salir = true;
				}				
			} 
			else
			{
				salir = true;
			}			
		} 
		while ( !salir );
							
	}
	
	public int generarOperacion( int t, int d) 
	{
		int resultado = 0;
	
		switch (t) {
		case 1:
			resultado = SUMA(d);
			break;
		case 2:
			resultado = RESTA(d);
			break;
		case 3:
			resultado = MULTIPLICACION(d);
			break;
		case 4:
			resultado = DIVISION(d);
			break;		
		}
	
		return resultado;		
	}
	
	public int generarPregunta( int con, int tpo ) 
	{			
		char op = '%' ;
		
	switch (tpo) {
		case 1:
			op = '+';
			break;
		case 2:
			op = '-';
			break;
		case 3:
			op = '*';
			break;
		case 4:
			op = '/';
			break;
		
		}	// fin de 1er switch
		
		System.out.printf("\n%d) Cuanto es %d %c %d ? (Presione -1 para salir) : ",con,a,op,b);
		int rsp = lee.nextInt();
		return rsp;
	}
	
	public void contestaciones( boolean r ) 
	{
		int n = 1 + nAleatorio.nextInt(4);
		
		if (r) 
		{
			switch (n) {
			case 1:
				System.out.printf("\n%20s\n","Muy Bien!");
				break;
			case 2:
				System.out.printf("\n%20s\n","Excelente!");
				break;
			case 3:
				System.out.printf("\n%20s\n","Buen Trabajo!");
				break;
			case 4:
				System.out.printf("\n%20s\n","Sigue Asi!");
				break;
			}
		} 
		else 
		{
			switch (n) {
			case 1:
				System.out.printf("\n\t%s\n","No. Por favor intenta de Nuevo!");
				break;
			case 2:
				System.out.printf("\n\t%s\n","Incorrecto. Intenta una vez mas!");
				break;
			case 3:
				System.out.printf("\n\t%s\n","No te rindas!");
				break;
			case 4:
				System.out.printf("\n\t%s\n","No. Sigue intentando!");
				break;
			}
		}		
	}
	
	public void Rendimiento( int cont, int rsp_cor )
	{
		double promedio = 0;
		promedio = (double)rsp_cor / (double)cont; 
		
//		System.out.printf("\n\tRC: %d CR: %d Promedio: %.4f\n",rsp_cor,cont,promedio);
		
		if ( promedio < 0.75 ) 
		{
			System.out.printf("\n\t\t%s\n","***Por Favor pida ayuda a su instructor***");			
		} 
		else 
		{
			System.out.printf("\n\t\t%s\n","***Felicidades esta listo para el siguiente Nivel***");			
		}			
	}
	
	public int Dificultad() 
	{
		boolean sigue = true;
		int rsp = 0;
		do 
		{
			System.out.printf("\n%s\n%s\n%s\n\n%s",
					"Elige el Nivel de Dificultad:",
					"1) Operaciones de 1 Digito",
					"2) Operaciones de 2 Digitos",
					"Seleccione una opcion (Presione -1 para salir) : ");
			rsp = lee.nextInt();
			
			if ( rsp != -1 ) 
			{
				if ( rsp > 0 && rsp < 3 ) 
				{
					sigue = false;
				}
				else 
				{
					System.out.println("\nError. Opcion no valida!");
				}
			}
			else 
			{
				sigue = false;
			}
			
		} while (sigue);
		
		return rsp;
	}
	
	public int Tipo_Operacion() 
	{
		System.out.printf("\n%s\n%s\n%s\n%s\n%s\n%s\n\n%s",
				"Elige el Tipo de Operacion:",
				"1) SUMA",
				"2) RESTA",
				"3) MULTIPLICACION",
				"4) DIVISION",
				"5) ALEATORIO",
				"Seleccione una opcion (Presione -1 para salir) : ");
		int rsp = lee.nextInt();
				
		return rsp;
		
	}
	
	public int SUMA( int d ) 
	{
		int resultado = 0;
				
		if ( d == 2 ) 
		{
			String temp = "";
			// 1er numero
			do 
			{
				a = nAleatorio.nextInt(10);
			} 
			while ( a == 0 );
			temp += a;
			a = nAleatorio.nextInt(10);
			temp += a;
			a = Integer.parseInt(temp);
			// 2do digito
			temp = "";
			do 
			{
				b = nAleatorio.nextInt(10);
			} 
			while ( b == 0 );
			temp += b;
			b = nAleatorio.nextInt(10);
			temp += b;
			b = Integer.parseInt(temp);
			
		} 
		else 
		{
			a = nAleatorio.nextInt(10);
			b = nAleatorio.nextInt(10);
		}
		
		resultado = a + b;
		
		return resultado;		
	}
	
	public int RESTA( int d ) 
	{
		int resultado = 0;
		
		if ( d == 2 ) 
		{
			String temp = "";
			// 1er numero
			a = nAleatorio.nextInt(10);
			temp += a;
			a = nAleatorio.nextInt(10);
			temp += a;
			a = Integer.parseInt(temp);
			// 2do numero
			temp = "";
			do 
			{
				b = nAleatorio.nextInt(10);
			} 
			while ( b == 0 );
			temp += b;
			b = nAleatorio.nextInt(10);
			temp += b;
			b = Integer.parseInt(temp);			
		} 
		else 
		{
			a = nAleatorio.nextInt(10);
			b = nAleatorio.nextInt(10);
		}
		
		resultado = a - b;
		
		return resultado;
					
	}
	
	public int MULTIPLICACION( int d ) 
	{
		int resultado = 0;
				
		if ( d == 2 ) 
		{
			String temp = "";
			do 
			{
				a = nAleatorio.nextInt(10);				
			} 
			while ( a == 0 );	// 1er digito de a no puede ser 0
			temp += a;
			a = nAleatorio.nextInt(10);
			temp += a;
			a = Integer.parseInt(temp);
			
			temp = "";
			do 
			{
				b = nAleatorio.nextInt(10);
			} 
			while ( b == 0 );
			temp += b;
			b = nAleatorio.nextInt(10);
			temp += b;
			b = Integer.parseInt(temp);					
		} 
		else 
		{
			a = nAleatorio.nextInt(10);
			b = nAleatorio.nextInt(10);
		}
		
		resultado = a * b;
		
		return resultado;		
	}
	
	public int DIVISION( int d ) 
	{
		int resultado = 0;
		
		if ( d == 2 ) 
		{
			String temp = "";
			// 1er digito
			do 
			{
				a = nAleatorio.nextInt(10);				
			} 
			while ( a == 0 );	// 1er digito de a no puede ser 0
			temp += a;
			a = nAleatorio.nextInt(10);
			temp += a;
			a = Integer.parseInt(temp);
			// 2do digito
			temp = "";
			do 
			{
				b = nAleatorio.nextInt(10);
			} 
			while ( (a/10) > b );	// 1er digito de b debe ser mayor al 1er digito de s
			temp += b;
			b = nAleatorio.nextInt(10);
			temp += b;
			b = Integer.parseInt(temp);		
		} 
		else 
		{
			a = nAleatorio.nextInt(10);
			do 
			{
				b = nAleatorio.nextInt(10);				
			} 
			while ( b == 0 );
		}
		
		resultado = a / b;
		
		return resultado;		
	}
}
