package Persona;

public class Persona {

	private String nome;
	private String cognome;
	private String indirizzo;
	private int numTel;

	// costruttore come dovrebbe essere, generato da eclipse
	// public Persona(String nome, String cognome, String indirizzo, int numTel) {
	// super();
	// this.nome = nome;
	// this.cognome = cognome;
	// this.indirizzo = indirizzo;
	// this.numTel = numTel;
	// }

	public Persona(String n, String c) {
		nome = n;
		cognome = c;
	}

	public Persona() {
	}

	public Persona(String n, String c, String i, int num) {
		nome = n;
		cognome = c;
		indirizzo = i;
		numTel = num;
	}

	// come dovrebbe essere
	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// Persona other = (Persona) obj;
	// if (cognome == null) {
	// if (other.cognome != null)
	// return false;
	// } else if (!cognome.equals(other.cognome))
	// return false;
	// if (indirizzo == null) {
	// if (other.indirizzo != null)
	// return false;
	// } else if (!indirizzo.equals(other.indirizzo))
	// return false;
	// if (nome == null) {
	// if (other.nome != null)
	// return false;
	// } else if (!nome.equals(other.nome))
	// return false;
	// if (numTel != other.numTel)
	// return false;
	// return true;
	// }

	@Override
	// equals semplificato per chi si avvicina alla programmazione
	public boolean equals(Object obj) {
		Persona other = (Persona) obj;

		if (nome.equals(other.getNome()) && cognome.equals(other.getCognome()) && indirizzo.equals(other.getIndirizzo())
				&& numTel == other.getNumTel())

			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", numTel=" + numTel
				+ "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public static void main(String[] args) {

		Persona p = new Persona("Pippo", "disney", "viaa", 38983);

		Persona p1 = new Persona("Pippo", "disney", "viaa", 38983);

		System.out.println(p);

		System.out.println(p.equals(p1));// true

		p.setCognome("Rossi");
		System.out.println(p.equals(p1));// false

	}
}
