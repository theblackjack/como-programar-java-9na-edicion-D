import java.util.Scanner;

public class Salarios {

	double cuota_base;
	double cuota_extra;
	int horas_t;
		
	public Salarios() 
	{
				
	}
		
	public double getCuota_base() {
		return cuota_base;
	}

	public void setCuota_base(double cuota_base) {
		this.cuota_base = cuota_base;
	}

	public double getCuota_extra() 
	{
		return cuota_extra = cuota_base / 2;
	}

	public void setCuota_extra(double cuota_extra) {
		this.cuota_extra = cuota_extra;
	}

	public int getHoras_t() {
		return horas_t;
	}

	public void setHoras_t(int horas_t) {
		this.horas_t = horas_t;
	}

	public void RegistrarDatos() 
	{
		Scanner leer = new Scanner(System.in);
		
		System.out.println("\nDATOS DEL EMPLEADO");
		System.out.print("-Horas: ");
		horas_t = leer.nextInt();
		System.out.print("-Cuota Por Hora: ");
		cuota_base = leer.nextInt();
				
	}
	
	
	public double SueldoBase() 
	{
		return 40 * cuota_base;
	}
	
	public double CalcularSalario() 
	{
		double salario = 0.0;
		int horas_e = 0;
		
		if ( horas_t > 40 ) 
		{
			horas_e = horas_t - 40;
			salario = SueldoBase() + ( horas_e * cuota_extra );
		}
		else 
		{
			salario = cuota_base * horas_t;
		}		
		
		return salario;		
	}
	
	public void mostrarResultados() 
	{
		System.out.println("\nRESULTADO DEL EMPLEADO");
		System.out.printf("%s %.2f %s\n","-Sueldo Bruto:",CalcularSalario(),"Bs.");
	}
	
	
	
	
	
}
