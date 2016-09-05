
public class PruebaLimiteDeCredito {

	public static void main(String[] args) 
	{
		
		System.out.println(" \n\t\t\"CALCULADORA DE LIMITES DE CREDITO \" ");
		LimiteDeCredito miLimite = new LimiteDeCredito();
		miLimite.RegistrarDatos();
		
		if ( miLimite.ExcedeLimite() ) 
		{
			System.out.println(" \n\t\t\"¡SUPERA EL LIMITE DE CREDITO!\" ");
		}
	
		
	}
	
}
