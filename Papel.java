public class Papel {
    private String nomePessoa;
    private String papel;

    public Papel(String nomePessoa, String papel) {
        this.nomePessoa = nomePessoa;
        this.papel = papel;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getPapel() {
        return papel;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    @Override
    public String toString() {
        return "Nome Pessoa: " + nomePessoa + 
        "\n Papel: " + papel;
    }
}
