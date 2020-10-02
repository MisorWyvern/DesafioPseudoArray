//import java.util.Arrays;

public abstract class AbsArray {
	
	private String[] elementos;
	private int tamanhoAtual;
	
	public AbsArray(int tamanho) {
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
	
	//Adiciona qualquer posicao
	public boolean adicionarElemento(String elemento, int posicao) {
		if(!(posicao >= 0 && posicao <= tamanhoAtual)) {
			return false;
		}
		
		aumentarCapacidade();
		
		for(int i = tamanhoAtual-1; i>=posicao; i--) {
			elementos[i+1] = elementos[i];
		}
		
		elementos[posicao] = elemento;
		tamanhoAtual++;
		
		return true;
	}
	
	private void aumentarCapacidade() {
		if(tamanhoAtual == elementos.length) {
			String[] elementosNovo = new String[elementos.length * 2];
			for(int i = 0; i < elementos.length; i++) {
				elementosNovo[i] = this.elementos[i];
			}
			elementos = elementosNovo;
		}
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
	
	//Remover um Elemento pela posicao
	public boolean removerElemento(int posicao) {
		if(!(posicao >= 0 && posicao < tamanhoAtual)) {
			return false;
		}
		
		for(int i = posicao; i < tamanhoAtual-1; i++) {
			elementos[i] = elementos[i+1];
		}
		
		tamanhoAtual--;
		return true;
	}
	
	//Remover pelo nome do elemento
	public boolean removerElemento(String elemento) {
		int pos = this.recuperarElemento(elemento);
		
		if(pos < 0) {
			return false;
		}
		
		this.removerElemento(pos);
		return true;
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
