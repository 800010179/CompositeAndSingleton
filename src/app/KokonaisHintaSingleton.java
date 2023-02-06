package app;



public final class KokonaisHintaSingleton {
	
	private static KokonaisHintaSingleton instanssi;
	private int kokonaishinta;
	private KokonaisHintaSingleton() {
		kokonaishinta = 0;
	}
	
	public static KokonaisHintaSingleton getInstance() {
		if(instanssi == null) {
			instanssi = new KokonaisHintaSingleton();
		}
		return instanssi;
	}
	
	public void kasvataKokonaisHintaa(int lisattava) {
		kokonaishinta += lisattava;
	}
	
	public int getKokonaisHinta() {
		return kokonaishinta;
	}
}
