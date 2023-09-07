package operai;

import java.util.List;

public class Progetto {

	private String nome;
	private int budget;
	private String citt�;
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

	public String getCitt�()
	{
		return citt�;
	}

	public void setCitt�(String citt�)
	{
		this.citt� = citt�;
	}

	public List<Impiegato> getPartecipanti() {
		return partecipanti;
	}

	public void setPartecipanti(List<Impiegato> partecipanti) {
		this.partecipanti = partecipanti;
	}

}
