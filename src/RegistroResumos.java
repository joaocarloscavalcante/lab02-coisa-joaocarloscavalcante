/**
 * Representação de um registro (de quantidade máxima limitada) de resumos do estudante.
 * O registro guarda o tema e o conteúdo de cada resumo, não sendo possível guardar mais de um resumo por tema.
 * Quando é adicionado mais um resumo ao registro já completo, o primeiro resumo guardado é substituído pelo novo, e
 * assim sucessivamente.
 *
 * @author João Carlos Cavalcante de Almeida Padilha
 */
public class RegistroResumos {
    /** Array que armazena os textos dos resumos. */
    private String[] resumos;
    /** Array que armazena os temas dos resumos. */
    private String[] temas;
    /** Índice circular que indica a posição de inserção do próximo resumo. */
    private int indiceAtual;
    /** Quantidade atual de resumos cadastrados. */
    private int quantidadeAtual;
    /** Quantidade máxima de resumos que o registro suporta. */
    private final int quantidadeMaxima;

    /**
     * Constrói o registro de resumos definindo a capacidade máxima de armazenamento.
     *
     * @param numeroDeResumos o limite máximo de resumos suportados pelo registro
     */
    public RegistroResumos(int numeroDeResumos) {
        this.quantidadeMaxima = numeroDeResumos;
        this.resumos = new String[numeroDeResumos];
        this.temas = new String[numeroDeResumos];
        this.indiceAtual = 0;
        this.quantidadeAtual = 0;
    }

    /**
     * Verifica se um tema específico já está cadastrado no registro.
     *
     * @param tema o tema a ser pesquisado
     * @return true se o tema já estiver cadastrado, false caso contrário
     */
    public boolean temResumo(String tema) {
        for(int i = 0; i < this.quantidadeAtual; i++) {
            if(this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adiciona um novo resumo no registro. Caso o tema já exista, o texto é atualizado.
     * Quando a capacidade máxima é atingida, o resumo mais antigo é substituído sequencialmente.
     *
     * @param tema o tema ou assunto do resumo
     * @param resumo o conteúdo do resumo
     */
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

    /**
     * Retorna um array de Strings com os resumos cadastrados formatados no padrão "Tema: Conteúdo".
     *
     * @return um array contendo as representações dos resumos cadastrados
     */
    public String[] pegaResumos() {
        String[] resumos = new String[quantidadeAtual];
        for(int i = 0; i < quantidadeAtual; i++) {
            resumos[i] = this.temas[i] + ": " + this.resumos[i];
        }
        return resumos;
    }

    /**
     * Retorna a listagem formatada contendo o total de resumos e a sequência dos temas cadastrados.
     * A representação segue o formato "- X resumo(s) cadastrado(s)\n- Tema1 | Tema2".
     *
     * @return a representação em String com o resumo de todos os resumos
     */
    public String imprimeResumos() {
        String resumos = "- " + this.quantidadeAtual + " resumo(s) cadastrado(s)\n- ";
        for(int i = 0; i < quantidadeAtual; i++) {
            if(i == this.quantidadeAtual - 1){
                resumos += this.temas[i];
            } else {
                resumos += this.temas[i] + " | ";
            }
        }
        return resumos;
    }

    /**
     * Retorna a quantidade de resumos armazenados no registro até o momento.
     *
     * @return o número total de resumos válidos armazenados
     */
    public int conta() {
        return this.quantidadeAtual;
    }

}
