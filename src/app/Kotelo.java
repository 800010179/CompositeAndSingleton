package app;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {

	private int hinta;
	private String nimi;
	List<Laiteosa> laiteosaList = new ArrayList<Laiteosa>();
	
	public Kotelo(int hinta, String nimi) {
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
		if(laiteosa instanceof Kotelo) {
			throw new RuntimeException
			("Koteloon ei voi lisätä koteloa");
		}
		else {
			for(Laiteosa lo: laiteosaList) {
				if(lo instanceof Emolevy) {
					throw new RuntimeException
					("Kotelossa on jo emolevy");
				}
			}
			laiteosaList.add(laiteosa);
		}
		
		

	}

	@Override
	public void getLapset() {
		for(Laiteosa lo: laiteosaList) {
				if(lo instanceof Emolevy) {
					lo.getLapset();
				}
				else {
					lisaaHintaKokonaishintaan(lo);
				}
				
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
