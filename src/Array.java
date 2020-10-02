//import java.util.Arrays;

public class Array {
	
	private String[] elementos;
	private int tamanhoAtual;
	
	public Array(int tamanho) {
		this.elementos = new String[tamanho];
		tamanhoAtual = 0;
	}
	
	//Adicionar ao fim do array
	public boolean adicionarElemento(String elemento){
		if(tamanhoAtual < elementos.length) {
			elementos[tamanhoAtual] = elemento;
			tamanhoAtual++;
			return true;
		} 
		
		return false;
	}
	
	public boolean adicionarElemento(String elemento, int posicao) {
		if(!(posicao >= 0 && posicao < tamanhoAtual) && tamanhoAtual < elementos.length) {
			return false;
		}
		
		for(int i = tamanhoAtual-1; i>=posicao; i--) {
			elementos[i+1] = elementos[i];
		}
		
		elementos[posicao] = elemento;
		tamanhoAtual++;
		
		return true;
	}
	
	//Conseguir o tamanho atual do vetor
	public int getTamanhoAtual() {
		return tamanhoAtual;
	}
	
	
	//Recuperar um Elemento 
	public boolean recuperarElemento(int posicao) {
		if(!(posicao >= 0 && posicao < tamanhoAtual)) {
			return false;
		}
		System.out.println(elementos[posicao]);
		return true;
		
	}
	
	public int recuperarElemento(String elemento) {
		for(int i = 0; i < tamanhoAtual; i++) {
			if(elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	//Mostrar todos os elementos
	@Override
	public String toString() {
		StringBuilder msg = new StringBuilder();
		msg.append("[");
		
		for(int i=0; i < tamanhoAtual-1; i++) {
			msg.append(elementos[i]);
			msg.append(", ");
		}
		
		if(tamanhoAtual > 0) {
			msg.append(elementos[tamanhoAtual-1]);
		}
		
		msg.append("]");
		
		return msg.toString();
	}
	
	
}
