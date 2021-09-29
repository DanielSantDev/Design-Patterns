package a_singleton;

public class Fila {
	static private Fila instance = null;
	
	private Fila() {
	}
	public static Fila getFila() {
        if (instance == null) {
            instance = new Fila();
        }
        return instance;
	}

}
