public class Pessoa {

    String nome;
    int idade;
    String corCabelo;
    double peso;
    int alturaCm;

    Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.corCabelo = "";
        this.peso = 0.0;
        this.alturaCm = 0;
    }

    Pessoa(String nome, int idade, String corCabelo, double peso, int alturaCm) {
        this.nome = nome;
        this.idade = idade;
        this.corCabelo = corCabelo;
        this.peso = peso;
        this.alturaCm = alturaCm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }
}
