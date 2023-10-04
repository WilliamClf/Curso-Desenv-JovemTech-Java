public class Pessoa {
    Carro carro;
    String nome;
    int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    void ligarCarro() {
        carro.ligar();
    }

    void desligarCarro() {
        carro.desligar();
    }

    void acelerarCarro() {
        carro.acelerar();
    }

    void frearCarro() {
        carro.frear();
    }

    void setCambioCarro(int marcha) {
        carro.setCambio(marcha);
    }

}
