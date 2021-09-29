package a_singleton;

/*
 * O padr�o Singleton restringe a instancia��o de uma classe e garante que apenas 
 * uma inst�ncia da classe exista na m�quina virtual java. E essa classe singleton 
 * deve fornecer um ponto de acesso global para que voc� obtenha a inst�ncia dela.
 * 
 * 
 * Singleton normalmente � usado para logging, drivers objects, caching e cria��o 
 * de thread pool. Inclusive ele pode ser usado junto com outros padr�es como o 
 * Abstract Factory, Builder, Prototype, Facade e assim vai. Inclusive ele � usado
 * dentro do pr�prio core do Java em classes comojava.lang.Runtime,
 * java.awt.Desktop.
 * 
 * 
 * */

public class Fila {
	
	static private Fila instance = null;
	
	private Fila() {
	}
	
	/*M�todo est�tico p�blico que retorna a inst�ncia da classe, este � o ponto de
	 *acesso global para o mundo externo para obter a inst�ncia da classe singleton.*/
	public static Fila getFila() {
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
	}

}
