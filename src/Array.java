//import java.util.Arrays;

public class Array {
	
	private String[] elementos;
	private int tamanhoAtual;
	
	public Array(int tamanho) {
		this.elementos = new String[tamanho];
		tamanhoAtual = 0;
	}
	
	public boolean adicionarElemento(String elemento){
		if(tamanhoAtual < elementos.length) {
			elementos[tamanhoAtual] = elemento;
			tamanhoAtual++;
			return true;
		} 
		
		return false;
	}
	
	public int getTamanhoAtual() {
		return tamanhoAtual;
	}
	
	public boolean recuperarElemento(int posicao) {
		if(!(posicao > 0 && posicao < tamanhoAtual)) {
			return false;
		}
		System.out.println(elementos[posicao]);
		return true;
		
	}
	
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
