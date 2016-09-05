import java.util.Scanner;

/*
 * Pag. 106 - 2.35 - Calculadora de ahorro de Viajes Compartidos en Automovil (En Venezuela)
 * 
 * */

public class ViajesCompartidos {

	public static void main(String[] args) {
		
	int tipoGasolina = 0;
	double precioLitro = 0.0;
	int ruta = 0;
	double distancia = 0.0;
	double litrosConsumidos = 0.0;
	double litroPorKm = ( 1 / 13.5 );	// Promedio Urbano de Toyota
	double tarifaParquearPorHora = 130;	// En venezuela a partir de Marzo
	double tiempoParqueoAlDia = 0.0;
	double MontoPorParqueo = 0.0;
	double GastoPorCombustible = 0.0;
	int numPersonas = 0;
	double CostoPorPersona = 0.0;
	int tiempoDelRecorrido = 0;
	double CostoDelViaje = 0.0;
	Scanner captura = new Scanner(System.in);
	
	System.out.printf("%s\n","Calculo de Costos de Viajes Compartidos");
	System.out.printf("\n%s:\n%s: %s\n%s: %s\n",
	"Trayecto"," -Desde","Urb. Eligio Macias Mujica",
	" -Hasta","Universidad Centrocidental Lizandro Alvarado");
	
	if ( tipoGasolina == 1 )	// 95 Octanos
	{
		precioLitro = 6.00;
	}
	else						// 91 octanos 
	{
		precioLitro = 1.00;
	}
		
	if ( ruta == 1 )		// Por la Carrera Uno 
	{
		distancia = 5.2;
		tiempoDelRecorrido = 12;
	}
	else 					// Por la Av. Libertador
	{
		distancia = 5.4;
		tiempoDelRecorrido = 15;
	}
		
	System.out.printf("\n%s %s ","Tipo de Gasolina:","(1) 95-Octanos - (2) 91-Octanos :");
	tipoGasolina = captura.nextInt();
	System.out.printf("\n%s %s ","Ruta:","(1) Carrera 1 (Recomendada) -  (2) Av. Libertador :");
	ruta = captura.nextInt();
	System.out.printf("\n%s ","Horas de Parqueo al Dia (Ej.: 6,35) :");
	tiempoParqueoAlDia = captura.nextDouble();
	System.out.printf("\n%s ","Nro. de Pasajeros:");
	numPersonas = captura.nextInt();
	
	litrosConsumidos = litroPorKm * distancia;
	GastoPorCombustible = ( litrosConsumidos / distancia ) * precioLitro; 
	MontoPorParqueo = tarifaParquearPorHora * tiempoParqueoAlDia;
	CostoDelViaje = ( GastoPorCombustible + MontoPorParqueo );
	CostoPorPersona = CostoDelViaje / numPersonas;
	
	System.out.println("\nResultados: ");
	System.out.printf("\n%s %.2f %s","- Distancia Recorrida:",distancia,"Km");
	System.out.printf("\n%s %d %s","- Duracion del Recorrido:",tiempoDelRecorrido,"Minutos");
	System.out.printf("\n%s %.2f %s","- Litros Consumidos Por Km:",litrosConsumidos,"Litros");
	System.out.printf("\n%s %.2f %s","- Gasto Por Combustible:",GastoPorCombustible,"Bs.");
	System.out.printf("\n%s %.2f %s","- Gasto por Parqueo:",MontoPorParqueo,"Bs.");
	System.out.printf("\n%s %.2f %s","- Costo Total del Viaje:",CostoDelViaje,"Bs.");
	System.out.printf("\n%s %.2f %s","- Monto a Aportar por Persona:",CostoPorPersona,"Bs.");
	
	}
	
}
