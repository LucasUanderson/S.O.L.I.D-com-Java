package dependency.inversion.principle.solution;
/**
 * 
 *  Dependa de abstrações e não implementações.
 *  Um modelu de alto nivel não deve dependder de modulos de baixo
 *  nivel, ambos devem depender da abstração.
 *  PS: Inversao de Dependencia nao é igual a Injeçao de dependencia.
 *
 */
import java.util.ArrayList;
import java.util.List;

import single.responsability.principal.problem.Produto;

public class ProdutoRepository {

	@SuppressWarnings("unused")
	private DbConnection dbConnection;

	public ProdutoRepository(DbConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	
	public List<Produto> buscarProdutos(){
		//retorn a lista de produtos da basse de dados
		return new ArrayList<>();
	}
	
	public void salvarProdutos(){
		//salva produtos da basse de dados
		
	}
	
	
}
