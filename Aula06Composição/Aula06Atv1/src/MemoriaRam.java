public class MemoriaRam {
    private String tipo;
    private int tamanhoGb;
    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamanhoGb() {
        return tamanhoGb;
    }

    public void setTamanhoGb(int tamanhoGb) {
        this.tamanhoGb = tamanhoGb;
    }
}
