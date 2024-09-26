public class Volontario implements CheckIn {
    private String nome;
    private int eta;
    private String cv;


    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }


    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Check-In Volontario:");
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + eta);
        System.out.println("CV: " + cv);
    }
}
