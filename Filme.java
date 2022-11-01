public class Filme {
    private String titulo;
    private int ano;
    private String produtora;
    private String paisOrigem;
    private String duracao;
    private Ator atores[];
    private Genero genero;
    private Direcao diretores[];
    private Producao produtores[];
    private Sessao sessoes[];

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

    public Ator[] getAtores() {
        return atores;
    }

    public Direcao[] getDiretores() {
        return diretores;
    }

    public Genero getGenero() {
        return genero;
    }

    public Producao[] getProdutores() {
        return produtores;
    }

    public Sessao[] getSessoes() {
        return sessoes;
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

    public void setAtores(Ator[] atores) {
        this.atores = atores;
    }

    public void setDiretores(Direcao[] diretores) {
        this.diretores = diretores;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setProdutores(Producao[] produtores) {
        this.produtores = produtores;
    }
    
    public void setSessoes(Sessao[] sessoes) {
        this.sessoes = sessoes;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                "\nAno: " + ano +
                "\nDuração: " + duracao +
                "\nPaís de origem: " + paisOrigem +
                "\nProdutora: " + produtora +
                "\n" + genero.toString() +
                "\n" + atores[0].toString() +
                "\n" + atores[1].toString() +
                "\n" + diretores[0].toString() +
                "\n" + produtores[0].toString() +
                "\n" + produtores[1].toString();
    }
}
