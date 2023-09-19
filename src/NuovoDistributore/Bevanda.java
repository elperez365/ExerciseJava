package NuovoDistributore;

public class Bevanda {

	private String nome;
	private double prezzo;
	private String codice;

	public Bevanda(String nome, String codice, double prezzo) {
		this.nome = nome;
		this.codice = codice;
		this.prezzo = prezzo;
	}

	public String getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

}
