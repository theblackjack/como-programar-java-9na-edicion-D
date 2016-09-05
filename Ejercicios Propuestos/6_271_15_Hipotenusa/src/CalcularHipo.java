import java.util.Scanner;

public class CalcularHipo 
{
	double l1 = 0;
	double l2 = 0;
		
	public void procesarHipo() 
	{
		double hipotenusa = 0;
	
		System.out.println("\nValores para hallar la Hipotenusa: ");
		for (int i = 0; i < 3; i++) 
		{
			registrarLados();
			hipotenusa = calcularHipotenusa2(l1, l2);
			System.out.printf("\n%15s%15s%15s\n","Hipotenusa:","Cateto 1:","Cateto 2:");
			mostrarResultado(hipotenusa, l1, l2);					
		}
	}
	
	public void registrarLados() 
	{
		Scanner lee = new Scanner(System.in);
		
		System.out.print("\nIngrese Cateto 1: ");
		l1 = lee.nextDouble();
		System.out.print("Ingrese Cateto 2: ");
		l2 = lee.nextDouble();				
	}
	
	public double calcularHipotenusa( double l1, double l2 ) 
	{
		double hipo = 0;
		hipo = Math.sqrt( Math.pow(l1, 2) + Math.pow(l2, 2) );		
		return hipo;		
	}
	
	// 2do Metodo
	public double calcularHipotenusa2( double l1, double l2 ) 
	{
		double hipo = 0;
		double max = Math.max(l1, l2); // cateto mayor
		hipo = max * ( Math.sqrt( 1 + Math.pow( ( l1 / max ), 2) ) );
		return hipo;		
	}
	
	public void mostrarResultado( double h, double l1, double l2 ) 
	{
		System.out.printf("%15.1f%15.1f%15.1f\n",h,l1,l2);		
	}
	
	
	

}
