import java.util.Scanner;

public class ComisionesPorVentas {

	double sueldo_base;
	int tipo;
	double sub_total;
	
	public ComisionesPorVentas() 
	{
		sueldo_base = 200;
	}
	
	public double getSueldo_base() 
	{
		return sueldo_base;
	}

	public void setSueldo_base(double sueldo_base) 
	{
		this.sueldo_base = sueldo_base;
	}

	public double CostoArt() 
	{
		double pvp = 0.0;
		
		if ( tipo == 1  ) 
		{
			pvp = 239.99;
		}
		if ( tipo == 2  ) 
		{
			pvp = 129.75;
		}
		if ( tipo == 3  ) 
		{
			pvp = 99.95;
		}
		else 
		{
			pvp = 350.89;
		}
		
		return pvp;
		
	}
	
	public void RegistrarDatos() 
	{
		Scanner leer = new Scanner(System.in);
		int cont = 1;
		System.out.println("\nDATOS DEL VENDEDOR:");
		System.out.println("Cantidad Vendida por Cada Tipo: ");
		while ( cont <= 4 ) 
		{
			System.out.printf("%s (%d): ","Tipo",cont);
			int cant = leer.nextInt();
			tipo = cont;
			sub_total += CostoArt() * cant;
			cont++;
		}	
				
	}
	
	public double CalcularComision() 
	{
		return sub_total * 0.09;
	}
	
	public double SueldoFinal() 
	{
		return sub_total + CalcularComision();
	}
	
	public void mostrarResultados() 
	{
		System.out.println("\nRESULTADOS DEL VENDEDOR:");
		System.out.printf("%s %.2f %s\n","-Ventas Brutas:",sub_total,"Bs.");
		System.out.printf("%s %.2f %s\n","-Comision:",CalcularComision(),"Bs.");
		System.out.printf("%s %.2f %s\n","-Sueldo a Pagar:",SueldoFinal(),"Bs.");
	}
}
