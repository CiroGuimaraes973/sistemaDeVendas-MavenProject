package entidade;

import java.util.ArrayList;

public class Categoria {
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean validaCategoria(Categoria categoria, ArrayList<Categoria> categorias) {
		for(Categoria cat : categorias) {
			if(cat.descricao.equals(categoria.descricao)) {
				return false;
			}
		}
		return true;
	}
	
}
