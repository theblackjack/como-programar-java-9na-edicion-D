
public class PruebaArgumentos 
{
	
	public static void main(String[] args) 
	{
		Argumentos miArg;
				
		if ( args.length != 0 ) 
		{
			System.out.printf("\nValor Recibido: %d\n",Integer.parseInt(args[0]));			
			miArg = new Argumentos(Integer.parseInt(args[0]));
		}
		else 
		{
			System.out.println("\nValor Por Defecto 10\n");
			miArg = new Argumentos(10);
		}	
				
		miArg.procesar();
		
		
	}

}
