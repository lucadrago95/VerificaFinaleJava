package models;

import java.util.ArrayList;
import java.util.List;

public class Vendita extends RegistroVendite {
	
	public List<Giocattolo> giocattoli = new ArrayList<Giocattolo>();
	
	Giocattolo gioco1 = new Giocattolo();
	
	//prima prova metodo implementato da classe astratta
	public void leggiGiocattolo(String nome) {
		gioco1.setId(1L);
		gioco1.setNome("gioco 1");
		gioco1.setPrezzo(19.90);
		gioco1.setEtaConsigliata(12);
		
		System.out.println(gioco1);
	}
	
	
	
}
