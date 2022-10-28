public class Ingresso {
    private int numeroIngresso;
    private int assentoIngresso;
    private String tipoIngresso;
    private float valorIngresso;
    private String dataHoraCompra;

    public Ingresso(int numeroIngresso, int assentoIngresso, String tipo, float val, String dataH) {
        this.numeroIngresso = numeroIngresso;
        this.assentoIngresso = assentoIngresso;
        this.tipoIngresso = tipo;
        this.valorIngresso = val;
        this.dataHoraCompra = dataH;
    }

    public void imprimirIngresso() {
        System.out.println("Numero do Ingresso: " + this.numeroIngresso);
        System.out.println("Assento do Ingresso: " + this.assentoIngresso);
        System.out.println("Tipo do Ingresso: " + this.tipoIngresso);
        System.out.println("Valor do Ingresso: " + this.valorIngresso);
        System.out.println("Data e hora da compra: " + this.dataHoraCompra);
    }

    public int getAssentoIngresso() {
        return assentoIngresso;
    }

    public String getDataHoraCompra() {
        return dataHoraCompra;
    }

    public int getNumeroIngresso() {
        return numeroIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setAssentoIngresso(int assentoIngresso) {
        this.assentoIngresso = assentoIngresso;
    }

    public void setDataHoraCompra(String dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}
