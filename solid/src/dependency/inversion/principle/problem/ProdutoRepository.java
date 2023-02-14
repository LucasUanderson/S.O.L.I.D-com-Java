package dependency.inversion.principle.problem;

import java.util.ArrayList;
import java.util.List;

import single.responsability.principal.problem.Produto;

public class ProdutoRepository {

	@SuppressWarnings("unused")
	private MySqlConnection mySqlConnection;

	public ProdutoRepository(MySqlConnection mySqlConnection) {
		this.mySqlConnection = mySqlConnection;
	}
	
	public List<Produto> buscarProdutos(){
		//retorn a lista de produtos da basse de dados
		return new ArrayList<>();
	}
	
	public void salvarProdutos(){
		//salva produtos da basse de dados
		
	}
	
	
}
