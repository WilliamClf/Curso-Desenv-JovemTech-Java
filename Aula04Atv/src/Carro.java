public class Carro {
    int cambio;
    boolean ligado;
    int velocidade;
    String cor;
    int numPortas;
    String placa;
    String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int marcha) {
        this.cambio = marcha;
        System.out.println("Trocando marcha!: " + this.cambio);
    }

    void ligar() {
        this.ligado = true;
        System.out.println("Carro ligado!");
    }

    void desligar() {
        this.ligado = false;
        System.out.println("Carro desligado!");
    }

    void acelerar() {
        this.velocidade += 30;
        System.out.println("Aumentando velocidade! " + this.velocidade + "Km/h");
    }

    void frear() {
        this.velocidade -= 30;
        System.out.println("Diminuindo velocidade! " + this.velocidade + "Km/h");
    }

}