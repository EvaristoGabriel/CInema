public class Producao extends Papel {
    public String papelProducao;

    public Producao(String nome, String papel, String prod) {
        super(nome, papel);
        this.papelProducao = prod;
    }

    public String getPapelProducao() {
        return papelProducao;
    }

    public void setPapelProducao(String papelProducao) {
        this.papelProducao = papelProducao;
    }
}
