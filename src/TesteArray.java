
public class TesteArray {

	public static void main(String[] args) {
		
		Array arrayTeste = new Array(5);
		
		
		arrayTeste.adicionarElemento("Primeiro");
		arrayTeste.adicionarElemento("Segundo");
		arrayTeste.adicionarElemento("Terceiro");
		arrayTeste.adicionarElemento("Quarto");
		System.out.println(arrayTeste.toString());
		arrayTeste.recuperarElemento(3);
		System.out.println(arrayTeste.recuperarElemento("primeiro"));
		
		arrayTeste.adicionarElemento("Intruso5", 2);
		arrayTeste.adicionarElemento("Intruso6", 5);
		System.out.println(arrayTeste.toString());
	}

}
