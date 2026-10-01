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
