package operai;

import java.util.List;

public class Progetto {

	private String nome;
	private int budget;
	private String città;
	private List<Impiegato> partecipanti;

	public Progetto(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}

	public List<Impiegato> getPartecipanti() {
		return partecipanti;
	}

	public void setPartecipanti(List<Impiegato> partecipanti) {
		this.partecipanti = partecipanti;
	}

}
