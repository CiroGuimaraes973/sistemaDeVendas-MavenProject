package entidade;

import java.util.ArrayList;

public class Produto {

	private String codigo;
	private String nome,imposto2,moeda2;
	private Categoria categoria;
	private double preco;
	private int moeda;
	private boolean exportacao;
	private double imposto;
	
	
	
	
	
	
	

	
	public void setExportacao(boolean exportacao) {
		this.exportacao = exportacao;
	}
	public String getMoeda2() {
		return moeda2;
	}
	public void setMoeda2(String moeda2) {
		this.moeda2 = moeda2;
	}
	
	public String getImposto2() {
		return imposto2;
	}
	public void setImposto2(String imposto2) {
		this.imposto2 = imposto2;
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
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getMoeda() {
		return moeda;
	}
	public void setMoeda(int moeda) {
		this.moeda = moeda;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public boolean validaProduto(Produto produto, ArrayList<Produto> produtos) {
		for(Produto pro : produtos) {
			if(pro.getCodigo().equals(produto.codigo)) {
				return false;
			}
		}
		return true;
	}
	public boolean isExportacao() {
		return exportacao;
	}
	
	
	
	
}
