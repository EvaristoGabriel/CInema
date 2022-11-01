public class Sala {
    private int numeroSala;
    private String nomeSala;
    private int capacidade;
    private Sessao sessoes[];

    public Sala(int numeroSala, String nomeSala, int capacidade) {
        this.numeroSala = numeroSala;
        this.nomeSala = nomeSala;
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public Sessao[] getSessoes() {
        return sessoes;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public void setSessoes(Sessao[] sessoes) {
        this.sessoes = sessoes;
    }

    @Override
    public String toString() {
        return "Numero da sala: " + getNumeroSala();
    }

}
