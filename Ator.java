public class Ator extends Papel {
    private int idade;
    private char sexo;
    private String nacionalidade;

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

    @Override
    public String toString() {
        return super.toString() + 
        "\n Idade: " + idade + 
        "\n Nacionalidade: " + nacionalidade + 
        "\n Sexo: " + sexo;
    }
}
