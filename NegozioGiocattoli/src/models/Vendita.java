package models;

import java.util.ArrayList;
import java.util.List;

import InputScanner.InputScanner;

public class Vendita extends RegistroVendite {
	
	// lista dei giochi
	public List<Giocattolo> giocattoli = new ArrayList<Giocattolo>();
	
	
	Giocattolo gioco1 = new Giocattolo();
	Giocattolo gioco2 = new Giocattolo();
	Giocattolo gioco3 = new Giocattolo();
	Giocattolo gioco4 = new Giocattolo();
	Giocattolo gioco5 = new Giocattolo();
	//per riempire la lista di giocattoli e dare all'utente un po' di articoli da scegliere
	public void inserisciGiocattoli() {		
//		set attributi al mio gioco
//		inserimento gioco 1
		gioco1.setId(1L);
		gioco1.setNome("gioco 1");
		gioco1.setPrezzo(19.90);
		gioco1.setEtaConsigliata(12);
		//aggiunge il gioco alla lista
		giocattoli.add(gioco1);
//		inserimento gioco 2
		gioco2.setId(2L);
		gioco2.setNome("gioco-2");
		gioco2.setPrezzo(14.90);
		gioco2.setEtaConsigliata(98);
		//aggiunge il gioco alla lista
		giocattoli.add(gioco2);
//		inserimento gioco 3
		gioco3.setId(3L);
		gioco3.setNome("gioco-3");
		gioco3.setPrezzo(9.90);
		gioco3.setEtaConsigliata(8);
		//aggiunge il gioco alla lista
		giocattoli.add(gioco3);
//		inserimento gioco 4
		gioco4.setId(4L);
		gioco4.setNome("gioco-4");
		gioco4.setPrezzo(44.90);
		gioco4.setEtaConsigliata(4);
		//aggiunge il gioco alla lista
		giocattoli.add(gioco4);
//		inserimento gioco 5
		gioco5.setId(5L);
		gioco5.setNome("gioco-5");
		gioco5.setPrezzo(4.90);
		gioco5.setEtaConsigliata(10);
		//aggiunge il gioco alla lista
		giocattoli.add(gioco5);
		// stampa lista giocattoli
//		System.out.println(giocattoli);
	}
	
	//creare metodo per presentare lista all'utente
	public void leggiInventario() {
//		prova stampa inventario
		System.out.println("benvenuto nel negozio questi sono i giochi");
		System.out.println(giocattoli);
	}
	
	// creare metodo per vendere un gioco
	
	public void compraGiocattolo() {
		InputScanner.inputUtenteString("inserisci id gioco da comprare");
		
		// controllare se c'è nell'inventario 
		// se c'è rimuovere gioco e stampare specifiche
		// stampare prezzo
		// se utente conferma di volere il gioco fare giocattoli.remove(id passato dall'utente quando conferma di voler comprare il gioco)
		
	}
	
	
	
	
	
}
