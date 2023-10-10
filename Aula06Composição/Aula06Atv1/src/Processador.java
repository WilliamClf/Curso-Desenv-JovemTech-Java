public class Processador {
    private String marca;
    private boolean gráficaIntegrada;
    private int numNúcleos;
    private int numThreads;

    public int getNumThreads() {
        return numThreads;
    }

    public void setNumThreads(int numThreads) {
        this.numThreads = numThreads;
    }

    public int getNumNúcleos() {
        return numNúcleos;
    }

    public void setNumNúcleos(int numNúcleos) {
        this.numNúcleos = numNúcleos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isGráficaIntegrada() {
        return gráficaIntegrada;
    }

    public void setGráficaIntegrada(boolean gráficaIntegrada) {
        this.gráficaIntegrada = gráficaIntegrada;
    }

}
