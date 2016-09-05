import java.util.Scanner;

import javax.sound.midi.MidiChannel;

public class PruebaPerfilMedico {

	public static void main(String[] args) 
	{
		
		Scanner leer = new Scanner(System.in);

		System.out.print("\nCalculadora Personal de Frecuencias Cardiacas!\n");
		System.out.println("\nDATOS DEL PACIENTE");
		System.out.print("-Nombre: ");
		String nom = leer.nextLine();
		System.out.print("-Apellido: ");
		String ape = leer.nextLine();
		System.out.print("-Peso: ");
		double p = leer.nextDouble();
		System.out.print("-Altura: ");
		double al = leer.nextDouble();
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
		PerfilMedico miPerfil = new PerfilMedico(nom,ape,p,al,d,m,a);
		System.out.println("\nIngresar Fecha de Actual:");
		System.out.print("-Dia: ");
		d = leer.nextInt();
		System.out.print("-Mes: ");	
		m = leer.nextInt();
		System.out.print("-Año: ");
		a = leer.nextInt();
		miPerfil.CalcularEdad(d, m, a);
		
		System.out.println("\n\t\tResultados del Analisis:");
		System.out.printf("\n\t%s\t\t\t%s\n ","PACIENTE:","VALORES:");
		System.out.printf("\t%s %s\t\t\t%s %d\n","-Nombre:",miPerfil.getNombre(),
				"-FC Maxima:",miPerfil.FrecuenciaMaxima());
		System.out.printf("\t%s %s\t\t%s %s %.2f %s %.2f\n","-Apellido:",miPerfil.getApellido(),
				"-FC Esperada:","Entre",miPerfil.FrecEspMin(),"y",miPerfil.FrecEspMax());
		System.out.printf("\t%s %d %s\t\t\t%s %.2f\n","-Edad:",miPerfil.getEdad(),"Años",
				"-BMI:",miPerfil.BMI());
		System.out.printf("\t%s %d/%d/%d\n","-Nacimiento:",miPerfil.getnDia(),miPerfil.getnMes(),miPerfil.getnAnno());
		System.out.printf("\t%s %.2f\n\t%s %.2f","-Peso:",miPerfil.getPeso(),"-Altura:",miPerfil.getAltura());
		System.out.println();
		miPerfil.TablaDeValoresBMI();
		
	}
	
}
