package academy.devdojo.maratonajava.introducao;
/*
Prática

Criar variáveis para os campos descritos avaixo entre <> e imprimir a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
	public static void main(String[] args) {
		String nome = "Harry Potter";
		String endereco = "Rua dos Alfeneiros, nº 4";
		String dataRecebSalario = "21/08/2023";
	    double salario = 1300.00;
	    
	    // String relatorio = "Eu " + nome + ", morando no endereço " + endereco + " confirmo que recebi o salário de " + salario + " na data " + dataRecebSalario";
	    // System.out.println(relatorio);
	    
	    System.out.println("Eu " + nome + ", morando no endereço " + endereco + " confirmo que recebi o salário de " + salario + " na data " + dataRecebSalario);
	    System.out.println("Alteração para testar o github");
	}
}
