import java.util.Scanner;

public class ExamenTeorico 
{
	String nom = "";
	int pts = 0;
	
	public void Bienvenida() 
	{
		int rsp = 1;
		Scanner lee = new Scanner(System.in);
		
		System.out.print("Bienvenido, Dime tu Nombre: ");
		nom = lee.nextLine();
		
		System.out.printf("\nHola %s, Sabes algo sobre el Cambio Climatico ? (1)SI - (2)NO : ",nom);
		rsp = lee.nextInt();
		
		if ( rsp == 2 ) 
		{
			mostrarConcepto();
		} 
		else
		{
			Preguntas();
		}		
	}		

	public void Preguntas() 
	{
		int rsp;
		Scanner lee = new Scanner(System.in);
		
		System.out.println("\nA continuacion un pequeño examen sobre este tema : ");
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.printf("\nPregunta Nro. %d \n",i+1);
			switch (i) {
			case 0:
				System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
						"-Crees que las actividades humanas son responsables?",
						"   (1) Si",
						"   (2) No",
						"   (3) Solo una Parte",
						"   (4) Totalmente");
				break;
			case 1:
				System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
						"-Que crees que influye mas en el cambio climatico?",
						"   (1) CO2 o Dioxido de Carbono",
						"   (2) El calentamiento Cosmico",
						"   (3) La actividad solar",
						"   (4) Otro");
				break;
			case 2:
				System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
						"-Crees que es una estrategia de las grandes Coorporaciones para evitar\n"
						+ " que otros crescan explotando sus recursos fosiles?",
						"   (1) Si",
						"   (2) No",
						"   (3) Es posible",
						"   (4) Puro cuento");
				break;
			case 3:
				System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
						"-Crees que se falsean los datos para crear miedo?",
						"   (1) Si",
						"   (2) Obviamente tiene un uso politico",
						"   (3) No",
						"   (4) Tal vez");
				break;
			case 4:
				System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
						"-Cual crees sera el efecto mas terrible del cambio climatico?",
						"   (1) Era de hielo",
						"   (2) Derretimiento de los polos",
						"   (3) Terremotos, inundaciones, etc.",
						"   (4) Todo seguira igual");
				break;
				
			}	// fin del switch
			
			System.out.print("\nSelecciones una Opcion: ");
			rsp = lee.nextInt();
			System.out.println();
			
			switch (i) {
			case 0:
			case 1:
			case 2:
			case 4:
				if ( rsp == 3 ) 
				{
					pts++;
				}
				break;
			case 3:
				if ( rsp == 2 ) 
				{
					pts++;
				}
				break;
			}
			
		}	// fin del for
		
		mostrarPuntos();
		
	}	
	
	public void mostrarConcepto() 
	{
		System.out.println("\n\nAca tenés un pequeño concepto Referente al cambio Climatico: ");
			
		System.out.println("\n\tEl cambio climático es definido como un cambio estable y durable en la distribución \nde los "
		+ "patrones de clima en periodos de tiempo que van desde décadas hasta millones de años. \n"
		+ "Pudiera ser un cambio en las condiciones climáticas promedio o la distribución de eventos en \n"
		+ "torno a ese promedio (por ejemplo más o menos eventos climáticos extremos). El cambio climático\n"
		+ "puede estar limitado a una región específica, como puede abarcar toda la superficie terrestre. \n"
		+ "El término, a veces se refiere específicamente al cambio climático causado por la actividad \nhumana, "
		+ "a diferencia de aquellos causados por procesos naturales de la Tierra y el Sistema Solar.\n\n\tEn este "
		+ "sentido, especialmente en el contexto de la política ambiental, el término \n“cambio climático” ha "
		+ "llegado a ser sinónimo de “calentamiento global antropogénico“, o sea \nun aumento de las temperaturas "
		+ "por acción de los humanos.\n");
		
		System.out.println("\n\nEspero esto te sirva para que tengas una noción del Cambio Climatico\n"
				+ "Gracias por Participar! \n");
	}
	
	public void mostrarPuntos() 
	{
		System.out.println("\nResultados de la Evaluacion: \n");
		System.out.printf("\nObtuvistes %d puntos! ",pts);
		if ( pts == 5 ) 
		{
			System.out.print("Excelente!");
		}
		if ( pts == 4 ) 
		{
			System.out.print("Muy Bien!");
		}
		if ( pts <= 3 ) 
		{
			System.out.println("\nEs tiempo de que aprendas mas sobre el Calentamiento Global!\n");
			System.out.printf("\nAca os dejo unos sitios Web donde leer al especto: \n%s\n%s\n%s\n",
					" -https://www.youtube.com/watch?v=weIBPwFuYwA",
					" -http://www.grupotortuga.com/El-discurso-del-miedo-El-Informe",
					" -http://cambioclimaticoglobal.com/que-es-el-cambio-climatico");
		}
		
	}
	
}

