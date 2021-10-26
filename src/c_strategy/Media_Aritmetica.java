package c_strategy;

public class Media_Aritmetica implements ICalcMedia,IMudaSituacao {
	
	//considerar como aprovados os casos nos quais a média for superior a 5,0

	@Override
	public void MudaSituacao(Disciplina d) {
		// TODO Auto-generated method stub
		if(d.getMedia() > 5)
			System.out.println("Aprovado!");
		else
			System.out.println("Reprovado!");
	}

	@Override
	public void CalculaMedia(Disciplina d) {
		// TODO Auto-generated method stub
		d.setMedia( (d.getP1() + d.getP2() ) / 2);
	}

}
