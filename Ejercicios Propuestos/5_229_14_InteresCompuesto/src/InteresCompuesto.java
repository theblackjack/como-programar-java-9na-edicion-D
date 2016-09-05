import java.util.Scanner;


public class InteresCompuesto 
{
	
	double capital = 0.0;
	double monto = 0.0;
	double tasa = 0.0;
	int annos = 0;
		
	public void RegistrarDatos() 
	{
		Scanner lee = new Scanner(System.in);
		
		System.out.println("\nIngrese los Siguientes Datos:");
		System.out.print("\n-Capital a Invertir (Bs.): ");
		capital = lee.nextDouble();
		System.out.print("-Durante cuantos Años? : ");
		annos = lee.nextInt();
	
	}
	
	public double CalcularMonto( int i ) 
	{
		double money = 0.0;
		tasa = i;	// No se porque pero sino asigno la tasa de esta forma al dividir el valor entre
					// 100 me retorna 0
		money = capital * Math.pow( 1 + (tasa/100), annos );
		return money;
	}
	
	public void mostrarResultado() 
	{
		double diferencia = 0.0;
		
		System.out.printf("\n%s\n\n%s\t%20s\n","Monto en la Cuenta para Cada Tasa: ","Tasa:","Monto en la Cuenta:");
		for (int i = 5; i <= 10; i++) 
		{
			monto = CalcularMonto(i);
			System.out.printf("\n%4d%%\t\t%,.2f %s",i,monto,"Bs.");
		}
		
		diferencia = monto - capital;
		
		System.out.print("\n\nResultados:");
		
		System.out.printf("\n%20s: %,.2f %s\n%20s: %,.2f %s\n%20s: %,.2f %s",
				"Inicial",capital,"Bs.","Monto Acumulado",monto,"Bs.","Ganacia",diferencia,"Bs.");
		
		
	}

}
