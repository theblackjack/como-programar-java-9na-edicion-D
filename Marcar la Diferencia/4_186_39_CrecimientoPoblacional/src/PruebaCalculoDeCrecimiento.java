
public class PruebaCalculoDeCrecimiento 
{
	public static void main(String[] args) 
	{
		CalculoDeCrecimiento miCal = new CalculoDeCrecimiento();
		System.out.println("\n\t\t=== Poblacion Mundial : CRECIMIENTO ===\n");
		
		System.out.printf("%s: %.3f%%\n",
				"Tasa de Crecimiento Anual Acumulado (2014-2015)",miCal.TCAA());
	
		miCal.RegistrarDatos();
		miCal.mostrarCalculos();
		
	}
	
	
	
	

}
