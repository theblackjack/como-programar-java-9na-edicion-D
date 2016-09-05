import java.util.Scanner;
import java.util.zip.CRC32;

public class BinarioEnDecimal {

	int numB;
	int numD;
	
	public BinarioEnDecimal() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNumB() {
		return numB;
	}

	public void setNumB(int numB) {
		this.numB = numB;
	}

	public int getNumD() {
		return numD;
	}

	public void setNumD(int numD) {
		this.numD = numD;
	}

	public void RegistrarNumero() 
	{
		Scanner leer = new Scanner(System.in);
				
		System.out.println("\nIngrese un nro. Binario (p.ej.: 1011) Menor o Igual a 8 Digitos ");
		System.out.print("Numero: ");
		numB = leer.nextInt();				
	}
	
	
	public void Conversion() 
	{
		int cont = 0;
		int div = 10;
		int nTemp = numB % 10;
		System.out.printf("\nB-%d: %d  ",cont+1,nTemp);
		
		while ( cont < 8 ) 
		{
			numD += nTemp * Math.pow(2, cont);
			//System.out.printf("\nD-%d: %d  ",cont+1,numD);
			cont++;
			nTemp = ( numB / div ) % 10;
			//System.out.printf("\nB-%d: %d  ",cont+1,nTemp);
			div *= 10;			
		}
	}
	
	public void mostrarConversion() 
	{
		System.out.printf("\n%s %d\n","Numero en Decimal:",numD);
		
	}
	
	
}
