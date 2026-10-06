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
    private final String nomeDisciplina;
    /** Horas de estudo acumuladas na disciplina. */
    private int horasEstudo;
    /** Array com as 4 notas do aluno na disciplina. */
    private final double[] notas;
    //** Quantidade padrão de notas por disciplina. */
    private static final int QTD_NOTAS = 4;

    /**
     * Constrói uma disciplina a partir do seu nome.
     * Toda disciplina começa com zero horas de estudo e 4 notas valendo 0.0.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[QTD_NOTAS];
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
     * Cadastra ou substitui uma das notas da disciplina (1, 2, 3 ou 4).
     *
     * @param nota a identificação da nota (de 1 a 4)
     * @param valorNota o valor numérico da nota recebida
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    /**
     * Calcula e retorna a média aritmética simples das 4 notas do aluno.
     *
     * @return a média das notas da disciplina
     */
    public double media() {
        double soma = 0.0;
        for(int i = 0; i < 4; i++) {
            soma += this.notas[i];
        }
        return (soma / 4);
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
     * Formata as notas de uma disciplina em uma única string
     * A representação segue o formato "[NOTA1, NOTA2, NOTA3, NOTA4]".
     *
     * @return a representação em String das notas
     */
    private String notasToString() {
        return "[" + this.notas[0] + ", " + this.notas[1] + ", " + this.notas[2] + ", " + this.notas[3] + "]";
    }

    /**
     * Retorna a String que representa a disciplina.
     * A representação segue o formato "NOME HORAS MEDIA [NOTA1, NOTA2, NOTA3, NOTA4]".
     *
     * @return a representação em String da disciplina
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + this.media() + " " + this.notasToString();
    }
}
