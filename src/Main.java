//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Object[] impiegati = new Object[5];


        impiegati[0] = new DipendenteFullTime(1900, Dipartimento.PRODUZIONE);
        impiegati[1] = new dipendentePartTime(12.5, 110, Dipartimento.VENDITE);
        impiegati[2] = new Dirigente(2600, Dipartimento.AMMINISTRAZIONE);
        impiegati[3] = new Volontario("Marco", 25, "cv di Marco Rossi");
        impiegati[4] = new Volontario("Davide", 22, "cv di Davide Bianchi");


        for (Object participant : impiegati) {
            if (participant instanceof CheckIn) {
                ((CheckIn) participant).checkIn();
                if (participant instanceof Dipendente) {
                    ((Dipendente) participant).calculateSalary();
                }
                System.out.println();
            }
        }
    }
}

