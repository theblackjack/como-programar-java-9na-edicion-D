import java.util.Random;

public class Redondeo 
{	
	Random numAleatorios = new Random();
	
	public double GenerarNumeros() 
	{
		double num = 0;
		num = 1 + numAleatorios.nextDouble();
		return num;		
	}
	
	public double Redondear( double num ) 
	{
		double red = 0;
		red = Math.floor(num + 0.5);
		return red;	
	}

	public void mostrarResultados( double ori, double nue ) 
	{
		System.out.printf("\n%10.2f%15.2f\n",ori,nue);
		
	}
	
	public void ProcesarNumeros() 
	{
		System.out.printf("\n%10s%15s","Original:","Redondeado:");
		int cant = 1 + numAleatorios.nextInt(15);
		
		for (int i = 0; i < cant; i++) 
		{
			double numero = GenerarNumeros();		
			mostrarResultados(numero, Redondear(numero));
		}		
	}
}
