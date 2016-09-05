import java.util.Scanner;

public class PruebaFrecuenciaCardiaca {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner(System.in);

		System.out.print("\nCalculadora Personal de Frecuencias Cardiacas!\n");
		System.out.println("\nDATOS DEL PACIENTE");
		System.out.print("-Nombre: ");
		String nom = leer.nextLine();
		System.out.print("-Apellido: ");
		String ape = leer.nextLine();
		System.out.println("\nIngresar Fecha de Nacimiento:");
		System.out.print("-Dia: ");
		int d = leer.nextInt();
		System.out.print("-Mes: ");
		int m = leer.nextInt();
		System.out.print("-Año: ");
		int a = leer.nextInt();
//		FrecuenciaCardiaca miCardio = new FrecuenciaCardiaca();
//		miCardio.setNombre(nom);
//		miCardio.setApellido(ape);
//		miCardio.setnDia(d);
//		miCardio.setnMes(m);
//		miCardio.setnAnno(a);
		FrecuenciaCardiaca miCardio = new FrecuenciaCardiaca(nom,ape,d,m,a);
		System.out.println("\nIngresar Fecha de Actual:");
		System.out.print("-Dia: ");
		d = leer.nextInt();
		System.out.print("-Mes: ");
		m = leer.nextInt();
		System.out.print("-Año: ");
		a = leer.nextInt();
		miCardio.CalcularEdad(d, m, a);
		
		System.out.println("\n\t\tResultados del Analisis:");
		System.out.printf("\n\t%s\t\t%s\n ","PACIENTE:","FRECUENCIAS CARDIACAS (PPM):");
		System.out.printf("\t%s %s\t\t%s %d\n","-Nombre:",miCardio.getNombre(),
				"-Maxima:",miCardio.FrecuenciaMaxima());
		System.out.printf("\t%s %s\t%s %s %.2f %s %.2f\n","-Apellido:",miCardio.getApellido(),
				"-Esperada:","Entre",miCardio.FrecEspMin(),"y",miCardio.FrecEspMax());
		System.out.printf("\t%s %d %s\n","-Edad:",miCardio.getEdad(),"Años");
		System.out.printf("\t%s %d/%d/%d","-Nacimiento:",miCardio.getnDia(),miCardio.getnMes(),miCardio.getnAnno());
				
		
	}
	
}
