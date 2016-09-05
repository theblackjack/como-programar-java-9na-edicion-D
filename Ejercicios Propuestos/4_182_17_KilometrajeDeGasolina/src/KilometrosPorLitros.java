import java.util.Scanner;

public class KilometrosPorLitros {

	double total;
	
	public KilometrosPorLitros() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public double getTotal() 
	{		
		return total;
	}

	public void RegistrarDatos() 
	{
		double promedioD = 0.0;
		int k, l = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("\nKilometros Recorridos: ");
		k = leer.nextInt();
		System.out.print("Litros Consumidos: ");
		l = leer.nextInt();
		promedioD = (double)k/l;
		System.out.printf("\t%s %.2f %s\n","-Kilometros Por Litros:",promedioD,"Km/lts");
		total += promedioD;
	}
		
	
}
