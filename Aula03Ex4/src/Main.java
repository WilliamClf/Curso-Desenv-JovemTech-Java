// Cria um projeto novo e modele a classe pessoa. Implemente os devidos métodos set e get para configuração de seus
// atributos e dois métodos construtores, um que não recebe argumentos e outro que configura os valores iniciais de um
// objeto. Pense em pelo menos 5 atributos. Crie três objetos distintos, um com um construtor vazio, um com o construtor
// parametrizado e outro cujos valores dos atributos serão configurados com set e get. Imprima os três objetos do tipo
// pessoa e seus respectivos atributos.

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa will = new Pessoa();

        will.nome = "William";
        will.idade = 18;
        will.corCabelo = "Preto";
        will.peso = 75.5;
        will.alturaCm = 183;

        System.out.println("Dados Will");
        System.out.println("Nome: " + will.nome);
        System.out.println("Idade: " + will.idade);
        System.out.println("Cor do Cabelo: " + will.corCabelo);
        System.out.println("Peso: " + will.peso);
        System.out.println("Altura em cm: " + will.alturaCm);

        Pessoa vini = new Pessoa("Cinivius", 19, "Castanho", 76, 178);

        System.out.println("Dados Vini");
        System.out.println("Nome: " + vini.nome);
        System.out.println("Idade: " + vini.idade);
        System.out.println("Cor do Cabelo: " + vini.corCabelo);
        System.out.println("Peso: " + vini.peso);
        System.out.println("Altura em cm: " + vini.alturaCm);

        Pessoa pulga = new Pessoa();

        pulga.setNome("Alisson");
        pulga.setIdade(33);// não tenho essa informação
        pulga.setCorCabelo("Preto");
        pulga.setPeso(70);
        pulga.setAlturaCm(175);

        System.out.println("Dados Pulga");
        System.out.println("Nome: " + pulga.getNome());
        System.out.println("Idade: " + pulga.getIdade());
        System.out.println("Cor do Cabelo: " + pulga.getCorCabelo());
        System.out.println("Peso: " + pulga.getPeso());
        System.out.println("Altura em cm: " + pulga.getAlturaCm());

    }
}
