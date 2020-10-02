
public class ArrayFixo extends AbsArray{

	public ArrayFixo(int tamanho) {
		super(tamanho);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void aumentarCapacidade() {
		if(elementos.length == tamanhoAtual)
			System.out.println("Impossivel aumentar capacidade.");		
	}

}
