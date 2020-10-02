
public class Array extends AbsArray{

	public Array(int tamanho) {
		super(tamanho);
	}

	@Override
	protected void aumentarCapacidade() {
		if(tamanhoAtual == elementos.length) {
			String[] elementosNovo = new String[(int)(elementos.length * 2)];
			for(int i = 0; i < elementos.length; i++) {
				elementosNovo[i] = this.elementos[i];
			}
			elementos = elementosNovo;
		}
		
	}

}
