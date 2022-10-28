import java.util.Date;

public class Cinema {
    public static void main(String[] args){
        System.out.println("Criando Sessão");
        
        Genero gen = new Genero("Ação");

        Ator[] actor = new Ator[2];
        actor[0] = new Ator(20, 'M', "Brasileiro", "James Bond", "Rodrigo");
        actor[1] = new Ator(30, 'F', "Canadense", "Mary Popins", "Anna");
        
        Direcao[] diretor = new Direcao[1];
        diretor[0] = new Direcao("Diretor","Alsto","Diretor");
        
        Producao[] prod = new Producao[2];
        prod[0] = new Producao("Marlon", "FilmMaker", "FilmMaker");
        prod[1] = new Producao("Kimberly", "Filmar", "FilmMaker");

        Filme film = new Filme("Missão Impossível", 2000, "Nvidia", "140", "Zimbabue");
        film.setAtores(actor);
        film.setProdutores(prod);
        film.setDiretores(diretor);
        film.setGenero(gen);
        
        Sala room = new Sala(3, "Room", 200);
        
        Date data = new Date();
        Sessao sessao = new Sessao(data,"12:00", "Aberta", 120);
        sessao.setFilme(film);
        sessao.setSala(room);
        
        Ingresso[] ingressos = new Ingresso[2];
        ingressos[0] = new Ingresso(1, 16, "Inteira", 20.00f, "28/10/2022,11:00");
        ingressos[1]= new Ingresso(2, 17, "Meia-entrada", 10.00f, "28/10/2022,11:00");
        sessao.setIngressos(ingressos);
        sessao.exibirSessao();

        sessao.venderIngressos(2);
        sessao.exibirSessao();
    }
}