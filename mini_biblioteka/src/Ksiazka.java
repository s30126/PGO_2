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

    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }

    public void wypiszInfo() {
        System.out.println("Tytuł: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Liczba stron: " + liczbaStron);
        System.out.println("Dostępna?: " + dostepna);
    }

    public boolean wypozycz() {
        if(dostepna) {
            dostepna = false;
        }
        return dostepna;
    }

    public boolean zwroc() {
        if(dostepna == false) {
            dostepna = true;
        }
        return dostepna;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", liczbaStron=" + liczbaStron +
                ", dostepna=" + dostepna +
                '}';
    }
}