public class Cuenta {

	private double saldo;
	
	public Cuenta( double saldoInicial ) 
	{
		if ( saldoInicial > 0.0 ) 
		{
			saldo = saldoInicial;
		}
	}
	
	public void abonar( double monto ) 
	{
		saldo += monto;
	}
	
	public double getSaldo() 
	{
		return saldo;
	}
	
	public void Cargar( double monto ) 
	{
		if ( monto > saldo ) 
		{
			System.out.printf("El Monto %f a Cargar excede el disponible en la Cuenta",monto);
		}
		else 
		{
			saldo -= monto;  
		}
	}
}
