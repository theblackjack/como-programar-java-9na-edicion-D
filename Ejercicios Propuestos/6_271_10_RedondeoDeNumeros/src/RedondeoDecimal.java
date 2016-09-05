import java.util.Random;

public class RedondeoDecimal 
{
	Random numAleatorios = new Random();
	
	public double GenerarNumeros() 
	{
		double num = 0;
		num = 1 + numAleatorios.nextDouble();
		return num;		
	}
	
	public double Redondear( double num, int tipo ) 
	{
		double red = 0;
		if ( tipo == 1 ) // entero 
		{
			red = Math.floor(num + 0.5);
		} 
		if (tipo == 2 ) 
		{
			red = Math.floor(num * 10 + 0.5) / 10;
		}
		if (tipo == 3 ) 
		{
			red = Math.floor(num * 100 + 0.5) / 100;
		}
		if (tipo == 4 ) 
		{
			red = Math.floor(num * 1000 + 0.5) / 1000;
		}
		return red;	
	}

	public void mostrarResultados( double ori, double nue ) 
	{
		System.out.printf("%15.3f%20.3f\n",ori,nue);
		
	}
	
	public void ProcesarNumeros() 
	{
		System.out.printf("\n%15s%15s%20s","Redondea a:","Original:","Redondeado:");
//		int cant = 1 + numAleatorios.nextInt(15);
		
		for (int i = 1; i <= 4; i++) 
		{
			double numero = GenerarNumeros();
			if ( i == 1 ) 
			{
				System.out.printf("\n%15s","Entero");
			} 
			if ( i == 2 )
			{
				System.out.printf("\n%15s","Decima");
			}
			if ( i == 3 )
			{
				System.out.printf("\n%15s","Centesima");
			}
			if ( i == 4 )
			{
				System.out.printf("\n%15s","Milesima");
			}
			mostrarResultados(numero, Redondear(numero, i));
		}		
	}

}
