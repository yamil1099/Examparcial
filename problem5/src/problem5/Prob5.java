package problem5;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner entrada = new Scanner(System.in) ;
			String palabra, palabraInv="" ;
			System.out.println("Ingrese una palabra:") ;
			palabra=entrada.nextLine() ;
			for(int i=0;i<palabra.length();i++) 
				palabraInv=palabraInv+palabra.charAt(i) ; 
				if(palabra==palabraInv)
					System.out.println("La palabra es un palindromo") ;
				 else 
					 System.out.println("La palabra no es un palindromo") ;

		}

	}
		

	


