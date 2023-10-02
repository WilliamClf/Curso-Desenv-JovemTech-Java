public class Jogador {
    String nome;
    double alturaCm;
    String time;
    String posição;

    Jogador() {
        this.nome = "";
        this.alturaCm = 0;
        this.time = "";
        this.posição = "";
    }

    Jogador(String nome, double alturaCm, String time, String posição) {
        this.nome = nome;
        this.alturaCm = alturaCm;
        this.time = time;
        this.posição = posição;
    }
}
