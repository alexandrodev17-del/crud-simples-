import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao = -1;
        while(opcao!=0) {
            System.out.println("\n1 - Adicionar produto");
            System.out.println("2- Listar produtos");
            System.out.println("3 - Aplicar descontos em todos ");
            System.out.println("4 - Buscar produto por nome");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Atualizar preço");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    sc.nextLine(); // limpar buffer

                    System.out.println("Digite o nome do produto:");
                    String nome = sc.nextLine();

                    System.out.println("Digite o preço:");
                    double preco = sc.nextDouble();

                    Produto produto = new Produto();
                    produto.setNome(nome);
                    produto.setPreco(preco);

                    produtos.add(produto);

                    System.out.println("Produto cadastrado!");
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Produto p : produtos) {
                            p.mostrarProduto();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite a porcentagem de desconto:");
                    double porcentagem = sc.nextDouble();

                    for (Produto p : produtos) {
                        p.aplicarDesconto(porcentagem);
                    }

                    System.out.println("Desconto aplicado!");
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Digite o nome do produto:");
                    String busca = sc.nextLine();

                    boolean encontrado = false;

                    for (Produto p : produtos) {
                        if(p.getNome().equalsIgnoreCase(busca)){
                            p.mostrarProduto();
                            encontrado = true;
                        }
                    }
                    if(!encontrado){
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5:
                    sc.nextLine();

                    System.out.println("Digite o nome do produto para remover:");
                    String remover = sc.nextLine();

                    boolean removido = false;

                    for (int i = 0; i < produtos.size(); i++) {
                        if (produtos.get(i).getNome().equalsIgnoreCase(remover )){
                            produtos.remove(i);
                            removido = true;
                            System.out.println("Removido com sucesso!");
                            break;
                        }
                    }

                    if(!removido){
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 6:
                    sc.nextLine();
                    String nomeAtualizado = sc.nextLine();


                    boolean atualizado = false;

                    for (Produto p : produtos) {
                        if (p.getNome().equalsIgnoreCase(nomeAtualizado)){

                            System.out.println("Digite o novo preço:");
                            double novoPreco = sc.nextDouble();

                            p.setPreco(novoPreco);

                            System.out.println("Preço atualizado!");
                            String nomeAtualizadoAtualizado = sc.nextLine();
                            atualizado = true;
                        }
                    }
                    if(!atualizado){
                        System.out.println("Produto não encontrado.");
                    }
                    break;


                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");


            }
        }

        sc.close();
    }
}
