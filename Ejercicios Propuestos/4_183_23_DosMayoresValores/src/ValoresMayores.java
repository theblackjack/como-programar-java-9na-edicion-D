import java.util.Scanner;

public class ValoresMayores {

	int may1;
	int may2;
	
	public ValoresMayores() {
		// TODO Auto-generated constructor stub
	}
	
	public void RegistrarNumeros() 
	{
		Scanner leer = new Scanner(System.in);
		int cont = 1;
		System.out.println("\nNUMEROS:");
		while ( cont <= 5 ) 
		{
			System.out.printf("%s (%d): ","Valor",cont);
			int v = leer.nextInt();
			if ( v > may1 ) 
			{
				may2 = may1;
				may1 = v;				
			}
			else if ( v > may2 )
			{
				may2 = v;
			}
						cont++;
		}		
		
	}
	
	public void mostrarResultados() 
	{
		System.out.printf("\n%s %d\n%s %d\n","1er Nro. Mayor:",may1,"2do Nro. Mayor:",may2);
	}
	
}
