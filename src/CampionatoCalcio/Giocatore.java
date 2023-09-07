package CampionatoCalcio;

public class Giocatore {
	private String nome;
	private int annoNascita;
	private boolean capitano;

	public boolean isCapitano() {
		return capitano;
	}

	public void setCapitano(boolean capitano) {
		this.capitano = capitano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

}
