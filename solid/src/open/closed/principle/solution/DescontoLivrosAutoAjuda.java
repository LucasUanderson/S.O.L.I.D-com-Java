package open.closed.principle.solution;

public class DescontoLivrosAutoAjuda implements DescontoLivro {


	@Override
	public double valorDsconto() {
		return 0.3;
	}
}
