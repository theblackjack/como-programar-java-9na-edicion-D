import java.util.Scanner;


public class Reservaciones 
{
	boolean[] asientos = new boolean[11];
	enum Estado { DISPONIBLE, AGOTADO};
	
	public void Procesar() 
	{
		Scanner lee = new Scanner(System.in);
		int clase = 0;
		int puesto = 0;
		boolean sigue = true ;
					
		do 
		{
			System.out.print("\nIndique su preferencia: (1)PRIMERA CLASE - (2)ECONOMICA : ");
			clase = lee.nextInt();
			
			if ( clase == 1 || clase == 2 ) 
			{
				if (  Disponibilidad(clase) ) 
				{
					puesto = AsignarAsiento(clase);
					MostrarVoletos(clase, puesto);					
				}
				else 
				{
					System.out.printf("\n\t\t%s\n","Lo sentimos! Puestos Agotados.");
					
					if ( clase == 1 ) 
					{
						clase = 2;
					} 
					else 
					{
						clase = 1;
						
					}	// fin if ( clase == 1 )
					
					if ( Disponibilidad(clase) ) // si hay puestos en la "otra clase" pregunta: 
					{
						System.out.printf("\n\nDesea reservar en Clase %s? (1)SI -(2)NO : ",
								clase==1?"PRIMERA CLASE":"ECONOMICA");
						int rsp = lee.nextInt();					
						if ( rsp == 1 ) 
						{
							puesto = AsignarAsiento(clase);
							MostrarVoletos(clase, puesto);														
						}	
						else 
						{						
							sigue = false;	// no hay asientos en ninguna clase
							
						}	// if ( Disponibilidad(clase) )					
					}
					else 
					{
						System.out.printf("\n\t\tReservaciones Agotadas. El Proximo vuelo sale en 3 horas!\n");
						sigue = false;	// no quiso reservar en la otra clase
						
					}	// fin if ( rsp == 1 )					
				}	
				
				if (sigue) 	// si es "true" es porque aun quedan asientos o "si" quiso reservar en otra clase
				{
					System.out.print("\n\nDesea hacer otra reservacion? (1)SI -(2)NO : ");
					int rsp = lee.nextInt();
					if ( rsp == 2 ) 
					{
						sigue = false;
					}					
				}	//	if (sigue)
			}
			else 
			{
				System.out.println("\nOpcion Invalida. Reintente\n");
			}
			
			System.out.println();
			
			
		} while ( sigue );			

	}	//	Procesar()
	
	public boolean Disponibilidad( int clase ) 
	{
//		System.out.println("\n\nin Disponibilidad\n\n");
		
		int inicio = 1;
		int tope = 0;
		boolean disponible = false;
		boolean sigue = true;
		
		
		if ( clase == 2 ) 
		{
			inicio = 6;			
		}		
				
		tope = inicio+4;
		
		do 
		{			
			if ( asientos[inicio] == false ) 
			{
				disponible = true;
				sigue = false;
			}
			else 
			{
				if ( inicio == tope ) 
				{
					sigue = false;
				}
				else 
				{
					inicio++;
				}				
			}
						
//			System.out.printf("\nInicio: %d",inicio);
			
		} while ( sigue == true );
				
		return disponible;
		
	} // fin disponibilidad
		
	public int AsignarAsiento( int clase ) 
	{
//		System.out.println("\n\nin asignar\n\n");
		int lugar = 0;
		int inicio = 0;

		if ( clase == 1 ) 
		{
			inicio = 1;
		}	
		else 
		{
			inicio = 6;
		}	
				
		for (int i = inicio; i <= inicio+4; i++) 
		{
			if ( asientos[i] == false ) 
			{
				asientos[i] = true;
				lugar = i;
				break;
				
			}	// fin if
			
		}	// fin for
		
		return lugar;
	}
	
	public void MostrarVoletos( int c, int a ) 
	{
		System.out.printf("\n%15s\n%25s %s\n%25s %d\n",
				"Boleto de Vuelo:",
				"Clase:",c==1?"Primera Clase":"Economica",
				"Nro. Asiento:",a);		
	}
	

}
