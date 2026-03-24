import java.util.Arrays;

public class Biblioteka {

    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        for (int i = 0; i < ksiazki.length; i++) {
            ksiazki[i] = ksiazka;
        }
    }

    public void wypiszDostepneKsiazki() {
        for (Ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka);
        }
    }

    public void znajdzKsiazkePoTytule(String tytul) {

    }

    /*
    public int policzDostepneKsiazki() {

    }
    */

}
