package c_strategy;

public class Media_Geometrica implements ICalcMedia,IMudaSituacao {

	//considerar como aprovados os casos onde a média for superior a 7,0.
	
	@Override
	public void MudaSituacao(Disciplina d) {
		// TODO Auto-generated method stub
		if(d.getMedia() > 7) {
			System.out.println("Aprovado!");
			d.setSituacao("Aprovado!");
		}else {
			System.out.println("Reprovado!");
			d.setSituacao("Reprovado!");
		}
	}

	@Override
	public void CalculaMedia(Disciplina d) {
		// TODO Auto-generated method stub
		d.setMedia(Math.sqrt(d.getP1()+d.getP2()));
	}
	
}
