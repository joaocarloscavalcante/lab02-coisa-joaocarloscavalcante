/**
 * Representação da rotina de descanso de um estudante.
 * Avalia se o aluno está descansado com base nas horas de lazer acumuladas ao longo das semanas.
 * Para estar considerado descansado, o estudante precisa ter, no mínimo, 26 horas semanais de lazer.
 *
 * @author João Carlos Cavalcante de Almeida Padilha
 */
public class Descanso {
    /** Horas acumuladas de descanso do estudante. */
    private int horasDescanso;
    /** Número total de semanas acompanhadas. */
    private int numerosSemanas;

    /**
     * Constrói uma rotina de descanso.
     * Todo aluno começa com zero horas de descanso e zero semanas.
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numerosSemanas = 0;
    }

    /**
     * Define a quantidade de horas de descanso do estudante.
     *
     * @param horasDescanso a quantidade de horas de descanso
     */
    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    /**
     * Define a quantidade de semanas acompanhadas.
     *
     * @param numerosSemanas o número de semanas
     */
    public void defineNumeroSemanas(int numerosSemanas) {
        this.numerosSemanas = numerosSemanas;
    }

    /**
     * Retorna o estado geral de descanso do estudante.
     * O aluno é considerado "descansado" se atingir uma média de pelo
     * menos 26 horas por semana. Caso contrário, retorna "cansado".
     *
     * @return a representação em String da situação do aluno ("descansado" ou "cansado")
     */
    public String getStatusGeral() {
        if(numerosSemanas > 0 && (horasDescanso / numerosSemanas) >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}
