package br.com.guilhermeoli.Agregacao;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guiol
 */
public class Venda {

    private Comprador comprador;

    private Vendedor vendedor;

    private List<Produto> produtos;

    public void venda() {
        this.produtos = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void add(Produto produto) {
        this.produtos.add(produto);
    }

    public void concretizarVenda() {
        System.out.println("Comprador " + this.comprador.getNome());
        System.out.println("Comprou os itens : ");
        for (Produto prod : this.produtos) {
            System.out.println("Nome produto " + prod.getNome() + " valor produto " + prod.getPreco());
        }
        System.out.println("Vendedor " + this.vendedor.getNome());
    }

    public void cancelarVenda() {
        System.out.println("Venda cancelada");
    }
}
