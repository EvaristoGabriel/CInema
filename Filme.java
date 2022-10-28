public class Filme {
    public String titulo;
    public int ano;
    public String produtora;
    public String paisOrigem;
    public String duracao;

    public Filme(String titulo, int ano, String produtora, String duracao, String paisOrigem) {
        this.titulo = titulo;
        this.ano = ano;
        this.produtora = produtora;
        this.paisOrigem = paisOrigem;
        this.duracao = duracao;
    }

    public int getAno() {
        return ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public String getProdutora() {
        return produtora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
