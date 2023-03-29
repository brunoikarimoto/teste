package teste.exercicio;

import java.util.Scanner;

public class InverteString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j, i;
		
		System.out.print("Digite uma string para inverter: ");
		String a = sc.nextLine();
		
		char[] aInvertido = new char[a.length()];
		
		for(i = a.length()-1, j = 0; i >= 0; i--, j++) {
			aInvertido[j] = a.charAt(i);
		}
		
		for(i = 0; i < aInvertido.length; i++) {
			System.out.print(aInvertido[i]);
		}
		
		sc.close();
	}

}
