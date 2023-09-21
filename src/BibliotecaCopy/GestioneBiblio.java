package BibliotecaCopy;

public class GestioneBiblio {
    public static void main(String[] args) {
        Libro l1 = new Libro("Il signore degli anelli", "Tolkien");
        Libro l2 = new Libro("Storia di un enigma", "Alan Turing");
        Libro l3 = new Libro("Una biografia non autorizzata", "Bill Gates");
        Libro l4 = new Libro("Il business diverte", "Richard Branson");
        Libro l5 = new Libro("Gli inventori di Google", "Sergey Brin e Larry Page");
        Libro l6 = new Libro("La mia vita", "Steve Jobs");
        Libro l7 = new Libro("Facebook. La Storia", "Mark Zuckerberg");
        Libro l8 = new Libro("Tesla, SpaceX e la sfida per un futuro fantastico", "Elon Musk");

        Biblioteca b = new Biblioteca(3, 30, 6, 10);
        b.addLibro(l8, 1, "SC1", 1);
        b.addLibro(l7, 1, "SC1", 1);
        b.addLibro(l6, 1, "SC1", 4);
        b.addLibro(l5, 1, "SC1", 1);
        b.addLibro(l4, 1, "SC1", 2);
        b.addLibro(l3, 1, "SC1", 2);
        b.addLibro(l2, 1, "SC1", 2);
        b.addLibro(l1, 1, "SC1", 3);

        System.out.println();
        System.out.println();

        System.out.println(b.getLibri(1, "SC1"));
        // System.out.println(l1);
        System.out.println("provo il metodo cerca");
        System.out.println(b.cerca("Tolkien", "Il signore degli anelli"));

        System.out.println();
        System.out.println("provo il metodo contiene");
        System.out.println(b.contiene(1, "SC1", 1, l8));
    }
}
