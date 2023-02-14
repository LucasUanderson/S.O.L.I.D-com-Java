package open.closed.principle.solution;

public class DescontoLivrosAcao implements DescontoLivro {
	
	@Override
	public double valorDsconto() {
		return 0.2;
	}
}
