
public class TesteArray {

	public static void main(String[] args) {
		
		Array arrayTeste = new Array(10);
		
		
		arrayTeste.adicionarElemento("Primeiro");
		arrayTeste.adicionarElemento("Segundo");
		arrayTeste.adicionarElemento("Terceiro");
		arrayTeste.adicionarElemento("Mais um");
		System.out.println(arrayTeste.toString());
		arrayTeste.recuperarElemento(3);
		System.out.println(arrayTeste.recuperarElemento("primeiro"));
	}

}
