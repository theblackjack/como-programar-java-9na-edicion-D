
public class Equivalencias 
{
	public void procesar() 
	{
		
		System.out.println("\nTabla de Equivalencia entre Sistemas Numericos:\n");
		System.out.printf("\n%10s%20s%20s%20s\n",
				"Decimal:",
				"Binario:",
				"Octal:",
				"Hexadecimal:");
		
		for (int i = 1; i <= 256; i++) 
		{
			int bi2 = Binario(i);
			int oct = Octal(i);
			String hexa = Hexadecimal(i);
			System.out.printf("%10d%20d%20d%20s\n",i,bi2,oct,hexa);
		}		
	}
		
	public int Binario( int n ) 
	{
		String temp = "";
		int num_bi = 0;
		boolean sigue = true;
						
		if ( n == 1 ) 
		{
			temp += 1;
		} 
		else 
		{
			int exp = 0;
			int may_pot = 0;
			
			do 
			{
				may_pot = (int)Math.pow(2, exp);
				exp++;
				
			} while ( may_pot <= n ); // 1ra potencia mayor a n
						
			do 
			{	
				may_pot /= 2;	// potencia igual o menor a n
				
				if ( (n - may_pot) >= 0 ) // si cabe may_pot en n
				{
					temp += 1;
					n -= may_pot;	// actualizo el valor de n
					if ( n == 0 ) 
					{
						sigue = false;
					}
				}
				else 
				{
					temp += 0;
				}				
								
			} while (sigue);
			
			while ( may_pot / 2 != 0 ) 
			{
				temp += 0;
				may_pot /= 2;
			} 
		}				

		num_bi = Integer.parseInt(temp);
		return num_bi;
		
	}
	
	public int Octal( int n ) 
	{
		String temp = "";
		int num_oct = 0;
		boolean sigue = true;
						
		if ( n == 1 ) 
		{
			temp += 1;
		} 
		else 
		{
			int exp = 0;
			int may_pot = 0;
			
			do 
			{
				may_pot = (int)Math.pow(8, exp);
				exp++;
				
			} while ( may_pot <= n ); // 1ra potencia mayor a n
						
			do 
			{	
				may_pot /= 8;	// potencia igual o menor a n
				
				if ( (n / may_pot) >= 0 ) // si cabe may_pot en n
				{
					temp += n/may_pot;
					n %= may_pot;	// actualizo el valor de n
					if ( n == 0 ) 
					{
						sigue = false;
					}
				}
											
			} while (sigue);
			
			while ( may_pot / 8 != 0 ) 
			{
				may_pot /= 8;
				temp += 0;
			} 
		}				

		num_oct = Integer.parseInt(temp);
		return num_oct;			
	}
	
	public String Hexadecimal( int n ) 
	{
		String hexa = "";
		int resto = 0;
		boolean sigue = true;
		int valor = 0;
					
		do 
		{
			valor = n;
			int exp = 0;
			int may_pot = 0;
			
			do 
			{
				may_pot = (int)Math.pow(16, exp);
				exp++;
				
			} while ( may_pot <= valor ); // 1ra potencia mayor a n
						
			
			if (  may_pot >= 16 ) 
			{
				may_pot /= 16;	// potencia igual o menor a n
			}			

//			System.out.printf("\n\nVal: %d / Pot: %d\n\n",valor,may_pot);
			
			if ( (valor / may_pot) > 0 )
			{
				valor /= may_pot;
				
//				System.out.printf("Val: %d\n\n",valor);
				
				if ( valor > 0 && valor <= 15 ) 
				{		
					switch (valor) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
						hexa += valor;
						break;
					case 10:
						hexa += 'A';
						break;
					case 11:
						hexa += 'B';
						break;
					case 12:
						hexa += 'C';
						break;
					case 13:
						hexa += 'D';
						break;
					case 14:
						hexa += 'E';
						break;
					case 15:
						hexa += 'F';
						break;
					}					
				}
								
				resto = valor * may_pot; 
//				System.out.printf("Num: %d - Res: %d\n\n",n,resto);
				n = n - resto; 	// actualizo el valor de n
//				System.out.printf("Num: %d\n\n",n);				
			}
						
			if ( n <= 0 ) 
			{
				while ( may_pot/16 != 0 ) 
				{
					may_pot /= 16;
					hexa += 0;
				}
				sigue = false;				
			}			
			
		} while (sigue);	// 2do while		
				
		return hexa;
	}
	

}
