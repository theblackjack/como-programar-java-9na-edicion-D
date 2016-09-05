import java.util.Scanner;

public class Factorial {

	int num;
	int factorial;
	
	public Factorial() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void RegistrarNumero() 
	{
		boolean sigue = true;
		Scanner leer = new Scanner(System.in);
		while (sigue) 
		{
			System.out.print("\nIngrese un Numero: ");
			num = leer.nextInt();
			if ( num < 0 ) 
			{
				System.out.println("\nEl numero debe SER POSITIVO. Intente de Nuevo!\n");
			}
			else 
			{
				sigue = false;
			}
		}
	}
	
	public void calcularFactorial() 
	{
		int temp = num;
		factorial = temp;

		if ( num == 0 || num == 1 ) 
		{
			System.out.printf("\n%s %d\n","El Factorial es: ",num);
		}
		else 			
		{			
			while ( temp != 1 ) 
			{
				//System.out.printf("\n%s %d %s %d\n","Vuelta:",temp,"Fact:",factorial);
				factorial *= --temp;				
			}
		}				
		
	}
	
	public void mostrarResultado() 
	{
		System.out.printf("\nEl Factorial es: %d\n",factorial);
	}
	
	
}
