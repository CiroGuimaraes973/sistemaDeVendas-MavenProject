package entidade;

import java.util.ArrayList;

public class ItemPedido {

	private String numero;
	private int quantidade;
	private Produto produto = new Produto();
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private double total;
	private Pedido pedido = new Pedido();
	private String nome;
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double totalItem() {
		total=produto.getPreco()*this.quantidade;
		return total;
	}
	
	
}
