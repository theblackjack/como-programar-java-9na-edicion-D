
public class PerfilMedico {

	String nombre;
	String apellido;
	double peso;
	double altura;
	int nDia;
	int nMes;
	int nAnno;
	int edad;
	
	public PerfilMedico() 
	{
		// TODO Auto-generated constructor stub
	}	
	
	public PerfilMedico( String n, String ap, double p, double al, int d, int m, int a ) 
	{
		nombre = n;
		apellido = ap;
		peso = p;
		altura = al;
		nDia = d;
		nMes = m;
		nAnno = a;
				
	}	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getnDia() {
		return nDia;
	}

	public void setnDia(int nDia) {
		this.nDia = nDia;
	}

	public int getnMes() {
		return nMes;
	}

	public void setnMes(int nMes) {
		this.nMes = nMes;
	}

	public int getnAnno() {
		return nAnno;
	}

	public void setnAnno(int nAnno) {
		this.nAnno = nAnno;
	}

		
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void CalcularEdad( int aDia, int aMes, int aAnno ) 
	{
		edad = aAnno - nAnno;
	
		if ( nMes < aMes ) 
		{
			edad = (aAnno - nAnno) - 1;
		}
		else if ( nMes > aMes  )
		{			
			edad = aAnno - nAnno;			
		}
		else if ( nMes == aMes  )
		{
			if ( nDia < aDia ) 
			{
				edad = (aAnno - nAnno) - 1;
			}			
		}
			
	}

	public int FrecuenciaMaxima() 
	{
		int max = 0;
		max = 220 - edad;
		return max;		
	}
	
	public double FrecEspMin() 
	{
		double fceMin = FrecuenciaMaxima() * 0.50;
		return fceMin;		
	}
	
	public double FrecEspMax() 
	{
		double fceMax = FrecuenciaMaxima() * 0.85;
		return fceMax;		
	}
	
	public double BMI() 
	{
		return peso / (altura*altura);
	}
	
	public void TablaDeValoresBMI() 
	{
		System.out.printf("\n\t\t\t%s","Valores BMI: ");
		System.out.printf("\n\t\t\t%s %.2f","Bajo Peso: Menos de ",18.5);
		System.out.printf("\n\t\t\t%s %.2f %s %.2f","Normal: entre ",18.5,"y",24.9);
		System.out.printf("\n\t\t\t%s %.2f %s %.2f","Sobrepeso: entre ",24.9,"y",29.9);
		System.out.printf("\n\t\t\t%s %d %s","Obeso: ",30,"o mas");
	}
	
}
