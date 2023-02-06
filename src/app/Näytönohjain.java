package app;

public class Näytönohjain implements Laiteosa {

	private int hinta;
	private String nimi;
	
	public Näytönohjain(int hinta, String nimi) {
		this.hinta = hinta;
		this.nimi = nimi;
	}
	
	@Override
	public void lisaaHintaKokonaishintaan(Laiteosa lisattava) {
		System.out.println("Lisättiin "+ lisattava.getNimi() +", hinta "+ lisattava.getHinta());
		KokonaisHintaSingleton.getInstance().kasvataKokonaisHintaa(lisattava.getHinta());
		System.out.println("Kokonaishinta nyt: "+ getNykyinenKokonaishinta());
		
	}

	@Override
	public void lisaaOsa(Laiteosa laiteosa) {
		throw new RuntimeException
		("Tähän osaan ei voi lisätä muita osia!");
		

	}

	@Override
	public void getLapset() {
		throw new RuntimeException
		("Tällä osalla ei voi olla lapsia!");

	}

	@Override
	public int getHinta() {
		return hinta;
	}

	@Override
	public int getNykyinenKokonaishinta() {
		return KokonaisHintaSingleton.getInstance().getKokonaisHinta();
	}

	@Override
	public String getNimi() {
		// TODO Auto-generated method stub
		return nimi;
	}

}
