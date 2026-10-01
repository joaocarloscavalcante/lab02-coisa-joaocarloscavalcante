public class RegistroResumos {
    private String[] resumos;
    private String[] temas;
    private int indiceAtual;
    private int quantidadeAtual;
    private final int quantidadeMaxima;

    // Construtor
    public RegistroResumos(int numeroDeResumos) {
        this.quantidadeMaxima = numeroDeResumos;
        this.resumos = new String[numeroDeResumos];
        this.temas = new String[numeroDeResumos];
        this.indiceAtual = 0;
        this.quantidadeAtual = 0;
    }

    // Demais Métodos
    public boolean temResumo(String tema) {
        for(int i = 0; i < this.quantidadeAtual; i++) {
            if(this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }

    public void adiciona(String tema, String resumo) {
        for(int i = 0; i < quantidadeAtual; i++) {
            if(this.temas[i].equals(tema)) {
                this.resumos[i] = resumo;
                return;
            }
        }

        this.temas[indiceAtual] = tema;
        this.resumos[indiceAtual] = resumo;

        this.indiceAtual = (this.indiceAtual + 1) % this.quantidadeMaxima;

        if(this.quantidadeAtual < this.quantidadeMaxima) {
            this.quantidadeAtual++;
        }

    }

    public String[] pegaResumos() {
        String[] resumos = new String[quantidadeAtual];
        for(int i = 0; i < quantidadeAtual; i++) {
            resumos[i] = this.temas[i] + ": " + this.resumos[i];
        }
        return resumos;
    }

    public String imprimeResumos() {
        String resumos = "-" + this.quantidadeAtual + " resumo(s) cadastrado(s)\n- ";
        for(int i = 0; i < quantidadeAtual; i++) {
            if(i == this.quantidadeAtual - 1){
                resumos += this.temas[i];
            } else {
                resumos += this.temas[i] + " | ";
            }
        }
        return resumos;
    }

    public int conta() {
        return this.quantidadeAtual;
    }

}
