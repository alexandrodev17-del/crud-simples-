public class Produto {
    String nome;
    double preco;

    void mostrarProduto(){
        System.out.println("Produto:" +nome+ "Preço"+preco);
    }

    void aplicarDesconto(double porcentagem){
        if(porcentagem > 0 && porcentagem <= 100){
            double desconto = preco * porcentagem / 100;
            preco = preco - desconto;
        }else {
            System.out.println("Desconto inválido");
        }

    }
}
