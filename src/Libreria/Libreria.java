package Libreria;

import java.util.Iterator;

public class Libreria {
	private Libro[] lista = new Libro[10];

	public Libreria(Libro[] r) {
		lista = r;
	}

	public Libro[] ricerca(String a, int k) {
		Libro[] res = new Libro[10];
		int pos = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null && lista[i].getAutore().equals(a) && lista[i].getPrezzo() > k) {
				res[pos] = lista[i];
				pos++;
			}
		}
		return res;
	}

	public String[] ricercaPerAutore(String a) {
		String[] res = new String[10];
		int pos = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null && lista[i].getAutore().equals(a)) {
				res[pos] = lista[i].getTitolo();
				pos++;
			}
		}
		return res;
	}

	public static void main(String[] args) {

		Libro l = new Libro("divina commedia", "Dante", 30);
		Libro l1 = new Libro("decamerone", "Dante", 30);
		Libro l2 = new Libro("divina commedia due", "Foscolo", 30);
		Libro l3 = new Libro("divina commedia tre", "Dante", 10);
		Libro[] lis = new Libro[10];
		lis[0] = l;
		lis[1] = l1;
		lis[2] = l2;
		lis[3] = l3;

		Libreria lib = new Libreria(lis);

		// Libro[] r = lib.ricerca("Dante", 15);
		// for (int i = 0; i < r.length; i++) {
		// if(r[i] != null)
		// System.out.println(r[i].getTitolo());
		// }

		String[] r = lib.ricercaPerAutore("Dante");
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null)
				System.out.println(r[i]);
		}

	}
}
