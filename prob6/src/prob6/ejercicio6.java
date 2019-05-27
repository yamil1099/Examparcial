package prob6;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in) ;
		System.out.println("Ingrese el numero de elementos del conjunto:") ;
		int elem=entrada.nextInt();
		int [] conjunto =new int [elem] ;
		int [] mayor = new int [4] ;
		System.out.println("Ingrese los valores del conjunto:") ;
		for ( int i=0 ; i<elem ; i++) {
			conjunto[i] =entrada.nextInt() ;
		}
		int Pos = 0 ;
		int inicial = conjunto[0]*conjunto[1]*conjunto[2]*conjunto[3] ;
		for(int j=1 ;j<elem-3;j++) {
			int secundario =conjunto[j]*conjunto[j+1]*conjunto[j+2]*conjunto[j+3] ;
			if(inicial>=secundario ) {
			
		}
			else {
				inicial =secundario ;
				Pos = j ;
			}
		}
		mayor[0]=conjunto[Pos] ;
				mayor[1]=conjunto[Pos+1] ;
						mayor[2]=conjunto[Pos+2];
								mayor[3]=conjunto[Pos+3];
								System.out.println("El mayor producto de numeros consecutivos se obtiene de :\n") ;
								for(int x =0 ;x<4 ; x++) {
								System.out.println(mayor[x]) ;
								
				
			}

	}

}


