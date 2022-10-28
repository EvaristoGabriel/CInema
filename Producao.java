public class Producao extends Papel {
    private String papelProducao;

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

    @Override
    public String toString() {
        return super.toString() + 
        "\n Papel produção: " + papelProducao; 
    }
}
