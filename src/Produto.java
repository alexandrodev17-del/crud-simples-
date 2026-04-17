public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    void mostrarProduto(){
        System.out.println("Produto:" +getNome()+ "Preço"+getPreco());
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
