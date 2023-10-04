public class Main {
    public static void main(String[] args) throws Exception {
        Carro saveiro = new Carro();

        saveiro.setCor("Branca");
        saveiro.setNumPortas(2);
        saveiro.setPlaca("MTR-858F");
        saveiro.setTipo("Cross");

        Pessoa will = new Pessoa();

        will.setIdade(18);
        will.setNome("William");

        will.setCarro(saveiro);

        will.ligarCarro();
        will.setCambioCarro(1);
        will.acelerarCarro();
        will.acelerarCarro();
        will.setCambioCarro(2);
        will.acelerarCarro();
        will.setCambioCarro(2);
        will.acelerarCarro();
        will.setCambioCarro(3);
        will.frearCarro();
        will.frearCarro();
        will.setCambioCarro(2);
        will.frearCarro();
        will.setCambioCarro(1);
        will.frearCarro();
        will.setCambioCarro(0);
        will.desligarCarro();

    }
}
