
public class Array50 extends AbsArray{

	public Array50(int tamanho) {
		super(tamanho);
	}
	
	@Override
	protected void aumentarCapacidade() {
		if(tamanhoAtual == elementos.length) {
			String[] elementosNovo = new String[(int)(elementos.length * 1.5)];
			for(int i = 0; i < elementos.length; i++) {
				elementosNovo[i] = this.elementos[i];
			}
			elementos = elementosNovo;
		}
		
	}


}
