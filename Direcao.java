public class Direcao extends Papel {
    public String papelDirecao;

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
}
