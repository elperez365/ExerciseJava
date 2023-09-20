package NuovoDistributore;

public class Main {
	public static void main(String[] args) {

		Distributore d = new Distributore();
		Bevanda b = new Bevanda("Coca Cola", "A1", 1.5);
		Bevanda b2 = new Bevanda("Fanta", "A2", 1.5);
		Bevanda b3 = new Bevanda("Sprite", "A3", 1.5);

		Tessera t = new Tessera(1, 10);
		Tessera t2 = new Tessera(2, 20);
		Tessera t3 = new Tessera(3, 50);

		d.caricaTessera(t);
		d.caricaTessera(t2);
		d.caricaTessera(t3);

		d.leggiCredito(1);
		d.leggiCredito(2);
		d.leggiCredito(3);

		d.aggiungiBevanda(b);
		d.aggiungiBevanda(b2);
		d.aggiungiBevanda(b3);

		d.aggiornaColonna(1, "A1", 10);
		d.aggiornaColonna(2, "A2", 20);
		d.aggiornaColonna(3, "A3", 50);
		d.aggiornaColonna(4, "A1", 15);

		System.out.println("nome bevanda a1");
		System.out.println(d.getName("A1"));

		System.out.println("nome bevanda a2");
		System.out.println(d.getName("A2"));

		System.out.println("nome bevanda a3");
		System.out.println(d.getName("A3"));

		System.out.println("prezzo bevanda a1");
		System.out.println(d.getPrice("A1"));

		System.out.println("prezzo bevanda a2");
		System.out.println(d.getPrice("A2"));

		System.out.println("prezzo bevanda a3");
		System.out.println(d.getPrice("A3"));

		System.out.println("lattine disponibili a1");
		System.out.println(d.lattineDisponibili("A1"));

		System.out.println("lattine disponibili a2");
		System.out.println(d.lattineDisponibili("A2"));

		System.out.println("lattine disponibili a3");
		System.out.println(d.lattineDisponibili("A3"));

		System.out.println();
		System.out.println("credito tessera 1 prima di erogare");
		System.out.println(d.leggiCredito(1));

		System.out.println();
		System.out.println("Provo il comado eroga utilizzando il crditio della tessera 1");
		System.out.println("Il distributore eroga dalla colonna:");
		System.out.println(d.eroga("A2", 1));

		System.out.println();
		System.out.println("approvvigionamento aggiornato");
		System.out.println("lattine disponibili a1");
		System.out.println(d.lattineDisponibili("A1"));
		System.out.println("lattine disponibili a2");
		System.out.println(d.lattineDisponibili("A2"));
		System.out.println("lattine disponibili a3");
		System.out.println(d.lattineDisponibili("A3"));

		System.out.println("credito aggiornato tessera 1");
		System.out.println(d.leggiCredito(1));

	}
}