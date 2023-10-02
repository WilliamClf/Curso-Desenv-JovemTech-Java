public class App {
    public static void main(String[] args) throws Exception {
        Monitor monitorMd = new Monitor(75, 25.5, 40, "Preto");

        System.out.println("Dados monitor Mater Dei: ");
        System.out.println("Hz: " + monitorMd.hertz);
        System.out.println("Altura em cm: " + monitorMd.alturaCm);
        System.out.println("Largura em cm: " + monitorMd.larguraCm);
        System.out.println("Cor: " + monitorMd.cor);

        Jogador jogadorcap = new Jogador("Vitor Roque", 182, "Centro-Avante",
                "Athletico Parananese");

        System.out.println("Dados Jogador do Cap: ");
        System.out.println("Nome: " + jogadorcap.nome);
        System.out.println("Altura em cm: " + jogadorcap.alturaCm);
        System.out.println("Posiçao: " + jogadorcap.posição);
        System.out.println("Time: " + jogadorcap.time);

        Bola bola = new Bola(20, "Branca", 900);

        System.out.println("Dados Bola: ");
        System.out.println("Tamanho em cm: " + bola.tamanho);
        System.out.println("Cor: " + bola.cor);
        System.out.println("Peso em g: " + bola.peso);

        Gramado gramadoligga = new Gramado("110x45", "Pouco molhado", "Verde claro");

        System.out.println("Dados gramado ligga arena: ");
        System.out.println("Tamanho em m: " + gramadoligga.tamanhoM);
        System.out.println("Umidade do gramado: " + gramadoligga.umidade);
        System.out.println("Cor: " + gramadoligga.cor);

    }
}
