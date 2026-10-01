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
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public double media() {
        double soma = 0.0;
        for(int i = 0; i < 4; i++) {
            soma += this.notas[i];
        }
        return (soma / 4);
    }

    public boolean aprovado() {
        return this.media() >= 7.0;
    }

    public String notasToString() {
        return "[" + this.notas[0] + ", " + this.notas[1] + ", " + this.notas[2] + ", " + this.notas[3] + "]";
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + this.media() + " " + this.notasToString();
    }
}
