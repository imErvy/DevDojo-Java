package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	public static void main(String[] args) {
		// int, double, float, char, byte, short, long, boolean
		// * todos são escritos com letras minúsculas *
		int idade = 10;
		long numeroGrande = 100000;
		double salarioDouble = 2000;
		float salarioFloat = 2500.0F; //Nesse caso é preciso adicionar o F no valor
		byte idadeByte = -128;
		short idadeShort = 10;
		boolean verdadeiro = true;
		boolean falso = false;
		char caractere = '\u0041'; // pode usar a tabela ASCII ou Unicode
		System.out.println("A idade é: " + idade + " anos");
		System.out.println(verdadeiro);
		System.out.println("char " + caractere);
		
		// Depois dá uma olhada no Cast para forçar por exemplo um int ser long
		// int idade = (int) 100000000000L;
		String nome = "Fernando";
		System.out.println("Oi, meu nome é " + nome);
	}
}
