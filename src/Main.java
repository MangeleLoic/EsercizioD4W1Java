//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dipendente[] dipendenti = new Dipendente[3];


        dipendenti[0] = new DipendenteFullTime(1900, Dipartimento.PRODUZIONE);
        dipendenti[1] = new dipendentePartTime(12.5, 110, Dipartimento.VENDITE);
        dipendenti[2] = new Dirigente(2600, Dipartimento.AMMINISTRAZIONE);


        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola());
            dipendente.calculateSalary();
        }
    }
}

