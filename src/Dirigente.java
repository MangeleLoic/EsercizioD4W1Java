public class Dirigente extends Dipendente{

    public Dirigente(double stipendio, Dipartimento dipartimento) {
        super(stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {

        double salary = getStipendio();
        System.out.println("Il salario di un dirigente è: " + salary + "€");
    }
}
