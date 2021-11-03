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
			d = new Disciplina(A,A);
			d.Notas();
			A.CalculaMedia(d);
			A.MudaSituacao(d);
			d.Media();
			break;
		case 2:
			Media_Geometrica G = new Media_Geometrica();
			d = new Disciplina(G,G);
			d.Notas();
			G.CalculaMedia(d);
			G.MudaSituacao(d);
			d.Media();
			break;
		default:
			System.out.println("Tente novamente!");
		}
	}
}