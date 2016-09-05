import java.util.Scanner;

public class CalcularDistancia 
{
	double x1 ;
	double y1 ;
	double x2 ;
	double y2 ;
	
	public void Procesar() 
	{
		double resultado = 0;
		registrarNum();
		resultado = distancia(x1, y1, x2, y2);
		mostrarResultado(resultado);
	}
	
	public void registrarNum() 
	{
		Scanner dato = new Scanner(System.in);
		
		System.out.println("\nIngrese Coordenadas para Calcular Distancia: ");
		
		System.out.println("\n1er punto: ");
		System.out.print("\n\tCoordenada x1: ");
		x1 = dato.nextDouble();
		System.out.print("\tCoordenada y1: ");
		y1 = dato.nextDouble();
		
		System.out.println("\n2do punto: ");
		System.out.print("\n\tCoordenada x2: ");
		x2 = dato.nextDouble();
		System.out.print("\tCoordenada y2: ");
		y2 = dato.nextDouble();		
		
		System.out.print("\nVerificacion de Coordenadas: ");
		System.out.printf("pA((%.1f),(%.1f))  y  pB((%.1f),(%.1f))",x1,y1,x2,y2);
		
	}
	
	public double distancia( double x1, double y1, double x2, double y2 ) 
	{
		double dist = 0;
		dist = Math.sqrt( ( Math.pow( ( x2 - x1 ) , 2)  +  Math.pow( ( y2 - y1 ) , 2) ) );
		return dist;		
	}

	public void mostrarResultado( double d ) 
	{
		System.out.printf("\n\nDistancia entre ambos puntos: %.2f %s\n",d,"Unidades");
	}
}
