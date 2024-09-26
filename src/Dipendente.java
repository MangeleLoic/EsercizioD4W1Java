import java.util.Random;

public abstract class Dipendente {

    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;


    public Dipendente(double stipendio, Dipartimento dipartimento) {

        Random random = new Random();
        this.matricola = random.nextInt(111, 1000);
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract void calculateSalary();
}

