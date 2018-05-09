package entidade;

import java.util.ArrayList;

public class Pedido {

	private String numero;
	private String data;
	private ArrayList<ItemPedido> itens;
	private ItemPedido item;
	private Cliente cliente;
	double total=0;
	public String getNumero() {
		return numero;
	}

	public ItemPedido getItem() {
		return item;
	}

	public void setItem(ItemPedido item) {
		this.item = item;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
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

	public void totalPedido() {
		
		for(ItemPedido item : itens) {
			total += item.totalItem();
		}
		
	}

}
