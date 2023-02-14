package open.closed.principle.solution;

/**
 * Objetos devem estar abertos para 
 * extensão, mas fechados para modificação.
 * 
 * Quando novos comportanmentos 
 * precisam ser aducionados no software, devemos estender e 
 * não alterar o código fonte original.
 */
public class ControladorDeDesconto {
	
	public void adicionarDescontoLivro(DescontoLivro descontoLivro ) {
		descontoLivro.valorDsconto();
	
}
}
