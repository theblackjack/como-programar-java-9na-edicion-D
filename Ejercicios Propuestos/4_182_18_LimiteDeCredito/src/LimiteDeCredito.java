import java.util.Scanner;

public class LimiteDeCredito {

	int nro_cta;
	int saldo_i = 0;
	int totCargados = 0;
	int totCreditos = 0;
	int limCreditos = 0;
	
	public LimiteDeCredito() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public LimiteDeCredito( int n, int si, int tc, int tlc ) 
	{
		nro_cta = n;
		saldo_i = si;
		totCargados = tc;
		totCreditos = tlc;		
	}

	public int getNro_cta() {
		return nro_cta;
	}

	public void setNro_cta( int nro_cta) {
		this.nro_cta = nro_cta;
	}

	public int getSaldo_i() {
		return saldo_i;
	}

	public void setSaldo_i(int saldo_i) {
		this.saldo_i = saldo_i;
	}

	public int getTotCargados() {
		return totCargados;
	}

	public void setTotCargados(int totCargados) {
		this.totCargados = totCargados;
	}

	public int getTotCreditos() {
		return totCreditos;
	}

	public void setTotCreditos(int totCreditos) {
		this.totCreditos = totCreditos;
	}

	public int getLimCreditos() {
		return limCreditos;
	}

	public void setLimCreditos(int limCreditos) {
		this.limCreditos = limCreditos;
	}

	public void RegistrarDatos() 
	{
		Scanner leer = new Scanner(System.in);
		System.out.println("\nDATOS DEL CLIENTE:");
		System.out.printf("%s","-Nro. Cuenta: ");
		nro_cta = leer.nextInt();
		System.out.printf("%s","-Saldo Inicial: ");
		saldo_i = leer.nextInt();
		System.out.printf("%s","-Total Cargados: ");
		totCargados = leer.nextInt();
		System.out.printf("%s","-Total Creditos: ");
		totCreditos = leer.nextInt();
		System.out.printf("%s","-Limite de Credito: ");
		limCreditos = leer.nextInt();				
	}
	
	public boolean ExcedeLimite() 
	{
		int saldo_a = saldo_i + totCargados - totCreditos;
		
		if ( saldo_a > limCreditos ) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
