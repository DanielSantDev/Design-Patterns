package c_strategy;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Disciplina d = new Disciplina();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("1 - Media Aritmética");
		System.out.println("2 - Media Geometrica");
		int num = entrada.nextInt();
		
		switch(num) {
		case 1:
			Media_Aritmetica A = new Media_Aritmetica();
			A.CalculaMedia(d);
			A.MudaSituacao(d);
			A.CalculaMedia(d);
			break;
		case 2:
			Media_Geometrica G = new Media_Geometrica();
			G.CalculaMedia(d);
			G.MudaSituacao(d);
			G.CalculaMedia(d);
			break;
		default:
			System.out.println("Tente novamente!");
		}
	}
}
