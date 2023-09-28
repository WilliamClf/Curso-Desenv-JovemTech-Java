public class Autos {
    public static void main(String[] args) throws Exception {
        Carro opalão = new Carro();

        opalão.setPlaca("2W3S56F");
        opalão.setTipo("76ss");
        opalão.setCor("Branco");

        System.out.println("Dados opalão: ");
        System.out.println(opalão.getPlaca());
        System.out.println(opalão.getTipo());
        System.out.println(opalão.getCor());

        Carro gol = new Carro();

        gol.setPlaca("S23RD2");
        gol.setTipo("golzinho orbital");
        gol.setCor("Branco");

        System.out.println("Dados Gol: ");
        System.out.println(gol.getPlaca());
        System.out.println(gol.getTipo());
        System.out.println(gol.getCor());
    }

}
