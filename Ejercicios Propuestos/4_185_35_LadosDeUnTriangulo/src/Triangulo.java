import java.util.Scanner;

public class Triangulo {

	int lado;
	
	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public void RegistrarVerificar() 
	{
		Scanner leer = new Scanner(System.in);
		int cont = 1;
		boolean sigue = true;
				
		System.out.println("\nIngrese 3 Valore(s)");
		while ( cont <= 3 && sigue ) 
		{
			System.out.printf("%s %d: ","Numero",cont);
			int n = leer.nextInt();
			if ( n == 0 ) 
			{
				System.out.println("\nValor NO VALIDO. Intente de Nuevo!\n");
			}
			else 
			{
				if ( cont == 1 ) 
				{
					lado = n;
					cont++;
				}
				else 
				{
					if ( lado != n )
					{
						System.out.println("\n\t\t\"¡YA NO PUEDE SER UN TRIANGULO!\"\n");
						sigue = false;
					}
					else 
					{
						cont++;
					}
				}
			}
			
			if ( cont > 3) 
			{
				System.out.println("\n\t\t\"¡SI PUEDE SER UN TRIANGULO!\"\n");
			}			
		}	// fin while		
	}
}
