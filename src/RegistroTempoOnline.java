/**
 * Representação da quantidade de horas online dedicadas pelo estudante aos afazeres de uma disciplina remota.
 * O estudante precisa atingir a meta de tempo online definida para a disciplina. Caso não exista uma meta definida
 * para a disciplina, o esudante deve cumprir a meta padrão de 120 horas.
 *
 * @author João Carlos Cavalcante de Almeida Padilha
 */

public class RegistroTempoOnline {
    /** Nome da disciplina monitorada. */
    private final String nomeDisciplina;
    /** Horas de tempo online acumuladas na disciplina. */
    private int tempoOnline;
    /** Meta em horas de tempo online esperada para a disciplina. */
    private final int metaTempoOnline;
    /** Meta em horas de tempo online esperada por padrão. */
    private static final int META_PADRAO = 120;

    /**
     * Constrói o registro de tempo online para uma disciplina assumindo a meta padrão de 120 horas.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.metaTempoOnline = META_PADRAO;
    }

    /**
     * Constrói o registro de tempo online com o nome da disciplina e uma meta de horas específica.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param metaTempoOnline a meta em horas a ser atingida
     */
    public RegistroTempoOnline(String nomeDisciplina,int metaTempoOnline) {
        this.nomeDisciplina = nomeDisciplina;
        this.metaTempoOnline = metaTempoOnline;
    }

    /**
     * Adiciona horas de tempo online dedicadas à disciplina.
     *
     * @param tempoOnline a quantidade de horas a ser somada
     */
    public void adicionaTempoOnline(int tempoOnline) {
        this.tempoOnline += tempoOnline;
    }

    /**
     * Verifica se a quantidade de tempo online investida atingiu ou ultrapassou a meta esperada.
     *
     * @return true se a meta foi atingida, false caso contrário
     */
    public boolean atingiuMetaTempoOnline() {
        return (tempoOnline >= metaTempoOnline);
    }

    /**
     * Retorna a String que representa o registro de tempo online.
     * A representação segue o formato "NOME DA DISCIPLINA horasUsadas/horasEsperadas".
     *
     * @return a representação em String do registro de tempo online
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.metaTempoOnline;
    }

}
