public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Alexandro";
        pessoa1.idade = 25;

        pessoa1.apresentar();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Bernardo";
        pessoa2.idade = 35;

        pessoa2.apresentar();

        pessoa1.fazerAniversario();

        pessoa1.apresentar();

        pessoa2.fazerAniversario();

        pessoa2.apresentar();




    }
}
