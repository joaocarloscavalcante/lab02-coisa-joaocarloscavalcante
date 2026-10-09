package lab2;

/**
 * Representação de uma disciplina na qual o estudante esteja matriculado.
 * O estudante necessita atingir a nota mínima de 7.0 pontos para que seja aprovado na disciplina.
 * A nota de cada disciplina é definida pela média aritmética entre as notas avaliativas
 * (sem arredondamento), sendo elas substituíveis após uma definição anterior.
 * Cada disciplina possui também um total de horas cumulativas de estudo.
 *
 * @author João Carlos Cavalcante de Almeida Padilha
 */

public class Disciplina {
    /** Nome da discipliina **/
    private final String nomeDisciplina;
    /** Horas de estudo acumuladas na disciplina. */
    private int horasEstudo;
    /** Array com as notas do aluno na disciplina. */
    private final double[] notas;
    /** Array com os pesos de cada nota da disciplina. */
    private double[] pesos;
    //** Quantidade padrão de notas por disciplina. */
    private static final int QTD_NOTAS_USUAL = 4;

    /**
     * Constrói uma disciplina a partir do seu nome.
     * Toda disciplina começa com zero horas de estudo e 4 notas valendo 0.0.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[QTD_NOTAS_USUAL];
    }

    public Disciplina(String nomeDisciplina, int qtdNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[qtdNotas];
    }

    public Disciplina(String nomeDisciplina, int qtdNotas, double[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[qtdNotas];
        this.pesos = pesos;
    }

    /**
     * Cadastra e acumula horas de estudo dedicadas à disciplina.
     *
     * @param horas a quantidade de horas a ser somada
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
     * Cadastra ou substitui uma das notas da disciplina.
     *
     * @param nota a identificação da nota
     * @param valorNota o valor numérico da nota recebida
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    /**
     * Calcula e retorna:
     *  - a média aritmética simples das notas, quando não há um array de pesos.
     *  - a média ponderada das notas, quando há um array de pesos;
     *
     * @return a média (aritmética ou ponderada) das notas da disciplina
     */
    public double media() {
        int qtdNotas = this.notas.length;
        if(this.pesos != null) {
            double somaPesos = 0.0;
            double somaPonderada = 0.0;
            for(int i = 0; i < qtdNotas; i++) {
                somaPesos += this.pesos[i];
                somaPonderada += (this.notas[i] * this.pesos[i]);
            }
            return (somaPonderada / somaPesos);
        }
        double soma = 0.0;
        for(int i = 0; i < qtdNotas; i++) {
            soma += this.notas[i];
        }
        return (soma / qtdNotas);
    }

    /**
     * Verifica se o aluno foi aprovado na disciplina.
     * Considera-se aprovado o aluno que alcança média maior ou igual a 7.0.
     *
     * @return true se o aluno foi aprovado, false caso contrário
     */
    public boolean aprovado() {
        return this.media() >= 7.0;
    }

    /**
     * Formata as notas de uma disciplina em uma única string.
     * A representação segue o formato "[NOTA1, NOTA2, NOTA3, ..., NOTA"N"]".
     * Método auxiliar para toString().
     *
     * @return a representação em String das notas
     */
    private String notasToString() {
        String notasFormatadas = "[";
        for(int i = 0; i < notas.length; i++) {
            if(i != notas.length - 1) {
                notasFormatadas += this.notas[i] + ", ";
            } else {
                notasFormatadas += this.notas[i] + "]";
            }
        }

        return notasFormatadas;
    }

    /**
     * Retorna a String que representa a disciplina.
     * A representação segue o formato "nomeDisciplina horasEstudo media [NOTA1, NOTA2, NOTA3, NOTA4]".
     *
     * @return a representação em String da disciplina
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + this.media() + " " + this.notasToString();
    }
}
