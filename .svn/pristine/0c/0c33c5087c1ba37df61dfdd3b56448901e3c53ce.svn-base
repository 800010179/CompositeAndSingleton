package app;

public class Main {

	public static void main(String[] args) {
		//Nyt vasta tajusin, että hinnat kannattaisi olla Doubleja...
		Laiteosa kotelo = new Kotelo(50, "kotelo");
		Laiteosa emolevy = new Emolevy(100, "emolevy");
		Laiteosa muistipiiri1 = new Muistipiiri(30, "muistipiiri1");
		Laiteosa muistipiiri2 = new Muistipiiri(20, "muistipiiri2");
		Laiteosa näytönohjain = new Näytönohjain(499, "näytönohjain");
		Laiteosa prosessori = new Prosessori(124, "prosessori");
		Laiteosa verkkokortti = new Verkkokortti(20, "verkkokortti");
		
		
		emolevy.lisaaOsa(muistipiiri1);
		emolevy.lisaaOsa(muistipiiri2);
		emolevy.lisaaOsa(näytönohjain);
		emolevy.lisaaOsa(prosessori);
		emolevy.lisaaOsa(verkkokortti);
		kotelo.lisaaOsa(emolevy);
		
		//Getlapset siis käy lisäämässä kotelon lapsien hinnat kokonaishintaan, 
		//jos kotelossa on emolevy, niin käydään sen lapset lisäämässä ensin,
		//sitten emolevy ja lopuksi kotelon hinta
		kotelo.getLapset();
		
		//Seuraavista lisäyksistä tapahtuisi virhe
		//Laiteosa emolevy2 = new Emolevy(100, "emolevy");
		//kotelo.lisaaOsa(kotelo);
		//kotelo.lisaaOsa(emolevy2);
		//muistipiiri1.lisaaOsa(muistipiiri2)
		
		//muutos
	}

}
