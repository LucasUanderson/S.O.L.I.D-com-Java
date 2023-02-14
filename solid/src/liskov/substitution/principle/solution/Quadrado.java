package liskov.substitution.principle.solution;

public class Quadrado implements InterfaceTest {
	
	public double altura;
	public double largura;
	
	@Override
	public double getArea() {
		return  altura + largura * altura + largura  ;
	}
 
	
	
}
