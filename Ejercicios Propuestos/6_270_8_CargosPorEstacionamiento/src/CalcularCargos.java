import java.util.Random;

public class CalcularCargos 
{

	public double calcularCargo( int h ) 
	{
		double cargo = 0;
		
		if ( h <= 3 ) 
		{
			cargo = 3;
		}
		if ( h > 3 && h < 24 ) 
		{
			int adi = h - 3;
			cargo = 3 + ( adi * 0.50 );
		}
		else if ( h == 24 )
		{
			cargo = 10;
		}
		
		return cargo;		
	} // fin CalcularCargos
	
	public void ProcesarClientes() 
	{
		int num_cli = 0;
		int h_cli = 0;
		boolean unico = false;
		double cobrar = 0;
		double total = 0;
		Random numCliAleatorio = new Random();
		
		num_cli = 1 + numCliAleatorio.nextInt(18); // clientes que hubo ayer
		
		System.out.printf("\n%s\n","Registro de Clientes del dia Anterior: ");
		System.out.printf("\n%10s%15s%15s\n","Horas:","Cliente:","Cobrar:");
		
		for (int i = 0; i < num_cli; i++) 
		{
			h_cli = 1 + numCliAleatorio.nextInt(24);
			
			if ( h_cli == 24 && unico == false ) 
			{
				cobrar = calcularCargo(h_cli);
				unico = true;
			}
			if ( h_cli < 24 ) 
			{
				cobrar = calcularCargo(h_cli);
			}
			total += cobrar;
			mostrarResulatdos(h_cli, i, cobrar);
			
		} // fin for
				
		System.out.printf("\n\n%10s%s%,.2f\n","Total Recaudado Ayer: ","$",total);
		
	} // fin ProcesarClientes
	
	public void mostrarResulatdos( int h, int ncli, double monto ) 
	{
		System.out.printf("\n%10d%15d%10s%.2f \n",h,ncli,"$",monto);		
		
	} // fin mostrarResultados

} // fin de la Clase








