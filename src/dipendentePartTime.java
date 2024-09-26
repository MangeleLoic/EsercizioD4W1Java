public class dipendentePartTime extends Dipendente {
    private int oreLavorate;
    private double tariffaOraria;

    public dipendentePartTime(double tariffaOraria, int oreLavorate, Dipartimento dipartimento) {
        super(tariffaOraria * oreLavorate, dipartimento);
        this.oreLavorate = oreLavorate;
        this.tariffaOraria = tariffaOraria;
    }

    @Override
    public void calculateSalary() {
        double salary = tariffaOraria * oreLavorate;
        System.out.println("Il salario di un dipendente part-time è: " + salary + "€ (Ore lavorate: " + oreLavorate + ")");
    }


    public int getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    public double getTariffaOraria() {
        return tariffaOraria;
    }

    public void setTariffaOraria(double tariffaOraria) {
        this.tariffaOraria = tariffaOraria;
    }
}

