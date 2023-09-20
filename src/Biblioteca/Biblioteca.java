
package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

  ArrayList<Piano> piani = new ArrayList<Piano>();
  int nLibriPerRipiano;

  /**
   * Costruisce un oggetto bibioteca con 3 piani,
   * 30 scaffali per piano, 6 ripiani per scaffale
   * ciascuno con posto per 10 libri
   */

  public Biblioteca(int nPiani, int nScaffaliPerPiano, int nRipianiPerScaffale, int nLibriPerRipiano) {

    for (int i = 1; i <= nPiani; i++) {
      Piano piano = new Piano();
      piani.add(piano);
      for (int j = 1; j <= nScaffaliPerPiano; j++) {
        Scaffale scaffale = new Scaffale();
        piano.scaffali.put("SC" + j, scaffale);
        for (int k = 1; k <= nRipianiPerScaffale; k++) {
          Ripiano ripiano = new Ripiano();
          scaffale.ripiani.put("ripiano" + k, ripiano);

        }
      }
    }

    this.nLibriPerRipiano = nLibriPerRipiano;
  }

  /**
   * Aggiunge il libro specificato nel ripano, scaffale
   * e piano specificati.
   * 
   * @return <code>true</code> se l'inserimento � andato a buon fine
   */
  public boolean addLibro(Libro libro, int piano, String scaffale, int ripiano) {
    String ripianoVero = "ripiano" + ripiano;
    ArrayList<Libro> libri = piani.get((piano - 1)).scaffali.get(scaffale).ripiani.get(ripianoVero).libri;

    if (libri.size() == this.nLibriPerRipiano) {
      return false;
    } else {
      libri.add(libro);
      return false;
    }

  }

  /**
   * Verifica se il libro specificato si trova al
   * ripiano, scaffale e piano dati
   * 
   * @return <code>true</code> se il libro � presente
   */
  public boolean contiene(int piano, String scaffale, int ripiano, Libro libro) {
    String ripianoVero = "ripiano" + ripiano;
    ArrayList<Libro> libri = piani.get((piano - 1)).scaffali.get(scaffale).ripiani.get(ripianoVero).libri;
    for (Libro libro2 : libri) {
      if (libro2.equals(libro)) {
        return true;
      }
    }

    return false;
  }

  /**
   * Restituisce l'elenco dei libri contenuti in uno scaffale
   * Per ogni ripiano nella stringa compare l'indicazione del
   * ripiano nella forma "Ripiano 1" seguito, nelle righe
   * successive dai libri contenuti nel ripiano.
   */
  public String getLibri(int piano, String scaffale) {

    Scaffale scaffaleFound = piani.get((piano - 1)).scaffali.get(scaffale);
    String stampaScaffale = scaffaleFound.toString() + "\n";
    return stampaScaffale;
  }

  /**
   * Ricerca un libro inserito nella biblioteca in base
   * a autore e titolo. Se uno dei due � <code>null</code>
   * la ricerca viene fatta solo su un parametro.
   * 
   * @return il libro ricercata o <code>null</code> se
   *         non � stato trovato alcun libro
   */
  public Libro cerca(String autore, String titolo) {
    for (Piano piano : piani) {
      for (Scaffale scaffale : piano.scaffali.values()) {
        for (Ripiano ripiano : scaffale.ripiani.values()) {
          for (Libro libro : ripiano.libri) {
            if (autore != null && titolo != null) {
              if (libro.getAutore().equals(autore) && libro.getTitolo().equals(titolo)) {
                return libro;
              }
            } else if (autore != null) {
              if (libro.getAutore().equals(autore)) {
                return libro;
              }
            } else if (titolo != null) {
              if (libro.getTitolo().equals(titolo)) {
                return libro;
              }
            }
          }
        }
      }
    }
    return null;
  }
}
