import java.util.Scanner;

public class TrianguloRectangulo {

	int catetoA;
	int catetoB;
	int Hipotenusa;
	
	public TrianguloRectangulo() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCatetoA() {
		return catetoA;
	}
	
	public void setCatetoA(int catetoA) {
		this.catetoA = catetoA;
	}
	
	public int getCatetoB() {
		return catetoB;
	}
	
	public void setCatetoB(int catetoB) {
		this.catetoB = catetoB;
	}
	
	public int getHipotenusa() {
		return Hipotenusa;
	}
	
	public void setHipotenusa(int hipotenusa) {
		Hipotenusa = hipotenusa;
	}
	
	public void RegistrarValores() 
	{
		Scanner leer = new Scanner(System.in);
		int cont = 1;
		boolean sigue = true;
		
		System.out.println("\nIngrese los 3 lados del Triangulo Rectangulo");
		while (sigue) 
		{
			System.out.printf("%s %d: ","Valor",cont);
			int v = leer.nextInt();
			if ( v != 0 ) 
			{
				if ( v > Hipotenusa ) 
				{
					catetoB = catetoA;
					catetoA = Hipotenusa;
					Hipotenusa = v;
					cont++;
				}
				else 
				{
					if ( v > catetoA ) 
					{
						catetoB = catetoA;
						catetoA = v;
						cont++;
					}
					else 
					{
						catetoB = v;
						cont++;
					}
				}				
			}
			else 
			{
				System.out.println("\nValor NO VALIDO!. Intente de Nuevo!\n");
			}
			
			if ( cont > 3 ) 
			{
				sigue = false;
			}			
		}		
	}
	
	public void ValidarRectangulo() 
	{
		int cat = (int)Math.pow(catetoA, 2) + (int)Math.pow(catetoB, 2);
		int hipo = (int)Math.pow(Hipotenusa, 2);
//		double cat = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
//		double hipo = Math.pow(Hipotenusa, 2);
		
		System.out.printf("\nHipotenusa: %d\nCatetoA: %d\nCatetoB: %d\n",Hipotenusa,catetoA, catetoB);
//		System.out.printf("\nH^2: %.1f\nCA^2: %.1f\n",hipo,cat);
		System.out.printf("\nH^2: %d\nCA^2: %d\n",hipo,cat);
		if ( cat == hipo ) 
		{
			System.out.println("\n\t\t\"¡SI PUEDE SER UN TRIANGULO RECTANGULO!\"");
		}
		else
		{
			System.out.println("\n\t\t\"¡NO PUEDE SER UN TRIANGULO RECTANGULO!\"");
		}
		
	}
	
	
}
