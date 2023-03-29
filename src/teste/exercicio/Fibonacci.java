package teste.exercicio;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int user, pre1, pre2, atual;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite número:");
		user = sc.nextInt();
		
		for(pre1=0, pre2=1, atual=0; atual <= user; atual=pre1+pre2){
			if(atual == user) {
				System.out.println("Número pertence a sequencia de fibonacci.");
				return ;
			}
			pre1 = pre2;
			pre2 = atual;
		}
		
		System.out.println("Número não pertence a sequencia de fibonacci.");
		
		sc.close();
	}

}
