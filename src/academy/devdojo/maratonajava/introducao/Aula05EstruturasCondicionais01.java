package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
	public static void main(String[] args) {
		int idade = 20;
		boolean isAutorizadoComprarBebida = idade  >= 18;
		// !
		if(isAutorizadoComprarBebida) {
			System.out.println("Autorizado a comprar bebida alcólica");
		} else {
			System.out.println("Não autorizado a comprar bebida alcólica");
		}
		
		if(!isAutorizadoComprarBebida == false) {
			System.out.println("Não autorizado a comprar bebida alcólica");
		}
		
		boolean c = false;
		if(c == false) {
			System.out.println("Dentro de algo que nunca deveria ser feito");
		}
		
		System.out.println("Fora do if");
	}
}
