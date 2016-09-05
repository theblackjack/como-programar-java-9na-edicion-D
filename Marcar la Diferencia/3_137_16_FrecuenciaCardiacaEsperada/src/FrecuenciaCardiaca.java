
public class FrecuenciaCardiaca {

	String nombre;
	String apellido;
	int nDia;
	int nMes;
	int nAnno;
	int edad;
	
	public FrecuenciaCardiaca() 
	{
		// TODO Auto-generated constructor stub
	}	
	
	public FrecuenciaCardiaca( String n, String ap, int d, int m, int a ) 
	{
		nombre = n;
		apellido = ap;
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
	
}
