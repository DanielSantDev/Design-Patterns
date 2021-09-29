package b_facade;

/*FACADE � um padr�o de projeto estrutural que fornece uma interface simplificada
 *para uma biblioteca, um framework, ou qualquer conjunto complexo de classes.
 *
 *Uma fachada � uma classe que fornece uma interface simples para um subsistema
 *complexo que cont�m muitas partes que se movem. */

public class Combo {
	
	private PratoPrincipal PratoP;
	private Item item;
	
	public Combo() {
		this.PratoP = new PratoPrincipal();
		this.item = new Item();
	}
	
	//m�todo que cria combos
	public void MontarCombo() {
		
		PratoP.Adicionar();
		PratoP.MostrarItens();
		PratoP.Remover();
	}
	
	public void ItemsCombo() {
		item.AdicionarBebida();
		item.AdicionarSobremesa();
	}

}
