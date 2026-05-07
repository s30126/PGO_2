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
            System.out.println(ksiazka.getTytul());
        }
    }

    public void znajdzKsiazkePoTytule(String tytul) {
        for (Ksiazka k : ksiazki) {
            if (k.getTytul() == tytul) {
                System.out.println();
            }
        }
    }

    public int policzDostepneKsiazki() {
        int liczbaDostepnychKsiazek = 0;
        for (Ksiazka k : ksiazki) {
            if (k.isDostepna() == true) {
                liczbaDostepnychKsiazek++;
            }
        }
        return liczbaDostepnychKsiazek;
    }

}
