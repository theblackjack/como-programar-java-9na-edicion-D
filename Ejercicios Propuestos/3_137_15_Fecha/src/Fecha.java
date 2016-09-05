
public class Fecha {

	int dia;
	int mes;
	int anno;
	
	public Fecha() 
	{
		dia = 15;
		mes = 6;
		anno = 1992;
	}
	
	public Fecha( int d, int m, int a ) 
	{
		dia = d;
		mes = m;
		anno = a;		
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	public void mostrarFecha() 
	{
		System.out.printf("\n%s\n","Informacion sobre fecha:");
		System.out.printf("%s %d/%d/%d","Fecha:",dia,mes,anno);
	}
	
	
}
