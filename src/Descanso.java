/**
 * Representação da rotina de descanso de um estudante.
 * Avalia se o aluno está descansado com base nas horas de lazer acumuladas ao longo das semanas.
 * Para estar considerado descansado, o estudante precisa ter, no mínimo, 26 horas semanais de lazer.
 *
 * @author João Carlos Cavalcante de Almeida Padilha
 */
public class Descanso {
    private int horasDescanso;
    private int numerosSemanas;

    // Construtor
    public void Descanso() {
        this.horasDescanso = 0;
        this.numerosSemanas = 0;
    }

    // Demais Métodos
    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numerosSemanas) {
        this.numerosSemanas = numerosSemanas;
    }

    public String getStatusGeral() {
        if(numerosSemanas > 0 && (horasDescanso / numerosSemanas) >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}
