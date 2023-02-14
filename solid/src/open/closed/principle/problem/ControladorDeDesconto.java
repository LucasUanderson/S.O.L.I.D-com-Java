package open.closed.principle.problem;

/**
 * Objetos devem estar abertos para 
 * extensão, mas fechados para modificação.
 * 
 * Quando novos comportanmentos 
 * precisam ser aducionados no software, devemos estender e 
 * não alterar o código fonte original.
 */
public class ControladorDeDesconto {
	
	public void adicionarDescontoLivrosInfantil(DescontoLivrosInfantil descontoLivrosInfantil  ) {
		descontoLivrosInfantil.valorDescontoLivrosInfantil();
	}
	public void adicionarDescontoLivrosAutoAjuda(DescontoLivrosAutoAjuda descontoLivrosAutoAjuda) {
		descontoLivrosAutoAjuda.valorDescontoLivrosAutoAjuda();
	}
	
	public void adicionarDescontoLivrosAcao(DescontoLivrosAcao descontoLivrosAcao){
		descontoLivrosAcao.valorDescontoLivrosAcao();
	}
}
