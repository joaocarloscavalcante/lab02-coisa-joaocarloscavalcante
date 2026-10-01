/**
 * Representação de uma Disciplina na qual o estudante esteja matriculado.
 * O estudante necessita atingir a nota mínima de 7.0 pontos para que seja aprovado na disciplina.
 * A nota de cada disciplina é definida pela média aritmética entre 4 notas avaliativas
 * (sem arredondamento), sendo elas substituíveis após uma definição anterior.
 * Cada disciplina possui também um total de horas cumulativas de estudo.
 *
 * @author João Carlos Cavalcante de Almeida Padilha
 */
public class Disciplina {
    /** Nome da discipliina **/
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
