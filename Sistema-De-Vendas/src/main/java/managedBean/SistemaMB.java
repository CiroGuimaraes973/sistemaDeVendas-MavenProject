package managedBean;

import entidade.Categoria;
import entidade.Cliente;
import entidade.ItemPedido;
import entidade.Pedido;
import entidade.Produto;


import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class SistemaMB {

	// todos os lists

	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();
	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();

	// toda entidade
	private Cliente cliente = new Cliente();
	private Produto produto = new Produto();
	private Pedido pedido = new Pedido();
	private ItemPedido item = new ItemPedido();
	private Categoria categoria = new Categoria();

	// variaveis auxiliares
	private double total=0;
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	private double totalItem=0;
	private double totalImposto=0;
	private double totalPedido=0;
	// getters && setters de todos os elementos

	public double getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}

	public double getTotalImposto() {
		return totalImposto;
	}

	public void setTotalImposto(double totalImposto) {
		this.totalImposto = totalImposto;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public ArrayList<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemPedido> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public ItemPedido getItem() {
		return item;
	}

	public void setItem(ItemPedido item) {
		this.item = item;
	}

	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

	

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(double totalItem) {
		this.totalItem = totalItem;
	}

	public ItemPedido getAux() {
		return aux;
	}

	public void setAux(ItemPedido aux) {
		this.aux = aux;
	}



	// fim getters && setters

	// logica para o cliente

	public void salvarCliente() {
		if (cliente.validaCliente(cliente, clientes) == true) {
			
			clientes.add(cliente);
			cliente = new Cliente();
		} else {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Entao rapaz",
					"Meio que ja existe um cliente com esse codigo, por favor mude essa caralha!!"));
		}

	}
	
	
	

	public void remover(Cliente cli) {
		clientes.remove(cli);
	}

	// fim logica para o cliente

	// --------------------------\\
	// ---------------------------\\

	// logica para o produto

	public void salvarProduto() {
		if(produto.getCategoria()==null) {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Erro", "Por favor selecione uma categoria"));
		}else {
			if(produto.validaProduto(produto, produtos)==false) {
				FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Erro", "Ja existe um produto com esse codigo"));
			}else {
				if(produto.isExportacao()==false) {
					produto.setImposto(0.3);
					produto.setImposto2("30%");
					produto.setMoeda2("R$");
				}else {
					produto.setImposto(0.1);
					produto.setMoeda2("Dollar");
					produto.setImposto2("10%");
				}
				produtos.add(produto);
				produto = new Produto();
			}
		}
		
	}
	

	public void selecionarCategoria(Categoria cat) {
		produto.setCategoria(cat);
	}

	public void removerProduto(Produto pro) {
		produtos.remove(pro);
	}

	

	// fim logica para o produto

	// logica para categoria

	public void remover(Categoria cat) {
		categorias.remove(cat);
	}

	public void salvarCat() {
		if(categoria.validaCategoria(categoria, categorias)==false) {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Erro", "Ja existe uma categoria com essa descrição"));
		}else {
			categorias.add(categoria);
			categoria = new Categoria();
		}
	}

	// fim logica categoria

	// logica para o ItemPedido

	private ItemPedido aux = new ItemPedido();
	
	
	public void addItem() {
		if(item.getQuantidade()<=0) {
			FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Erro", "Por favor selecione uma quantidade maior do que zero"));
		}else {
			
			totalItem = aux.getProduto().getPreco()*item.getQuantidade();
		   item.getProdutos().add(aux.getProduto());
		   aux = new ItemPedido();
		   
		   
			
		}
	}
	
	
	
	public void removerItem(Produto pro) {
		item.getProdutos().remove(pro);
	}

	public void selecionarProduto(Produto pro) {
		aux.setProduto(pro);
		
	}
	
	public void selecionarCliente(Cliente cli) {
		pedido.setCliente(cli);
		
	}

	// logica para o pedido



}
