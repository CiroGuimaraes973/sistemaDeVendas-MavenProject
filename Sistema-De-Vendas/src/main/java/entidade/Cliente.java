package entidade;

import java.util.ArrayList;

public class Cliente {
	
	private String codigo;
	private String nome;
	private String endereco;
	private String telefone;
	private String status;
	private double limiteCredito;
	private ArrayList<Pedido> pedidos;
	private String code;
	
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public boolean validaCliente(Cliente cliente, ArrayList<Cliente> clientes) {
		for(Cliente cli : clientes) {
			if(cli.codigo.equals(cliente.codigo)) {
				return false;
			}
		}
		return true;
	}
	
}
