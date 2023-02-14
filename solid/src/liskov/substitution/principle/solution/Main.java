package liskov.substitution.principle.solution;
/**
 * 
 * Se para cada objeto O1 do tipo S há um objeto 
 * O2 do tipo T de forma que, para todos os programas P,
 * o comportamento de de P é inalterado quando O1 é substituido por O2
 * então S é um subtipo de T. 
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo();
		
		retangulo.setAltura(10);
		retangulo.setLargura(5);
		
		System.out.println(retangulo.getArea());
	}
}
