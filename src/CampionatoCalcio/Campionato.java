package CampionatoCalcio;

import java.util.ArrayList;
import java.util.List;

public class Campionato {

	private String nome;
	private List<Squadra> squadre;
	private List<Partita> partite = new ArrayList<Partita>();

	public void infoSquadra(Squadra sq) {
		for (Partita partita : partite) {
			if (partita.getSquadraCasa().getNome().equals(sq.getNome())) {
				System.out.println(sq.getNome() + "-" + partita.getSquadraTrasferta().getNome() + ": giocata in casa");
			}
			if (partita.getSquadraTrasferta().getNome().equals(sq.getNome())) {
				System.out.println(sq.getNome() + "-" + partita.getSquadraCasa().getNome() + ": giocata in trasferta");
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Squadra> getSquadre() {
		return squadre;
	}

	public void setSquadre(List<Squadra> squadre) {
		this.squadre = squadre;
	}

	public List<Partita> getPartite() {
		return partite;
	}

	public void setPartite(List<Partita> partite) {
		this.partite = partite;
	}

	public static void main(String[] args) {
		Campionato c = new Campionato();
		c.setNome("calcio 2021-22");

		Partita p = new Partita();
		Squadra s = new Squadra();
		s.setNome("Juve");
		Squadra s1 = new Squadra();
		s1.setNome("Inter");
		p.setSquadraCasa(s);
		p.setSquadraTrasferta(s1);
		c.getPartite().add(p);

		Partita p1 = new Partita();
		Squadra s2 = new Squadra();
		s2.setNome("Campobasso");
		Squadra s3 = new Squadra();
		s3.setNome("Juve");
		p1.setSquadraCasa(s2);
		p1.setSquadraTrasferta(s3);
		c.getPartite().add(p1);

		Partita p2 = new Partita();
		Squadra s4 = new Squadra();
		s4.setNome("Campobasso");
		Squadra s5 = new Squadra();
		s5.setNome("Inter");
		p2.setSquadraCasa(s4);
		p2.setSquadraTrasferta(s5);
		c.getPartite().add(p2);

		c.infoSquadra(s);
	}
}
