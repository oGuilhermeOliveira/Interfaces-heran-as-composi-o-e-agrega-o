package br.com.guilhermeoli.Agregacao;

/**
 * @author guiol
 */
public class Programa {

    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1L, 10d, "TV");
        Produto produtoCel = criarProduto(12L, 1000d, "Celular");

        Vendedor vendedor = criarVendedor();

        Comprador comprador = criarComprador();

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println((Object) null);
        System.out.println(produtoTV.getNome());
    }

    private static Comprador criarComprador() {
        return new Comprador("Teste", 2000.0);
    }

    private static Vendedor criarVendedor() {
        Vendedor vendedor= new Vendedor();
        vendedor.setComissao(10.0);
        vendedor.setNome("Rodrigo");
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
