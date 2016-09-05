import java.util.Scanner;

public class CancionDeNavidad 
{
	public void ProcesarDia() 
	{
		int dia = 1;
		
		Scanner dato = new Scanner(System.in);
		
		System.out.print("Cancion a partir del Dia : ");
		dia = dato.nextInt();		
		
		for (int i = dia; i <= 12; i++) 
		{
			Dia(i);
			System.out.println();
		}		
	}	
	
	public void Dia( int d ) 
	{
		switch (d) {
		case 1:
			System.out.print("El Primer Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 2:
			System.out.print("El Segundo Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 3:
			System.out.print("El Tercero Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 4:
			System.out.print("El Cuarto Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 5:
			System.out.print("El Quinto Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 6:
			System.out.print("El Sesto Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 7:
			System.out.print("El Septimo Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 8:
			System.out.print("El Octavo Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 9:
			System.out.print("El Noveno Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 10:
			System.out.print("El Decimo Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 11:
			System.out.print("El Undecimo Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		case 12:
			System.out.print("El Duodecimo Dia Despues de Navidad\nMi Amor me mando \n");
			break;
		}
		
		Verso(d);		
		
	}
	
	public void Verso( int d ) 
	{
		switch (d) {
		case 1:
			System.out.print(" Una Perdiz en un Peral\n");
			break;
		case 2:
			System.out.print(" Dos Tortolas\n");
			break;
		case 3:
			System.out.print(" Tres Gallinas Francesas\n");
			break;
		case 4:
			System.out.print(" Cuatro Pajaros Llamando\n");
			break;
		case 5:
			System.out.print(" Cinco Anillos de Oro\n");
			break;
		case 6:
			System.out.print(" Seis Ocas Poniendo\n");
			break;
		case 7:
			System.out.print(" Siete Cisnes Nadando\n");
			break;
		case 8:
			System.out.print(" Ocho Criadas Ordeñando\n");
			break;
		case 9:
			System.out.print(" Nueve Señoras Bailando\n");
			break;
		case 10:
			System.out.print(" Diez Señores Brincando\n");
			break;
		case 11:
			System.out.print(" Once Gaiteros Tocando\n");
			break;
		case 12:
			System.out.print(" Doce Tamborileros Tamboreando\n");
			break;
		}
		
		if ( d != 1 ) 
		{
			Verso(d-1);
		}
		
	}
	
	
	

}
