import java.text.DateFormat;
import java.util.Date;

public class Sessao {
    private Date dataSessao;
    private String horaSessao;
    private String estadoSessao;
    private int ingressosSessao;
    protected int ingressosComprados;
    protected int ingressosRestantes;
    private Filme filme;
    private Sala sala;
    private Ingresso ingressos[];

    public Sessao(Date data, String hora, String estado, int ingresso) {
        this.dataSessao = data;
        this.horaSessao = hora;
        this.estadoSessao = estado;
        this.ingressosSessao = ingresso;
        this.ingressosComprados = 0;
        this.ingressosRestantes = ingresso;
    }

    public Date getDataSessao() {
        return dataSessao;
    }

    public String getEstadoSessao() {
        return estadoSessao;
    }

    public String getHoraSessao() {
        return horaSessao;
    }

    public int getIngressosComprados() {
        return ingressosComprados;
    }

    public int getIngressosRestantes() {
        return ingressosRestantes;
    }

    public int getIngressosSessao() {
        return ingressosSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public void setEstadoSessao(String estadoSessao) {
        this.estadoSessao = estadoSessao;
    }

    public void setHoraSessao(String horaSessao) {
        this.horaSessao = horaSessao;
    }

    public void setIngressosComprados(int ingressosComprados) {
        this.ingressosComprados = ingressosComprados;
    }

    public void setIngressosRestantes(int ingressosRestantes) {
        this.ingressosRestantes = ingressosRestantes;
    }

    public void setIngressosSessao(int ingressosSessao) {
        this.ingressosSessao = ingressosSessao;
    }
    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    public void setIngressos(Ingresso[] ingressos) {
        this.ingressos = ingressos;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void exibirSessao() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Data e Hora: " + df.format(getDataSessao()) + " " + getHoraSessao());
        System.out.println("Estado: " + getEstadoSessao());
        System.out.println("Ingressos total: " + getIngressosSessao());
        System.out.println("Ingressos comprados: " + getIngressosComprados());
        System.out.println("Ingressos restantes: " + getIngressosRestantes());
        System.out.println(sala.toString());
        System.out.println(filme.toString());
        for (int i = 0; i < ingressos.length; i++){
            ingressos[i].imprimirIngresso();
        }
    }

    public void venderIngressos(int ingressos) {
        if (this.ingressosRestantes >= ingressos) {
            System.out.println("Vendendo " + ingressos + " ingressos");
            this.ingressosComprados += ingressos;
            this.ingressosRestantes -= ingressos;
        } else {
            System.out.println("Não há ingressos para esta sessão, sinto muito...");
        }
    }
}
