import java.util.Date;

public class Cinema {
    public static void main(String[] args){
        System.out.println("Opa");
        System.out.println("Criando Sessão");
        Date data = new Date();
        Sessao sessao = new Sessao(data,"12:00", "estado", 120);
        sessao.exibirSessao();

        Genero gen = new Genero("Ação");
        System.out.println(gen.getNomeGenero());
    }
}