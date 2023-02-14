package single.responsability.principal.problem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {
	
	private List<Produto> produtos = new ArrayList<>();
	
	public void adicionarProduto(Produto produto) { produtos.add(produto);}
	
	
	public void removerProduto(Produto produto) { produtos.remove(produto);}
	
	
	public BigDecimal calculatorTotal() {
		return produtos.stream()
				.map(Produto::getPreco)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
	public List<OrdemDeCompra> buscarOrdemDeCompra(){
		//retorna a lista de ordens de compra da base de dados 
		return new ArrayList<>();
	}
	
	public void salvarOdemCompra() {
		//salva lista de produtos na base de dados 
	}
	public void enviaEmail() {
		//envia email da ordem de compra
	}
	public void imprimiOrdemcompra() {
		//imprimi a ordem de compra
	}
}
