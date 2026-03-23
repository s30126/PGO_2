public class Ksiazka {

    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }

    public void wypiszInfo(Ksiazka ksiazka) {
        System.out.println("Tytuł: " + ksiazka.tytul);
        System.out.println("Autor: " + ksiazka.autor);
        System.out.println("Liczba stron: " + ksiazka.liczbaStron);
        System.out.println("Dostępna?: " + ksiazka.dostepna);
    }

    public boolean wypozycz(Ksiazka ksiazka) {
        if(dostepna) {
            dostepna = false;
        }
        return dostepna;
    }

    public boolean zwroc(Ksiazka ksiazka) {
        if(dostepna == false) {
            dostepna = true;
        }
        return dostepna;
    }



}