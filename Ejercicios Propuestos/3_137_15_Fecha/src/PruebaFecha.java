import java.util.Scanner;

public class PruebaFecha {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);
		
		Fecha mFecha = new Fecha();
				
		System.out.print("Dia: ");
		int d = leer.nextInt();
		System.out.print("Mes: ");
		int m = leer.nextInt();
		System.out.print("Año: ");
		int a = leer.nextInt();
		mFecha.setDia(d);
		mFecha.setMes(m);
		mFecha.setAnno(a);
		
		mFecha.mostrarFecha();
		
	}
	
}
