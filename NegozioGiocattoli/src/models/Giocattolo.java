package models;

public class Giocattolo {
	private Long id;
	private String nome;
	private Double prezzo;
	private int etaConsigliata;
	
	public Giocattolo() {
		
	}

//	public Giocattolo(Long id, String nome, Double prezzo, int etaConsigliata) {
//		super();
//		this.id = id;
//		this.nome = nome;
//		this.prezzo = prezzo;
//		this.etaConsigliata = etaConsigliata;
//	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}


	public int getEtaConsigliata() {
		return etaConsigliata;
	}


	public void setEtaConsigliata(int etaConsigliata) {
		this.etaConsigliata = etaConsigliata;
	}


	@Override
	public String toString() {
		return "Giocattolo [id=" + id + ", nome=" + nome + ", prezzo=" + prezzo + ", etaConsigliata=" + etaConsigliata
				+ "]";
	}
		
}
