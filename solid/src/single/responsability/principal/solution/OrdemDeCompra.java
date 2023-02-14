package single.responsability.principal.solution;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 *  Uma classe deve possuir uma 
 *  ÚNICA RESPONSABILIDADE dentro do software!!
 *  
 *  Cada nova classe deve ter seu arquivo separado
 *  esta no mesmo arquivo por questoes didaticas
 *
 */

// Classe OrdemDeCompra

public class OrdemDeCompra {
	
	private List<Produto> produtos = new ArrayList<>();
	
	public void adicionarProduto(Produto produto) { produtos.add(produto);}
	
	
	public void removerProduto(Produto produto) { produtos.remove(produto);}
	
	
	public BigDecimal calculatorTotal() {
		return produtos.stream()
				.map(Produto::getPreco)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
}
	
/**
 * 
 *  Classe OrdemDeCompraRepository
 *
 */


class OrdemDeCompraRepository {
	
	public List<OrdemDeCompra> buscarOrdemDeCompra(){
		//retorna a lista de ordens de compra da base de dados 
		return new ArrayList<>();
	}
	
	public void salvarOdemCompra() {
		//salva lista de produtos na base de dados 
	}
}
/**
 * 
 *  Classe OrdemDeCompraEmail
 *
 */

class OrdemDeCompraEmail {
	
	public void enviaEmail() {
		//envia email da ordem de compra
	}
}

/**
 * 
 *  Classe OrdemDeCompraPrint
 *
 */

class OrdemDeCompraPrint {

	public void imprimiOrdemcompra() {
		//imprimi a ordem de compra
	}
}

