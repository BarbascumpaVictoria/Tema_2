package TaxCalculator.src;// Lectia 2, sarcina practica nr.3, Barbascumpa V.

public class Main {
    public static void main(String[] args) {

        InstructiaPentruCalculator CreamUnCalculator = new InstructiaPentruCalculator();
        CreamUnCalculator.price = 12.12;
        CreamUnCalculator.tax = 20.15;
        CreamUnCalculator.quantity = 10;
        CreamUnCalculator.MetodaMea();
    }
}
//3.	Creați un proiect Java cu denumirea TaxCalculator. Creați o clasă Java în interiorul
// proiectului. Definiți metoda main.  În metoda main definiți și inițializați următoarele variabile:
//        a.	price de tip double cu o oarecare valoare;
//        b.	tax de tip double cu o oarecare valoare;
//        c.	quantity de tip int cu o oarecare valoare;
//        d.	total de tip double cu valoarea 0;
//        e.	message de tip String cu următorul text: “I want to buy X shirt!”, unde în loc de
//        “X” va fi reprezentată valoarea din variabila quantity.
//
//        Afișați la consolă valoarea din variabila message. Calculați valoarea variabilei total
//        conform următoarei formule: price * quantity * tax.
//
//        Afișați la consolă valoarea variabilei total încadrată în următorul mesaj: “Total cost
//        with tax is: ” și valoarea din variabila total.
