public class Main {
    public static void main(String[] args) {

        //Zadanie 1

        Ksiazka ksiazka1 = new Ksiazka("Annihilation", "Jeff VanderMeer", 208, false);
        Ksiazka ksiazka2 = new Ksiazka("A Clash of Kings", "George R.R. Martin", 913, false);
        Ksiazka ksiazka3 = new Ksiazka("A Feast for Crows", "George R.R. Martin", 852, true);

        ksiazka3.wypiszInfo(ksiazka3);
        ksiazka3.wypozycz(ksiazka3);
        ksiazka3.wypiszInfo(ksiazka3);

        ksiazka1.wypiszInfo(ksiazka1);
        ksiazka1.zwroc(ksiazka1);
        ksiazka1.wypiszInfo(ksiazka1);



        /*Zadanie 2

        Czytelnik czytelnik1 = new Czytelnik("Jan", "Kowalski", 123, 1);
        Czytelnik czytelnik2 = new Czytelnik("Anna", "Nowak", 456, 5);

        czytelnik1.wypiszDane(czytelnik1);
        czytelnik1.zwiekszLiczbeWypozyczen(czytelnik1);
        czytelnik1.wypiszDane(czytelnik1);

        czytelnik2.wypiszDane(czytelnik2);
        czytelnik2.zmniejszLiczbeWypozyczen(czytelnik2);
        czytelnik2.wypiszDane(czytelnik2);

        */

        //Zadanie 3

        Biblioteka biblioteka1 = new Biblioteka(5);
        biblioteka1.dodajKsiazke(ksiazka1);
        biblioteka1.wypiszDostepneKsiazki();

    }
}