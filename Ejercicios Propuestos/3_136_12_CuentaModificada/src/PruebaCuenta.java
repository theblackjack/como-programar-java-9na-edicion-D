import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) 
	{
		
		Cuenta miCuenta = new Cuenta(11.25);
		Cuenta miCuenta2 = new Cuenta(-7.25);
		
		System.out.println("Cuenta Bancaria");
		System.out.printf("\n%s %.2f %s","- Saldo Cuenta Uno:",miCuenta.getSaldo(),"Bs.");
		System.out.printf("\n%s %.2f %s\n","- Saldo Cuenta Dos:",miCuenta2.getSaldo(),"Bs.");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nMonto a Abonar a Cuenta Uno: ");
		double monto = entrada.nextDouble();
		miCuenta.abonar(monto);
		System.out.printf("\n%s %.2f %s\n","- Saldo Actualizado de Cuenta Uno:",miCuenta.getSaldo(),"Bs.");
		System.out.println();
		
		System.out.print("Monto a Cargar de la Cuenta: ");
		monto = entrada.nextDouble();
		miCuenta.Cargar(monto);
		System.out.printf("\n%s %.2f %s\n","- Saldo Actualizado de Cuenta Uno:",miCuenta.getSaldo(),"Bs.");
		System.out.println();
		
	}
	
}
