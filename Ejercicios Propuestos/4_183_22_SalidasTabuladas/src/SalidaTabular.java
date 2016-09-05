
public class SalidaTabular {

	
	public SalidaTabular() {
		// TODO Auto-generated constructor stub
	}
	
	public void mostrarSalida() 
	{
		int cont = 1;
		System.out.printf("%s\t%s\t%s\t%s\n","N:","N*10:","N*100:","N*1000:");
		while ( cont <= 5 ) 
		{
			System.out.printf("%d\t%d\t%d\t%d\n",cont,cont*10,cont*100,cont*1000);
			cont++;
		}
		
	}
	
	
}
