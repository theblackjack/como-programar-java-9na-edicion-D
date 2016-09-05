import java.util.Scanner;

/*
 * 2.33 - Pag 105 - Calculadora del Indice de Masa Corporal
 * 
 * */

public class IMC {

	public static void main(String[] args) {
		
		double peso;
		double altura;
		double imc = 0;
		
		Scanner lee = new Scanner(System.in); 
		System.out.print("Peso(Kg): ");		
		peso = lee.nextDouble();
		System.out.print("Altura(Mts): ");		
		altura = lee.nextDouble();
		imc = peso/(altura*altura);
		
		System.out.printf("\n%s %.2f\n","Su indice de masa corporal es:",imc);
		System.out.printf("\n%s","Valores BMI: ");
		System.out.printf("\n%s %.2f","Bajo Peso: Menos de ",18.5);
		System.out.printf("\n%s %.2f %s %.2f","Normal: entre ",18.5,"y",24.9);
		System.out.printf("\n%s %.2f %s %.2f","Sobrepeso: entre ",24.9,"y",29.9);
		System.out.printf("\n%s %d %s","Obeso: ",30,"o mas");
		
	}
	
}
