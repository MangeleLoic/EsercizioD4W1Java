public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(double stipendio, Dipartimento dipartimento) {
        super(stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {

        double salary = getStipendio();
        System.out.println("Il salario di un dipendente full-time è: " + salary + "€");
    }
}
