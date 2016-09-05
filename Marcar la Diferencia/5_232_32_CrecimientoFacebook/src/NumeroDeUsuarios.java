import java.util.Scanner;

public class NumeroDeUsuarios 
{

	double inicial = 0;
	double crecimiento = 0;	
	
	public void RegistrarDatos() 
	{
		Scanner lee = new Scanner(System.in);
		
		System.out.print("\nCantidad de Usuarios al 06/2010 : ");
		inicial = lee.nextDouble();
		
		System.out.print("Tasa de Crecimiento mensual : ");
		crecimiento = lee.nextDouble();
		
		
	}	
	

	public String Meses( int i ) 
	{
		String mes = "";
		
		switch (i) {
		case 1:
			mes = "Enero";
			break;
		case 2:
			mes = "Febrero";
			break;
		case 3:
			mes = "Marzo";
			break;
		case 4:
			mes = "April";
			break;
		case 5:
			mes = "Mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Septiembre";
			break;
		case 10:
			mes = "Octubre";
			break;
		case 11:
			mes = "Noviembre";
			break;
		case 12:
			mes = "Diciembre";
			break;
		}
		
		return mes;
		
	}
	
	public double CalcularUsuarios( int t, double inic ) 
	{
		double usuarios = 0;
		double tasa = crecimiento/100;
		usuarios = inic * Math.pow( 1 + (tasa/12), 12*t );
//		
//		System.out.printf("\n-Acum: %,.2f\n",inic);
//		System.out.printf("-Años: %d\n",t);
//		System.out.printf("-Usu: %,.2f\n",usuarios-inic);
		
		return usuarios;
	}
	
	
	public void mostrarResultados() 
	{
		double diferencia = 0;
		double usuarios = 0;
		double acum_usu = inicial;
		int annos = 1;
		int mes = 7;
		int cont_m = 0;
		int cnt_1m = 0;
		int cnt_2m = 0;
		boolean sigue = true;
		
		System.out.printf("\n%s\n\n%10s%15s%30s\n","Cantidad de Usuarios Previstos para cada Mes: ","Mes:","Año:","Millones de Usuarios:");
		do 
		{
			if ( acum_usu >= inicial*2 && cnt_1m == 0 ) 
			{				
				cnt_1m = cont_m;
			}
			if ( acum_usu >= inicial*4 && cnt_2m == 0 ) 
			{				
				cnt_2m = cont_m;
				sigue = false;
			}			
			System.out.printf("\n%10s%15d%,30.2f\n",Meses(mes),2009+annos,acum_usu);
			
			usuarios = CalcularUsuarios(annos,acum_usu);
			diferencia = usuarios - acum_usu;
			acum_usu += diferencia;
			mes++;
			cont_m++;
			if ( mes == 13 ) 
			{
				mes = 1;
				annos++;
			}
						
		} 
		while ( sigue );			
		
		diferencia = acum_usu - inicial;
		
		System.out.printf("\n\n%s\n\n%35s %,.2f %s\n%35s %d %s\n%35s %d %s\n%35s %,.2f %s\n",
				"Resultados:",
				"Usuarios Iniciales:",inicial,"Millones de Usuarios",
				"Alcanzo 1.000 Millones en:",cnt_1m,"Meses",
				"Alcanzo 2.000 Millones en:",cnt_2m,"Meses",
				"Crecio:",diferencia,"Millones de Usuarios");
		
	}
	
}
