package app;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

	private int hinta;
	private String nimi;
	List<Laiteosa> laiteosaList = new ArrayList<Laiteosa>();
	
	public Emolevy(int hinta, String nimi) {
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
		if(laiteosa instanceof Emolevy || laiteosa instanceof Kotelo) {
			throw new RuntimeException
			("Emolevyyn ei voi lisätä emolevyä eikä koteloa");
		}
		else {
			laiteosaList.add(laiteosa);
		}
		
		

	}

	@Override
	public void getLapset() {
		for(Laiteosa lo: laiteosaList) {
				lisaaHintaKokonaishintaan(lo);
		}
		lisaaHintaKokonaishintaan(this);
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
