public class Main {
    public static void main(String[] args) throws Exception {
        Automovel carro = new Automovel();

        carro.setCapacidade(5);
        carro.setNumPortas(4);
        carro.setNumRodas(4);
        carro.setCor("PRETO");
        carro.setPlaca("ied3t7y6");

        System.out.println("Capacidade:" + carro.getCapacidade());
        System.out.println("Numero Portas:" + carro.getNumPortas());
        System.out.println("Numero Rodas:" + carro.getNumRodas());
        System.out.println("Cor:" + carro.getCor());
        System.out.println("Placa:" + carro.getPlaca());

    }
}
