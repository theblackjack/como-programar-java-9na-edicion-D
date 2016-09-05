import java.util.Scanner;

public class Criptografia {

	int codigo;
	
	public void Menu() 
	{
		int opc = 0;
		Scanner leer = new Scanner(System.in);
		boolean sigue = true;
		
		do 
		{	
			System.out.printf("\n%s\n%s\n%s\n\n%s",
					"1) Ecriptar Clave",
					"2) Desencriptar Clave",
					"3) Salir",
					"Seleccione una Opcion: ");
			opc = leer.nextInt();
			
			switch (opc){
			case 1:
				Encriptar();
				break;
			case 2:
				Desencriptar();
				break;
			case 3:
				sigue = false;
				break;
			default:
				System.out.println("\n Opcion Invalida! Intente de Nuevo!");
				break;
			}
		} 
		while ( sigue );
						
	}
	
	public void Intercambiar() 
	{
		String cad1 = "";
		int temp = 0;
		
		temp = ( codigo / 10 ) % 10;		//saco el 3er digito
		cad1 += temp;	// entra de 1ero a la cadena
		temp = codigo % 10;		//saco el 4to digito
		cad1 += temp;	// entra de 4to a la cadena
		temp = ( codigo / 100 );	//saco los primeros 2 digitos
		cad1 += temp;	// entran de ultimos a la cadena	
		
		codigo = Integer.parseInt(cad1);
	}
		
	public void Encriptar() 
	{
		String cadena = "";
		int div = 1000;
		int temp = 0;
		Scanner dato = new Scanner(System.in);
		
		System.out.print("\nIngrese Codigo de Cuatro Digitos: ");
		codigo = dato.nextInt();
		
		temp = ( ( codigo / div ) + 7) % 10;		// El residuo se queda con a parte fraccionaria
		cadena += Integer.toString(temp);
				
		for (int i = 0; i < 3; i++) 
		{
			if ( div >= 10 ) 
			{
				div /= 10;
			}
			temp = ( ( ( codigo / div ) % 10) + 7) % 10;		// El residuo se queda con a parte fraccionaria
			cadena += Integer.toString(temp);
	
			System.out.println("\nEcriptado: "+temp);
		}
				
//		Conversion de Cadena a Entero
		codigo = Integer.parseInt(cadena);
		
		Intercambiar();
		mostrarResultado();
				
	}
	
	public void Desencriptar() 
	{
		String cadena = "";
		int div = 1000;
		int temp = 0;
		Scanner dato = new Scanner(System.in);
		
		System.out.print("\nIngrese Codigo de Cuatro Digitos: ");
		codigo = dato.nextInt();
		
		Intercambiar();
		
		for (int i = 0; i < 4; i++) 
		{
			temp = ( ( codigo / div ) % 10 + 10) - 7;		
			cadena += Integer.toString(temp);
			if ( div > 1 ) 
			{
				div /= 10;
			}
//			System.out.println("\nDesencriptado: "+temp);
		}
				
//		Conversion de Cadena a Entero
		codigo = Integer.parseInt(cadena);
		mostrarResultado();
				
	}
	
	public void mostrarResultado() 
	{
		System.out.printf("\nResultado: %d\n",codigo);
	}
}
