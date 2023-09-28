public class Main {
    public static void main(String[] args) throws Exception {
        Monitor monitorMd = new Monitor();

        monitorMd.setHertz(60);
        monitorMd.setAlturaCm(25.5);
        monitorMd.setLarguraCm(40.5);
        monitorMd.setCor("Preto");

        System.out.println("Dados monitor Mater Dei: ");
        System.out.println("Hz: " + monitorMd.getHertz());
        System.out.println("Altura em cm: " + monitorMd.getAlturaCm());
        System.out.println("Largura em cm: " + monitorMd.getLarguraCm());
        System.out.println("Cor: " + monitorMd.getCor());

        Jogador jogadorcap = new Jogador();

        jogadorcap.setNome("Vitor Roque");
        jogadorcap.setAlturaCm(180.5);
        jogadorcap.setPosição("Centro-Avante");
        jogadorcap.setTime("Athletico Paranaense");

        System.out.println("Dados Jogador do Cap: ");
        System.out.println("Nome: " + jogadorcap.getNome());
        System.out.println("Altura em cm: " + jogadorcap.getAlturaCm());
        System.out.println("Posiçao: " + jogadorcap.getPosição());
        System.out.println("Time: " + jogadorcap.getTime());

        Bola bola = new Bola();

        bola.setTamanho(22.6);
        bola.setPeso(920);
        bola.setCor("Vermelha");

        System.out.println("Dados Bola: ");
        System.out.println("Tamanho em cm: " + bola.getTamanho());
        System.out.println("Peso em g: " + bola.getPeso());
        System.out.println("Cor: " + bola.getCor());

        Gramado gramadoligga = new Gramado();

        gramadoligga.setTamanhoM("110x45");
        gramadoligga.setUmidade("Muito Molhado!");
        gramadoligga.setCor("Verde Escuro");

        System.out.println("Dados gramado ligga arena: ");
        System.out.println("Tamanho em m: " + gramadoligga.getTamanhoM());
        System.out.println("Umidade do gramado: " + gramadoligga.getUmidade());
        System.out.println("Cor: " + gramadoligga.getCor());

    }
}
