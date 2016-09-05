import java.util.Scanner;

public class ValorMenor 
{
	int menor = 99999;
	
	public void captura() 
	{
		int cont = 1;
		int v = 0;
		int cant = 0;
		
		Scanner lee = new Scanner(System.in);
		System.out.println("Ingrese los valores a Comparar: \n");
		do 
		{
			System.out.printf(" -Ingrese el %d valor: ",cont);
			v = lee.nextInt();
			if ( cont == 1 ) 
			{
				cant = v;
			}
			menorNumero(v);
			++cont;
		} 
		while ( cont <= cant );
		
		mostrarMenor( cant );
	
	}
	
	public void menorNumero( int n ) 
	{
		if ( n < menor ) 
		{
			menor = n;
		}
	}
	
	public void mostrarMenor( int v ) 
	{
		System.out.printf("\nEl Menor de los %d Numeros es : %d\n",v, menor);
	}
	

}
