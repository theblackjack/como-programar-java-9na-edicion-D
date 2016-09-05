
public class ValorDeSalida 
{
	double x;
	
	public void mostrarValores() 
	{
		System.out.println("\nFunciones de la clase Math: ");
		x = Math.abs( 7.5 );
		System.out.printf("\n-ABS ( 7.5 ): %.1f\n",x);
		x = Math.floor( 7.5 );
		System.out.printf("\n-Floor ( 7.5 ): %.1f\n",x);
		x = Math.abs( 0.0 );
		System.out.printf("\n-ABS ( 0.0 ): %.1f\n",x);
		x = Math.ceil( 0.0 );
		System.out.printf("\n-Ceil ( 0.0 ): %.1f\n",x);
		x = Math.abs( -6.4 );
		System.out.printf("\n-ABS ( -6.4 ): %.1f\n",x);
		x = Math.ceil( -6.4 );
		System.out.printf("\n-Ceil ( -6.4 ): %.1f\n",x);
		x = Math.ceil( -Math.abs( -8 + Math.floor( -5.5 ) ) );
		System.out.printf("\n-Ceil ( - ABS (-8 + Floor ( -5.5 ) ): %.1f\n",x);
	}
	

}
