package a_singleton;

/*
 * O padrão Singleton restringe a instanciação de uma classe e garante que apenas 
 * uma instância da classe exista na máquina virtual java. E essa classe singleton 
 * deve fornecer um ponto de acesso global para que você obtenha a instância dela.
 * 
 * 
 * Singleton normalmente é usado para logging, drivers objects, caching e criação 
 * de thread pool. Inclusive ele pode ser usado junto com outros padrões como o 
 * Abstract Factory, Builder, Prototype, Facade e assim vai. Inclusive ele é usado
 * dentro do próprio core do Java em classes comojava.lang.Runtime,
 * java.awt.Desktop.
 * 
 * 
 * */

public class Fila {
	
	static private Fila instance = null;
	
	private Fila() {
	}
	
	/*Método estático público que retorna a instância da classe, este é o ponto de
	 *acesso global para o mundo externo para obter a instância da classe singleton.*/
	public static Fila getFila() {
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
	}

}
