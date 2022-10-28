public class Direcao extends Papel {
    private String papelDirecao;

    public Direcao(String papelDirecao, String nome, String papel) {
        super(nome, papel);
        this.papelDirecao = papelDirecao;
    }

    public String getPapelDirecao() {
        return papelDirecao;
    }

    public void setPapelDirecao(String papelDirecao) {
        this.papelDirecao = papelDirecao;
    }

    @Override
    public String toString() {
        return super.toString() +
        "\n Papel Direção: " + papelDirecao;
    }
}
