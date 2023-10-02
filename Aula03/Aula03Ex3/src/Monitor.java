public class Monitor {
    int hertz;
    double alturaCm;
    double larguraCm;
    String cor;

    Monitor() {
        this.hertz = 0;
        this.alturaCm = 0.0;
        this.larguraCm = 0.0;
        this.cor = "";
    }

    Monitor(int hertz, double alturaCm, double larguraCm, String cor) {
        this.hertz = hertz;
        this.alturaCm = alturaCm;
        this.larguraCm = larguraCm;
        this.cor = cor;
    }
}
