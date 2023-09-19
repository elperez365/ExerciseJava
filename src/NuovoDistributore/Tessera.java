package NuovoDistributore;

public class Tessera {

	private int codice;
	private double credito;

	public Tessera(int codice, double credito) {
		this.codice = codice;
		this.credito = credito;
	}

	public int getCodice() {
		return codice;
	}

	public double getCredito() {
		return credito;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
}
