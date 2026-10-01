/**
 * Representação da quantidade de horas online dedicadas pelo estudante aos afazeres de uma disciplina remota.
 * O estudante precisa atingir a meta de tempo online definida para a disciplina. Caso não exista uma meta definida
 * para a disciplina, o esudante deve cumprir a meta padrão de 120 horas.
 *
 * @author João Carlos Cavalcante de Almeida Padilha
 */
public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int metaTempoOnline;
    private final int META_PADRAO = 120;

    // Construtor 1
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.metaTempoOnline = META_PADRAO;
    }

    // Construtor 2
    public RegistroTempoOnline(String nomeDisciplina,int metaTempoOnline) {
        this.nomeDisciplina = nomeDisciplina;
        this.metaTempoOnline = metaTempoOnline;
    }

    // Demais Métodos
    public void adicionaTempoOnline(int tempoOnline) {
        this.tempoOnline += tempoOnline;
    }

    public boolean atingiuMetaTempoOnline() {
        if(tempoOnline >= metaTempoOnline) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.metaTempoOnline;
    }

}
