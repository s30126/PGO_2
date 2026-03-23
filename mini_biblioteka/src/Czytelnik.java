public class Czytelnik {

    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public void wypiszDane(Czytelnik czytelnik) {
        System.out.println("Imię: " + czytelnik.imie);
        System.out.println("Nazwisko: " + czytelnik.nazwisko);
        System.out.println("Numer karty: " + czytelnik.numerKarty);
        System.out.println("Liczba wypożyczeń: " + czytelnik.liczbaWypozyczen);
    }

    public int zwiekszLiczbeWypozyczen(Czytelnik czytelnik) {
        return liczbaWypozyczen++;
    }

    public int zmniejszLiczbeWypozyczen(Czytelnik czytelnik) {
        return liczbaWypozyczen--;
    }

}
