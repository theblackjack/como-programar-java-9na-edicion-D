/*
 * Pag. 106 - 2.34 - Calculadora del Crecimiento de la Poblacion Mundial
 * 
 * */


public class CrecimientoPoblacional {

	public static void main(String[] args) 
	{
		
		double pi2015 = 30855909;
		double pf2015 = 31316588;
		double cAnual = 0.0;
		cAnual = ((pf2015 / pi2015) - 1) * 100;
		System.out.printf("%s %.2f%c","Venezuela -> Crecimiento anual en el 2015:",cAnual,'%');
		
		System.out.println("\n\nPoblacion Mundial:");
		cAnual = 1.2 / 100;
		System.out.printf("%s %.1f%%","Tasa de Crecimiento Mundial Anual:",cAnual*100);
		pi2015 = 7396734;
		double pMundial = pf2015 + (pf2015*cAnual);
		System.out.printf("\n\n%s\t%s","Año: ","Millones de Personas:");
		System.out.printf("\n%s\t%.0f","2016",pMundial);
		System.out.printf("\n%s\t%.0f","2017",pMundial += (pMundial*cAnual));
		System.out.printf("\n%s\t%.0f","2018",pMundial += (pMundial*cAnual));
		System.out.printf("\n%s\t%.0f","2019",pMundial += (pMundial*cAnual));
		System.out.printf("\n%s\t%.0f","2020",pMundial += (pMundial*cAnual));
		System.out.printf("\n%s\t%.0f","2021",pMundial += (pMundial*cAnual));
		
	}
}
