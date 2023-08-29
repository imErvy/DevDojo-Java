package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
	public static void main(String[] args) {
		// + - / *
		int numero01 = 10;
		int numero02 = 20;
		int resultado = numero02 / numero01;
		System.out.println("Valor da soma: " + (numero02 + numero01));
		System.out.println("Divisão: " + resultado);
		
		// %
		int resto = 21 % 2;
		System.out.println("Resto: " + resto);
		
		// < > <= >= == !=
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezIgualVinte = 10 == 20;
		boolean isDezIgualDez = 10 == 10;
		boolean isDezDiferenteDeDez = 10 != 10;
		System.out.println("\n10 é maior que 20? " + isDezMaiorQueVinte);
		System.out.println("10 é menor que 20? " + isDezMenorQueVinte);
		System.out.println("10 é igual à 20? " + isDezIgualVinte);
		System.out.println("10 é igual à 10? " + isDezIgualDez);
		System.out.println("10 é diferente de 10? " + isDezDiferenteDeDez);
		
		// && (AND) || (OR) !
		int idade = 35;
		float salario = 3500F;
		boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
		boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3881;
		System.out.println("\nisDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
		System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
		
		double valorTotalContaCorrente = 200;
		double valorTotalContaPoupanca = 10000;
		float valorPlaystation = 5000F;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
		System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
		
		// = += -= /= %=
		double bonus = 1800; // 1800
		bonus += 1000; // 2800
		bonus -= 1000; // 1800
		bonus *= 2; // 3600
		bonus /= 2; // 900
		bonus %= 2; // 0
		System.out.println("\n" + bonus);
		
		int contador = 0;
		contador += 1; // contador = contador + 1
		contador++;
		contador--;
		++contador;
		--contador;
		System.out.println(contador);
	}
}
