/**
 * Representação de um resumo de estudos contendo um tema e o seu conteúdo textual.
 * O tema atua como o identificador do resumo e é imutável após a criação.
 *
 * @author João Carlos Cavalcante de Almeida Padilha
 */

public class Resumo {
    /** O tema ou assunto do resumo. */
    private final String tema;
    /** O conteúdo textual do resumo. */
    private String conteudo;

    /**
     * Constrói um resumo a partir do seu tema e conteúdo textual.
     *
     * @param tema o tema ou assunto do resumo
     * @param conteudo o texto do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o tema do resumo.
     *
     * @return o tema do resumo
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Atualiza o conteúdo textual do resumo.
     *
     * @param conteudo o novo texto a ser atribuído ao resumo
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * Retorna a representação textual do resumo no padrão "Tema: Conteúdo".
     *
     * @return a representação em String do resumo
     */
    @Override
    public String toString() {
        return this.tema + ": " + this.conteudo;
    }
}
