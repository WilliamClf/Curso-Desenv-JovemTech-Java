public class Computador {
    private PlacaMãe placaMãe;

    // Computador() {
    //     placaMãe = new PlacaMãe();
    // }

    Computador(String processador) {
        placaMãe = new PlacaMãe(processador);
    }
}
