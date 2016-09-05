import java.util.Scanner;

public class ValorMasGrande {

	int mayor;
	
	public ValorMasGrande() 
	{
		// TODO Auto-generated constructor stub
	}

	public int getMayor() {
		return mayor;
	}

	public void setMayor(int mayor) {
		this.mayor = mayor;
	}
	
	public void RegistrarDatos() 
	{
		Scanner leer = new Scanner(System.in);
		int cont = 1;
		System.out.println("\nNUMEROS:");
		while ( cont <= 10 ) 
		{
			System.out.printf("%s (%d): ","Valor",cont);
			int v = leer.nextInt();
			if ( v > mayor ) 
			{
				mayor = v;
			}
			cont++;
		}		
	}
	
	public void mostrarResultados() 
	{
		System.out.printf("\n%s %d\n","NUMERO MAYOR:",mayor);
	}
	
}
