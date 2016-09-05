
public class PruebaTriplePitagoras 
{
	public static void main(String[] args) 
	{
		TriplesPitagoras miTriples = new TriplesPitagoras();
		
		System.out.println("\n\t\t=== TRIPLES DE PITAGORAS ===\n");
		System.out.printf("\n%14s%20s%20s\n","Cateto A :","Cateto B :","Hipotenusa :");
		
		miTriples.calcularTriples();
	}

}
