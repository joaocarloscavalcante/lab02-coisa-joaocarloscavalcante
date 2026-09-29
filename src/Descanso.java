public class Descanso {
    private int horasDescanso;
    private int numerosSemanas;

    // Construtor
    public void Descanso() {

    }
    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numerosSemanas) {
        this.numerosSemanas = numerosSemanas;
    }

    public String getStatusGeral() {
        if((horasDescanso / numerosSemanas) >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}
