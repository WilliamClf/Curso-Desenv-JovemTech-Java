public class App {
    public static void main(String[] args) throws Exception {
        Usuario user = new Usuario();

        System.out.println(user.login);
        System.out.println(user.senha);
        user.login = "hackeado";
        user.senha = "4321";
        System.out.println("Hackeado!");
        System.out.println(user.login);
        System.out.println(user.senha);

    }
}
