package app;

public class Muistipiiri implements Laiteosa{

	private int hinta;
	private String nimi;
	
	public Muistipiiri(int hinta, String nimi) {
		this.hinta = hinta;
		this.nimi = nimi;
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
	public void lisaaHintaKokonaishintaan(Laiteosa lisattava) {
		System.out.println("Lisättiin "+ lisattava.getNimi() +", hinta "+ lisattava.getHinta());
		KokonaisHintaSingleton.getInstance().kasvataKokonaisHintaa(lisattava.getHinta());
		System.out.println("Kokonaishinta nyt: "+ getNykyinenKokonaishinta());
		
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
