public class Main {
    public static void main(String[] args) throws Exception {
        Carro golfão = new Carro();

        golfão.setPlaca("2W3S56F");
        golfão.setTipo("sapão");
        golfão.setCor("preto");
        golfão.setMarca("volkswagen");
        golfão.setModelo("gti");
        golfão.setAnoFabricação(2002);
        golfão.setTipoCombustivel("Gasolina Comum");

        System.out.println("Dados golfão: ");
        System.out.println("Placa: " + golfão.getPlaca());
        System.out.println("Tipo: " + golfão.getTipo());
        System.out.println("Cor: " + golfão.getCor());
        System.out.println("Marca: " + golfão.getMarca());
        System.out.println("Modelo: " + golfão.getModelo());
        System.out.println("Ano de fabricação: " + golfão.getAnoFabricação());
        System.out.println("Tipo combustível: " + golfão.getTipoCombustivel());

        OutroCarro jetta = new OutroCarro("Cinza Espacial", "fodão",
                "SWO32S", "volkswagen", "tsi", 2021,
                "Gasolina");

        System.out.println("Dados jetta: ");
        System.out.println("Placa: " + jetta.placa);
        System.out.println("Tipo: " + jetta.tipo);
        System.out.println("Cor: " + jetta.cor);
        System.out.println("Marca: " + jetta.marca);
        System.out.println("Modelo: " + jetta.modelo);
        System.out.println("Ano de fabricação: " + jetta.anoFabricação);
        System.out.println("Tipo combustível: " + jetta.tipoCombustivel);
    }
}
