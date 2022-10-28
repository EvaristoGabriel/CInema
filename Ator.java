public class Ator extends Papel {
    public int idade;
    public char sexo;
    public String nacionalidade;

    public Ator(int idade, char sexo, String nacional, String papel, String nome) {
        super(nome, papel);
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacional;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
