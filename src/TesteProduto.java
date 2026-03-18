import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 6000.00;

        Produto p2 = new Produto();
        p2.nome = "Monitor";
        p2.preco = 1200.00;

        Produto p3 = new Produto();
        p3.nome = "Teclado";
        p3.preco = 1500.00;


        Produto p4 = new Produto();
        p4.nome = "Mouse";
        p4.preco = 700.00;

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        for  (Produto produto : produtos) {
            produto.mostrarProduto();
            produto.aplicarDesconto(10);
            produto.mostrarProduto();

        }
    }
}
