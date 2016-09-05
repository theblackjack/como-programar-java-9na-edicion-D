import java.util.Scanner;

public class CalculoDeCrecimiento 
{
	int nro_a = 0;
	double pob2016 = 7349472000.0;
	int anno_dupl = 0;
	

	public void RegistrarDatos() 
	{
		Scanner lee = new Scanner(System.in);
		System.out.print("\nNro. de Años a Calcular: ");
		nro_a = lee.nextInt();		
	}
	
	public double TCAA() 
	{
		double pi = 7265785000.0;	// poblacion mundial 2014
		double pf = 7349472000.0;	// poblacion mundial 2015
		int annos = 2015-2014;
		double tcaa = 0.0;			// tasa de crecimiento anual acumulado
		tcaa = Math.pow((pf/pi), (1/annos)) - 1;
		return tcaa;
	}
		
	public double Calcular_Habitantes( int annos ) 
	{
		double nro_h = 0.0;
				
//		nro_h = pob2016 * Math.pow(( 1 + TCAA() ), annos);
		nro_h = pob2016 * Math.pow(( 1 + 0.012 ), annos);
		return nro_h;		
	}
	
	public void mostrarCalculos() 
	{
//		Año:	Poblacion:	Aumento:	
		System.out.printf("\n%s:\t%s:\t%s:\n","Año","Población","Aumento");
		
		for (int i = 1; i <= nro_a; i++) 
		{
			double pob_fi = Calcular_Habitantes(i);
			double aumento = pob_fi - pob2016;  
			if ( pob_fi >= pob2016*2 && anno_dupl == 0 ) 
			{
				anno_dupl = i;
				System.out.print("*");
			}
			System.out.printf("%d\t%,.00f\t%,.00f\n",2016+i,pob_fi,aumento);			
		}		
		
		if (anno_dupl != 0) 
		{
			System.out.printf("\nAño en que se duplica la Población Existente en 2016: %d",2016+anno_dupl);
		}
		
	}
	
	
	

	
}
