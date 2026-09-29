public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas = new double[4];

    // Construtor
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    // Demais Métodos
    public void cadastraHoras(int horas) {
        this.horasEstudo += horasEstudo;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota] = valorNota;
    }

    public double media() {
        double soma = 0.0;
        for(int i = 0; i < 4; i++) {
            soma += this.notas[i];
        }
        return (soma / 4);
    }

    public boolean aprovado() {
        if(this.media() >= 7.0) {
            return true;
        }
        return false;
    }

    public String notasToString() {
        return "[" + this.notas[0] + ", " +
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + this.media() + " " +
    }
}
