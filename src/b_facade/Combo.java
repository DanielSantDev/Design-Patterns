package b_facade;

/*FACADE é um padrão de projeto estrutural que fornece uma interface simplificada
 *para uma biblioteca, um framework, ou qualquer conjunto complexo de classes.
 *
 *Uma fachada é uma classe que fornece uma interface simples para um subsistema
 *complexo que contém muitas partes que se movem. */

public class Combo {
	
	private PratoPrincipal PratoP;
	private Item item;
	
	public Combo() {
		this.PratoP = new PratoPrincipal();
		this.item = new Item();
	}
	
	//método que cria combos
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
