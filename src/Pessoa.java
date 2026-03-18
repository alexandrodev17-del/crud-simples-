public class Pessoa {
    String nome;
    int idade;

    void apresentar(){
        System.out.println("oi, meu nome é  " + nome + " e tenho " + idade + " anos");

    }

    void fazerAniversario(){
        idade++;
        System.out.println("Fiz aniversario");
    }

}
